/**
 * 
 */
package com.javaen.web;

import java.util.Collection;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.javaen.business.BookManagerService;
import com.javaen.domain.JavaBook;


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
 *   http://localhost:8080/myApiRest/javaBookManager/
 *   http://localhost:8080/myApiRest/javaBookManager/001
 *   
 *   ??
 *   http://localhost:8080/myApiRest/swagger-ui/index.html
 */

@Controller
@RequestMapping("/javaBookManager")
public class BookManagerController {
	
	static final Logger LOG = LoggerFactory.getLogger(BookManagerController.class);


	@Autowired BookManagerService bookManagerService;
	
	
	@ResponseBody
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public JavaBook get(@PathVariable String id) {
		
		LOG.debug("BookManagerController::get("+id+")");
		
		return bookManagerService.get(id);
	}
	
	@ResponseBody
	@RequestMapping(method=RequestMethod.GET)
	public Collection<JavaBook> select() {
		LOG.debug("BookManagerController::getAll()");
		
		return bookManagerService.getAll();
	}

	@RequestMapping(value="/{id}",method=RequestMethod.PUT)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void update(@PathVariable String id, @RequestBody JavaBook book) {
		
		LOG.debug("BookManagerController::update("+id+","+book+")");
		
		book.setId(id);
		bookManagerService.update(id, book);
	}

	
	@RequestMapping(method=RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public void add(@RequestBody JavaBook book, HttpServletResponse response) {
		
		LOG.debug("BookManagerController::add("+book+")");
		
		bookManagerService.add(book);
	}	

	

	
}
