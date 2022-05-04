/**
 * 
 */
package com.javaen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author [Pablo Ezequiel]
 *
 */
@Controller
public class HelloController {
	
	@RequestMapping("/helloController")
	public ModelAndView helloController() {
 
		String message = "<br>"
		        +"<div style='text-align:center;'>"
				+"<h2>Hola Mundo Spring MVC!</h2>"
				+"Mensaje del Controller de Spring"
				+"</div><br><br>";
		
		return new ModelAndView("respuesta", "message", message);
	}
}