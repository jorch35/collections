package com.collections.response;

import java.util.List;

import com.collections.dto.CollectionsDto;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

/**
 * The Class CollectionsResponse.
 */
@Getter
@Setter
public class CollectionsResponse {

	/** The collections. */
	@JsonProperty("Collections")
	@JsonInclude(Include.NON_NULL)
	private List<CollectionsDto> collections;
	
}
