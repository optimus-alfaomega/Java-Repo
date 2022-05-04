package com.javaen.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author [Pablo Ezequiel]
 *
 * REST API Book Manager
 * 
 *   http://localhost:8080/myApiRest/helloController_test/
 *   
 */

@Controller
public class HelloController2 {

	static final Logger LOG = LoggerFactory.getLogger(HelloController2.class);
	
	@ResponseBody
	@RequestMapping("/helloController2")
	public String testHello() {
		
		LOG.debug("HelloControlle2r::testHello()");
		
		return "Hola";
	}
	
	
	@RequestMapping(value="/helloController_test/")
	public String simplePattern(){

	  System.out.println("simplePattern method was called");
	  return "test";

	}
}
