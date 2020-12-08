package com.collections.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

/**
 * The Class ProfileImage.
 */
@Getter
@Setter
public class ProfileImage {

	/** The small. */
	@JsonProperty("small")
	@JsonInclude(Include.NON_NULL)
    public String small;
	
	/** The medium. */
	@JsonProperty("medium")
	@JsonInclude(Include.NON_NULL)
    public String medium;
	
	/** The large. */
	@JsonProperty("large")
	@JsonInclude(Include.NON_NULL)
    public String large;

}
