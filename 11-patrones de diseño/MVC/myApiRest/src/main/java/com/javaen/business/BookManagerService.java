/**
 * 
 */
package com.javaen.business;

import java.util.Collection;

import com.javaen.domain.JavaBook;

/**
 * @author [Pablo Ezequiel]
 *
 */
public interface BookManagerService {
	
	public Collection<JavaBook> getAll();
	
	public JavaBook get(String id);
	
	public JavaBook add(JavaBook book);
	
	public JavaBook update(String bookId, JavaBook book);

}
