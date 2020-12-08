package com.collections.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Class Urls.
 */
public class Urls{
	
	/** The raw. */
	@JsonProperty("raw")
	@JsonInclude(Include.NON_NULL)
    public String raw;
	
	/** The full. */
	@JsonProperty("full")
	@JsonInclude(Include.NON_NULL)
    public String full;
	
	/** The regular. */
	@JsonProperty("regular")
	@JsonInclude(Include.NON_NULL)
    public String regular;
	
	/** The small. */
	@JsonProperty("small")
	@JsonInclude(Include.NON_NULL)
    public String small;
	
	/** The thumb. */
	@JsonProperty("thumb")
	@JsonInclude(Include.NON_NULL)
    public String thumb;
}