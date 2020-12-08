package com.collections.client;

import java.util.Arrays;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * The Class CollectionsClientImpl.
 */
@Component
public class CollectionsClientImpl implements CollectionsClient{

	/**
	 * Gets the collections.
	 *
	 * @param page the page
	 * @return the collections
	 */
	public String getCollections(String page) {
	        RestTemplate plantilla = new RestTemplate();
	        HttpHeaders headers = new HttpHeaders();
	        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	        headers.setBearerAuth("eyJzY2hlbWEiOiJpZ2x1OmNvbS5zbm93cGxvd2FuYWx5dGljcy5zbm93cGxvdy9jb250ZXh0cy9qc29uc2NoZW1hLzEtMC0wIiwiZGF0YSI6W3sic2NoZW1hIjoiaWdsdTpjb20udW5zcGxhc2gvcGFnZV92aWV3X2RldGFpbHMvanNvbnNjaGVtYS8xLTAtMCIsImRhdGEiOnsiaXNJbml0aWFsIjp0cnVlfX1dfQ");
	        HttpEntity<String> entity = new HttpEntity<String>(headers);
	        ResponseEntity<String> response = plantilla.exchange("https://api.unsplash.com/collections", HttpMethod.GET, entity, String.class);
	       return "client";
//	        return  response.getBody();
	 
	        
	    
	}
}
