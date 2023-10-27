package com.epita.hottakes.tpapihottakes.entite;

import jakarta.persistence.*;

@Entity
public class LikeDislike {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long likeId;

    @ManyToOne(fetch=FetchType.LAZY)
    private UserHotTakes user;

    @ManyToOne(fetch=FetchType.LAZY)
    private Sauce sauce;

    @Enumerated(EnumType.STRING)
    private LikeDecision decision;

    public LikeDislike(Long likeId, UserHotTakes user, Sauce sauce, LikeDecision decision) {
        this.likeId = likeId;
        this.user = user;
        this.sauce = sauce;
        this.decision = decision;
    }

    public LikeDislike() {
    }

    public Long getLikeId() {
        return likeId;
    }

    public void setLikeId(Long likeId) {
        this.likeId = likeId;
    }

    public UserHotTakes getUser() {
        return user;
    }

    public void setUser(UserHotTakes user) {
        this.user = user;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public void setSauce(Sauce sauce) {
        this.sauce = sauce;
    }

    public LikeDecision getDecision() {
        return decision;
    }

    public void setDecision(LikeDecision decision) {
        this.decision = decision;
    }
}
