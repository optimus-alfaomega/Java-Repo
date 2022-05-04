/**
 * 
 */
package com.javaen.business;

import junit.framework.TestCase;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.javaen.web.BookManagerController;

/**
 * @author [Pablo Ezequiel]
 *
 */
public class TestBookManagerService extends TestCase {
	
	static final Logger LOG = LoggerFactory.getLogger(BookManagerController.class);

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	protected void setUp() throws Exception {
		super.setUp();
	}

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#tearDown()
	 */
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	@Test 
	public void testBookManager() throws Exception {
		
		BookManagerService bm = new BookManagerServiceImpl();
		
		System.out.print("All Books: " + bm.getAll() );
	}
}
