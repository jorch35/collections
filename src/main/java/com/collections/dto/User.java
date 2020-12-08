package com.collections.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Class User.
 */
public class User{
	
	/** The id. */
	@JsonProperty("id")
	@JsonInclude(Include.NON_NULL)
    public String id;
	
	/** The updated at. */
	@JsonProperty("updated_at")
	@JsonInclude(Include.NON_NULL)
    public Date updated_at;
	
	/** The username. */
	@JsonProperty("username")
	@JsonInclude(Include.NON_NULL)
    public String username;
	
	/** The name. */
	@JsonProperty("name")
	@JsonInclude(Include.NON_NULL)
    public String name;
	
	/** The portfolio url. */
	@JsonProperty("portfolio_url")
	@JsonInclude(Include.NON_NULL)
    public String portfolio_url;
	
	/** The bio. */
	@JsonProperty("bio")
	@JsonInclude(Include.NON_NULL)
    public String bio;
	
	/** The location. */
	@JsonProperty("self")
	@JsonInclude(Include.NON_NULL)
    public String location;
	
	/** The total likes. */
	@JsonProperty("total_likes")
	@JsonInclude(Include.NON_NULL)
    public int total_likes;
	
	/** The total photos. */
	@JsonProperty("total_photos")
	@JsonInclude(Include.NON_NULL)
    public int total_photos;
	
	/** The total collections. */
	@JsonProperty("total_collections")
	@JsonInclude(Include.NON_NULL)
    public int total_collections;
	
	/** The profile image. */
	@JsonProperty("profile_image")
	@JsonInclude(Include.NON_NULL)
    public ProfileImage profile_image;
	
	/** The links. */
	@JsonProperty("links")
	@JsonInclude(Include.NON_NULL)
    public Links links;
}