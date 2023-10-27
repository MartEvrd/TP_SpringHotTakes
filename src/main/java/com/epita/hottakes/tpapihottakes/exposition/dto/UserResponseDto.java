package com.epita.hottakes.tpapihottakes.exposition.dto;

public class UserResponseDto {
    private Long userId;
    private Long token;

    public UserResponseDto(Long userId, Long token) {
        this.userId = userId;
        this.token = token;
    }

    public UserResponseDto() {
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getToken() {
        return token;
    }

    public void setToken(Long token) {
        this.token = token;
    }
}
