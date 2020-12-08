package com.collections.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

/**
 * The Class CollectionsDto.
 */
@Getter
@Setter
public class CollectionsDto {

	/** The id. */
	@JsonProperty("id")
	@JsonInclude(Include.NON_NULL)
	private String id;
	
	/** The title. */
	@JsonProperty("title")
	@JsonInclude(Include.NON_NULL)
    public String title;
	
	/** The description. */
	@JsonProperty("description")
	@JsonInclude(Include.NON_NULL)
    public String description;
	
	/** The published at. */
	@JsonProperty("published_at")
	@JsonInclude(Include.NON_NULL)
    public Date published_at;
	
	/** The last collected at. */
	@JsonProperty("last_collected_at")
	@JsonInclude(Include.NON_NULL)
    public Date last_collected_at;
	
	/** The updated at. */
	@JsonProperty("updated_at")
	@JsonInclude(Include.NON_NULL)
    public Date updated_at;
	
	/** The total photos. */
	@JsonProperty("total_photos")
	@JsonInclude(Include.NON_NULL)
    public int total_photos;
	
	/** The share key. */
	@JsonProperty("share_key")
	@JsonInclude(Include.NON_NULL)
    public String share_key;
	
	/** The cover photo. */
	@JsonProperty("cover_photo")
	@JsonInclude(Include.NON_NULL)
    public CoverPhoto cover_photo;
	
	/** The user. */
	@JsonProperty("user")
	@JsonInclude(Include.NON_NULL)
    public User user;
	
	/** The links. */
	@JsonProperty("links")
	@JsonInclude(Include.NON_NULL)
    public Links links;
	
}