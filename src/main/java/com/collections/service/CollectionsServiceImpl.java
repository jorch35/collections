package com.collections.service;

import org.springframework.stereotype.Service;

import com.collections.client.CollectionsClient;

/**
 * The Class CollectionsServiceImpl.
 */
@Service
public class CollectionsServiceImpl implements CollectionsService{

	/** The collections client. */
	private CollectionsClient collectionsClient;
	
	
	/**
	 * Instantiates a new collections service impl.
	 *
	 * @param collectionsClient the collections client
	 */
	public CollectionsServiceImpl(CollectionsClient collectionsClient) {
		this.collectionsClient = collectionsClient;
	}


	/**
	 * Custom.
	 *
	 * @param filter the filter
	 * @return the string
	 */
	@Override
	public String custom(String filter) {
		return collectionsClient.getCollections(filter);
	}

	
}
