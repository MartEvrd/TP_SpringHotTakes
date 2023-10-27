package com.epita.hottakes.tpapihottakes.infrastructure;

import com.epita.hottakes.tpapihottakes.entite.LikeDecision;
import com.epita.hottakes.tpapihottakes.entite.LikeDislike;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ILikeDislikeRepo extends CrudRepository<LikeDislike, Long> {

    Long countAllBySauce_SauceIdAndDecision(Long sauceId, LikeDecision decision);

    void deleteBySauce_SauceIdAndUser_UserId(Long sauceId, Long userId);

    void deleteAllBySauce_SauceId(Long SauceId);

    List<LikeDislike> findAllBySauce_SauceIdAndDecision(Long sauceId, LikeDecision decision);

}
