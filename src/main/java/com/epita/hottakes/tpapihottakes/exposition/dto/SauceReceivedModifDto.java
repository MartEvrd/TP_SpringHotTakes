package com.epita.hottakes.tpapihottakes.exposition.dto;

public class SauceReceivedModifDto {
    private Long sauceId;
    private Long userId;
    private String name;
    private String manufacturer;
    private String description;
    private String mainPepper;
    private String imageUrl;
    private int heat;

    public SauceReceivedModifDto(Long sauceId, Long userId, String name, String manufacturer, String description, String mainPepper, String imageUrl, int heat, int likes, int dislikes) {
        this.sauceId = sauceId;
        this.userId = userId;
        this.name = name;
        this.manufacturer = manufacturer;
        this.description = description;
        this.mainPepper = mainPepper;
        this.imageUrl = imageUrl;
        this.heat = heat;
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
}
