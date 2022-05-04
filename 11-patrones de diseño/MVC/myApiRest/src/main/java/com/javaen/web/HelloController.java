package com.javaen.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author [Pablo Ezequiel]
 *
 * REST API Book Manager
 * 
 *  - getAll
 *  - {id}
 *  - update (string, book)
 *  - add() 
 * 
 *   http://localhost:8080/myApiRest/helloController/
 */

@Controller
@RequestMapping("/helloController")
public class HelloController {

	static final Logger LOG = LoggerFactory.getLogger(HelloController.class);
	
	@ResponseBody
	@RequestMapping(method=RequestMethod.GET)
	public String testHello() {
		
		LOG.debug("HelloController::testHello()");
		
		return "Hola";
	}
}
