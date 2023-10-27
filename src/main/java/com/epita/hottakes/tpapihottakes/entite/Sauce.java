package com.epita.hottakes.tpapihottakes.entite;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Sauce {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sauceId;

    @ManyToOne(fetch=FetchType.LAZY)
    private UserHotTakes userHotTakes;

    private String name;
    private String manufacturer;
    private String description;
    private String mainPepper;
    private String imageUrl;
    private int heat;
    @Transient
    private Long likes;
    @Transient
    private Long dislikes;
    @Transient
    private List<Long> usersLiked;
    @Transient
    private List<Long> usersDisliked;

    public Sauce(Long sauceId, UserHotTakes userHotTakes, String name, String manufacturer, String description, String mainPepper, String imageUrl, int heat, Long likes, Long dislikes, List<Long> usersLiked, List<Long> usersDisliked) {
        this.sauceId = sauceId;
        this.userHotTakes = userHotTakes;
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

    public Sauce() {
    }

    public Long getSauceId() {
        return sauceId;
    }

    public void setSauceId(Long sauceId) {
        this.sauceId = sauceId;
    }

    public UserHotTakes getUserHotTakes() {
        return userHotTakes;
    }

    public void setUserHotTakes(UserHotTakes userHotTakes) {
        this.userHotTakes = userHotTakes;
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
