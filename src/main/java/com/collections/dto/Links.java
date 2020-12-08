package com.collections.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

/**
 * The Class Links.
 */
@Getter
@Setter
public class Links{
	
	/** The self. */
	@JsonProperty("self")
	@JsonInclude(Include.NON_NULL)
    public String self;
	
	/** The html. */
	@JsonProperty("html")
	@JsonInclude(Include.NON_NULL)
    public String html;
	
	/** The photos. */
	@JsonProperty("photos")
	@JsonInclude(Include.NON_NULL)
    public String photos;
	
	/** The related. */
	@JsonProperty("related")
	@JsonInclude(Include.NON_NULL)
    public String related;
	
    /** The likes. */
    public String likes;
    
    /** The portfolio. */
    public String portfolio;
    
    /** The download. */
    public String download;
}

