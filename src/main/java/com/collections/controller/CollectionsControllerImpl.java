package com.collections.controller;

import org.springframework.web.bind.annotation.RestController;

import com.collections.service.CollectionsService;

/**
 * The Class CollectionsControllerImpl.
 */
@RestController
public class CollectionsControllerImpl implements CollectionsController{
	     
	/** The collections service. */
	private CollectionsService collectionsService;
	
	    /**
    	 * Instantiates a new collections controller impl.
    	 *
    	 * @param collectionsService the collections service
    	 */
    	public CollectionsControllerImpl(CollectionsService collectionsService) {
		this.collectionsService = collectionsService;
	}

		/**
		 * Custom.
		 *
		 * @param page the page
		 * @return the string
		 */
		public String custom(String page) {
	        return collectionsService.custom(page);
	    }
}
