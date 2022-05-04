package io.github.picodotdev.blogbitix.quarkus;

import io.vertx.core.http.HttpHeaders;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.LanguageHeader;
import io.vertx.ext.web.handler.TemplateHandler;
import io.vertx.ext.web.impl.Utils;
import io.vertx.ext.web.common.template.TemplateEngine;
import io.vertx.ext.web.RoutingContext;

import java.util.Locale;

public class TemplateHandlerImpl implements TemplateHandler {

  private final TemplateEngine engine;
  private final String templateDirectory;
  private final String contentType;
  private String indexTemplate;

  public TemplateHandlerImpl(TemplateEngine engine, String templateDirectory, String contentType) {
    this.engine = engine;
    this.templateDirectory = templateDirectory == null || templateDirectory.isEmpty() ? "." : templateDirectory;
    this.contentType = contentType;
    this.indexTemplate = DEFAULT_INDEX_TEMPLATE;
  }

  @Override
  public void handle(RoutingContext context) {
    String file = context.normalisedPath();
    if (file.endsWith("/") && null != indexTemplate) {
      file += indexTemplate;
    }
    // files are always normalized (start with /)
    // however if there's no base strip / to avoid making the path absolute
    if (templateDirectory == null || "".equals(templateDirectory)) {
      // strip the leading slash from the filename
      file = file.substring(1);
    }
    // put the locale if present and not on the context yet into the context.
    if (!context.data().containsKey("lang")) {
      for (LanguageHeader acceptableLocale : context.acceptableLanguages()) {
        try {
          Locale.forLanguageTag(acceptableLocale.value());
        } catch (RuntimeException e) {
          // we couldn't parse the locale so it's not valid or unknown
          continue;
        }
        context.data().put("lang", acceptableLocale.value());
        break;
      }
    }
    // render using the engine
    engine.render(new JsonObject(context.data()), templateDirectory + file, res -> {
      if (res.succeeded()) {
        context.response().putHeader(HttpHeaders.CONTENT_TYPE, contentType).end(res.result());
      } else {
        context.fail(res.cause());
      }
    });
  }

  @Override
  public TemplateHandler setIndexTemplate(String indexTemplate) {
    this.indexTemplate = indexTemplate;
    return this;
  }
}
