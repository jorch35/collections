package com.collections.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Class CoverPhoto.
 */
public class CoverPhoto{
	
	/** The id. */
	@JsonProperty("id")
	@JsonInclude(Include.NON_NULL)
    public String id;
	
	/** The width. */
	@JsonProperty("width")
	@JsonInclude(Include.NON_NULL)
    public int width;
	
	/** The height. */
	@JsonProperty("height")
	@JsonInclude(Include.NON_NULL)
    public int height;
	
	/** The color. */
	@JsonProperty("color")
	@JsonInclude(Include.NON_NULL)
    public String color;
	
	/** The blur hash. */
	@JsonProperty("blur_hash")
	@JsonInclude(Include.NON_NULL)
    public String blur_hash;
	
	/** The likes. */
	@JsonProperty("likes")
	@JsonInclude(Include.NON_NULL)
    public int likes;
	
	/** The liked by user. */
	@JsonProperty("liked_by_user")
	@JsonInclude(Include.NON_NULL)
    public boolean liked_by_user;
	
	/** The description. */
	@JsonProperty("description")
	@JsonInclude(Include.NON_NULL)
    public String description;
	
	/** The user. */
	@JsonProperty("user")
	@JsonInclude(Include.NON_NULL)
    public User user;
	
	/** The urls. */
	@JsonProperty("urls")
	@JsonInclude(Include.NON_NULL)
    public Urls urls;
	
	/** The links. */
	@JsonProperty("links")
	@JsonInclude(Include.NON_NULL)
    public Links links;
}
