package com.epita.hottakes.tpapihottakes.application;

import com.epita.hottakes.tpapihottakes.entite.LikeDecision;
import com.epita.hottakes.tpapihottakes.entite.Sauce;
import com.epita.hottakes.tpapihottakes.infrastructure.ILikeDislikeRepo;
import com.epita.hottakes.tpapihottakes.infrastructure.ISauceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class SauceServiceImpl implements ISauceService {

    @Autowired
    ISauceRepo sauceRepository;

    @Autowired
    ILikeDislikeService likeDislikeService;

    @Override
    public void createSauce(Sauce s) {
        sauceRepository.save(s);
    }

    @Override
    public List<Sauce> getAllSauces() {
        return (List<Sauce>) sauceRepository.findAll();
    }

    @Override
    public Sauce getOneSauce(Long sauceId) {
        if(sauceRepository.findById(sauceId).isPresent()){
            Sauce s = sauceRepository.findById(sauceId).orElseThrow();
            s.setLikes(likeDislikeService.countLikeDislikeBySauce(sauceId, LikeDecision.LIKE));
            s.setDislikes(likeDislikeService.countLikeDislikeBySauce(sauceId, LikeDecision.DISLIKE));
            s.setUsersLiked(likeDislikeService.getAllLikeDislikeUsers(sauceId, LikeDecision.LIKE));
            s.setUsersDisliked(likeDislikeService.getAllLikeDislikeUsers(sauceId, LikeDecision.DISLIKE));
            return s;
        } else {
            throw new ResponseStatusException(HttpStatusCode.valueOf(404));
        }
    }

    @Override
    public String updateSauce(Long sauceId, Sauce s) {
        if(sauceRepository.findById(sauceId).isPresent()){
            sauceRepository.save(s);
            return ("Sauce n°"+sauceId+" modifiée");
        } else {
            return ("Sauce n°"+sauceId+" inexistante.");
        }
    }

    @Override
    public String deleteSauce(Long sauceId) {
        if(sauceRepository.findById(sauceId).isPresent()){
            likeDislikeService.deleteAllLike(sauceId);
            sauceRepository.deleteById(sauceId);
            return ("Sauce n°"+sauceId+" supprimée");
        } else {
            return ("Sauce n°"+sauceId+" inexistante.");
        }
    }
}