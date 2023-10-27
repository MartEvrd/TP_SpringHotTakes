package com.epita.hottakes.tpapihottakes.exposition.dto;

public class DecisionReceivedDto {

    private Long userId;
    private int like;

    public DecisionReceivedDto(Long userId, int like) {
        this.userId = userId;
        this.like = like;
    }

    public DecisionReceivedDto() {
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }
}
