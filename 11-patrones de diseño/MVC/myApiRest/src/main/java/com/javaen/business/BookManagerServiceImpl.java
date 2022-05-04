/**
 * 
 */
package com.javaen.business;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.javaen.domain.JavaBook;



/**
 * @author [Pablo Ezequiel]
 *
 */
@Service
public class BookManagerServiceImpl implements BookManagerService {

	static final Logger LOG = LoggerFactory.getLogger(BookManagerServiceImpl.class);

	
	private Map<String, JavaBook> myBooks = new HashMap<String, JavaBook>();


	public BookManagerServiceImpl() {
		
		LOG.debug("BookManagerServiceImpl::Constructor");
		
		JavaBook book1 = new JavaBook("001", "ANTOINE DE SAINT",       "EL PRINCIPITO",         "Estrada",  "2015");
		JavaBook book2 = new JavaBook("002", "ProbarNoCuestaNada.com", "Google Al Descubierto", "O'Reilly", "2015");
		JavaBook book3 = new JavaBook("003", "ProbarNoCuestaNada.com", "GoogleAppsScript in Action", "Manning",  "2013");
		JavaBook book4 = new JavaBook("004", "@no_cuestanada",         "Java And Swagger for Dummies", "Willey",  "2013");
		
		myBooks.put(book1.getId(), book1);
		myBooks.put(book2.getId(), book2);
		myBooks.put(book3.getId(), book3);
		myBooks.put(book4.getId(), book4);
		
	}
	
	/* (non-Javadoc)
	 * @see com.javaen.business.BookManagerService#select()
	 */
	@Override
	public Collection<JavaBook> getAll() {
		
		LOG.debug("BookManagerServiceImpl::getAll()");
		
		return myBooks.values();
	}

	/* (non-Javadoc)
	 * @see com.javaen.business.BookManagerService#get(java.lang.Long)
	 */
	@Override
	public JavaBook get(String id) {
		
		LOG.debug("BookManagerServiceImpl::get("+id+")");
		
		return  myBooks.get(id);
	}

	/* (non-Javadoc)
	 * @see com.javaen.business.BookManagerService#add(com.javaen.domain.Book)
	 */
	@Override
	public JavaBook add(JavaBook book) {
		
		LOG.debug("BookManagerServiceImpl::add("+book+")");
		
		return myBooks.put(book.getId(), book);
	}

	/* (non-Javadoc)
	 * @see com.javaen.business.BookManagerService#update(com.javaen.domain.Book)
	 */
	@Override
	public JavaBook update(String bookId, JavaBook book) {
		
		LOG.debug("BookManagerServiceImpl::update("+bookId+","+book+")");
		
		return myBooks.put(bookId, book);
	}

}
