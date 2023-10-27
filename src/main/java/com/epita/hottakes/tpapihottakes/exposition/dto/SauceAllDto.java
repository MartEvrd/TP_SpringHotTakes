package com.epita.hottakes.tpapihottakes.exposition.dto;

public class SauceAllDto {
    private Long sauceId;
    private Long userId;
    private String name;
    private String imageUrl;
    private int heat;

    public SauceAllDto(Long sauceId, Long userId, String name, String imageUrl, int heat) {
        this.sauceId = sauceId;
        this.userId = userId;
        this.name = name;
        this.imageUrl = imageUrl;
        this.heat = heat;
    }

    public SauceAllDto() {
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
