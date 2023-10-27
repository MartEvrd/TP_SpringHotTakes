package com.epita.hottakes.tpapihottakes.exposition.dto;

import jakarta.persistence.Transient;

import java.util.List;

public class SauceOneDto {
    private Long sauceId;
    private Long userId;
    private String name;
    private String manufacturer;
    private String description;
    private String mainPepper;
    private String imageUrl;
    private int heat;
    private Long likes;
    private Long dislikes;
    private List<Long> usersLiked;
    private List<Long> usersDisliked;

    public SauceOneDto(Long sauceId, Long userId, String name, String manufacturer, String description, String mainPepper, String imageUrl, int heat, Long likes, Long dislikes, List<Long> usersLiked, List<Long> usersDisliked) {
        this.sauceId = sauceId;
        this.userId = userId;
        this.name = name;
        this.manufacturer = manufacturer;
        this.description = description;
        this.mainPepper = mainPepper;
        this.imageUrl = imageUrl;
        this.heat = heat;
        this.likes = likes;
        this.dislikes = dislikes;
        this.usersLiked = usersLiked;
        this.usersDisliked = usersDisliked;
    }

    public SauceOneDto() {
    }

    public Long getSauceId() {
        return sauceId;
    }

    public void setSauceId(Long sauceId) {
        this.sauceId = sauceId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMainPepper() {
        return mainPepper;
    }

    public void setMainPepper(String mainPepper) {
        this.mainPepper = mainPepper;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getHeat() {
        return heat;
    }

    public void setHeat(int heat) {
        this.heat = heat;
    }

    public Long getLikes() {
        return likes;
    }

    public void setLikes(Long likes) {
        this.likes = likes;
    }

    public Long getDislikes() {
        return dislikes;
    }

    public void setDislikes(Long dislikes) {
        this.dislikes = dislikes;
    }

    public List<Long> getUsersLiked() {
        return usersLiked;
    }

    public void setUsersLiked(List<Long> usersLiked) {
        this.usersLiked = usersLiked;
    }

    public List<Long> getUsersDisliked() {
        return usersDisliked;
    }

    public void setUsersDisliked(List<Long> usersDisliked) {
        this.usersDisliked = usersDisliked;
    }
}
