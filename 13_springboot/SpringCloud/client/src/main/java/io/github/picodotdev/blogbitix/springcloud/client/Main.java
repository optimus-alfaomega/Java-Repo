package io.github.picodotdev.blogbitix.springcloud.client;

import io.micrometer.core.instrument.binder.hystrix.HystrixMetricsBinder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
@EnableCircuitBreaker
@EnableHystrixDashboard
public class Main implements CommandLineRunner {

	@Autowired
	private DefaultConfiguration configuration;

	@Autowired
	private ClientService service;

	@Autowired
	private ProxyService proxy;

	@Autowired
	private Resilience4jProxyService resilience4jProxy;

	/*
	@Bean
	HystrixMetricsBinder hystrixMetricsBinder() {
		return new HystrixMetricsBinder();
	}
	*/
    
	@Override
	public void run(String... args) throws Exception {
		System.out.printf("Valor de propiedad de configuración (%s): %s%n", "config.key", configuration.getKey());
		System.out.printf("Valor de propiedad de configuración (%s): %s%n", "config.password", configuration.getPassword());
		System.out.printf("Valor de propiedad de configuración (%s): %s%n", "config.service", configuration.getService());

		for (int i = 0; i < 20000; ++i) {
			String response = get();
			System.out.printf("Service response: %s%n", response);
			Thread.sleep(100);
		}
	}

	private String get() {
		switch (configuration.getService()) {
			case "service":
				return service.get();
			case "proxy":
				return proxy.get();
			case "resilience4jproxy":
				return resilience4jProxy.get();
			default:
				return "";
		}
	}

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(Main.class);
		application.setApplicationContextClass(AnnotationConfigApplicationContext.class);
		SpringApplication.run(Main.class, args);
	}
}
