/*******************************************************************************
 * Copyright (c) 2006-2010 eBay Inc. All Rights Reserved.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *******************************************************************************/
package org.ebayopensource.turmeric.tools.annoparser.exception;

/**
 * The Class ParserException.
 * This exception is thrown if the document supplied to parse is not valid.
 *
 * @author srengarajan
 */
public class ParserException extends WsdlDocException  {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/**
	 * Instantiates a new parser exception.
	 * 
	 * @param t
	 *            the t
	 */
	public ParserException(Throwable t) {
		super(t);
	}
	
	/**
	 * Instantiates a new parser exception.
	 *
	 * @param message the message
	 * @param t the t
	 */
	public ParserException(String message ,Throwable t) {
		
		super(message,t);
	}
	
	/**
	 * Instantiates a new parser exception.
	 *
	 * @param message the message
	 * @param t the t
	 */
	public ParserException(String message ) {
		
		super(message);
	}
}
