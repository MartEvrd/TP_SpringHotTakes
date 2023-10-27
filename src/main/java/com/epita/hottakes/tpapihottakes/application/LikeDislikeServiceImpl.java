package com.epita.hottakes.tpapihottakes.application;

import com.epita.hottakes.tpapihottakes.entite.LikeDecision;
import com.epita.hottakes.tpapihottakes.entite.LikeDislike;
import com.epita.hottakes.tpapihottakes.infrastructure.ILikeDislikeRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class LikeDislikeServiceImpl implements ILikeDislikeService {

    @Autowired
    ILikeDislikeRepo likeDislikeRepository;

    @Override
    public String createLike(LikeDislike likeDislike) {
        likeDislikeRepository.save(likeDislike);
        return("Decision registered");
    }

    @Override
    public Long countLikeDislikeBySauce(Long sauceId, LikeDecision decision) {
        return likeDislikeRepository.countAllBySauce_SauceIdAndDecision(sauceId, decision);
    }

    @Override
    @Transactional
    public String deleteLike(Long sauceId, Long userId) {
        likeDislikeRepository.deleteBySauce_SauceIdAndUser_UserId(sauceId, userId);
        return("Decision deleted");
    }

    @Override
    @Transactional
    public void deleteAllLike(Long sauceId) {
        likeDislikeRepository.deleteAllBySauce_SauceId(sauceId);
    }

    @Override
    public List<Long> getAllLikeDislikeUsers(Long sauceId, LikeDecision decision) {
        List<LikeDislike> listLikeDislikeInBase = new ArrayList<>();
        List<Long> listUserId = new ArrayList<>();
        listLikeDislikeInBase = likeDislikeRepository.findAllBySauce_SauceIdAndDecision(sauceId, decision);
        return listUserId = listLikeDislikeInBase.stream()
                .map(u -> u.getUser().getUserId())
                .collect(Collectors.toList());
    }
}