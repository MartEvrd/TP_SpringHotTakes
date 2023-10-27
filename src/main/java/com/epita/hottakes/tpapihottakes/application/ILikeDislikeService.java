package com.epita.hottakes.tpapihottakes.application;

import com.epita.hottakes.tpapihottakes.entite.LikeDecision;
import com.epita.hottakes.tpapihottakes.entite.LikeDislike;

import java.util.List;

public interface ILikeDislikeService {

    String createLike(LikeDislike likeDislike);

    Long countLikeDislikeBySauce(Long sauceId, LikeDecision decision);

    String deleteLike(Long sauceId, Long userId);

    void deleteAllLike(Long sauceId);

    List<Long> getAllLikeDislikeUsers(Long sauceId, LikeDecision decision);
}
