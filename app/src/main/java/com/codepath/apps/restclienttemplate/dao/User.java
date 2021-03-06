package com.codepath.apps.restclienttemplate.dao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table USER.
 */
public class User {

    private Long internalId;
    private Long id;
    private String name;
    private String screen_name;
    private String profile_image_url;
    private String location;
    private Integer followers_count;
    private Integer favourites_count;
    private Integer listed_count;
    private String profile_background_image_url;

    public User() {
    }

    public User(Long internalId) {
        this.internalId = internalId;
    }

    public User(Long internalId, Long id, String name, String screen_name, String profile_image_url, String location, Integer followers_count, Integer favourites_count, Integer listed_count, String profile_background_image_url) {
        this.internalId = internalId;
        this.id = id;
        this.name = name;
        this.screen_name = screen_name;
        this.profile_image_url = profile_image_url;
        this.location = location;
        this.followers_count = followers_count;
        this.favourites_count = favourites_count;
        this.listed_count = listed_count;
        this.profile_background_image_url = profile_background_image_url;
    }

    public Long getInternalId() {
        return internalId;
    }

    public void setInternalId(Long internalId) {
        this.internalId = internalId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScreen_name() {
        return screen_name;
    }

    public void setScreen_name(String screen_name) {
        this.screen_name = screen_name;
    }

    public String getProfile_image_url() {
        return profile_image_url;
    }

    public void setProfile_image_url(String profile_image_url) {
        this.profile_image_url = profile_image_url;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getFollowers_count() {
        return followers_count;
    }

    public void setFollowers_count(Integer followers_count) {
        this.followers_count = followers_count;
    }

    public Integer getFavourites_count() {
        return favourites_count;
    }

    public void setFavourites_count(Integer favourites_count) {
        this.favourites_count = favourites_count;
    }

    public Integer getListed_count() {
        return listed_count;
    }

    public void setListed_count(Integer listed_count) {
        this.listed_count = listed_count;
    }

    public String getProfile_background_image_url() {
        return profile_background_image_url;
    }

    public void setProfile_background_image_url(String profile_background_image_url) {
        this.profile_background_image_url = profile_background_image_url;
    }

}
