package com.collections.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * The Interface CollectionsController.
 */
@RestController
public interface CollectionsController {

	/**
	 * Custom.
	 *
	 * @param page the page
	 * @return the string
	 */
	@RequestMapping(value="/collection/{page}", method=RequestMethod.GET)
	String custom(@PathVariable String page);
	
}
