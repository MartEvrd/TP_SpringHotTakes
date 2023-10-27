package com.epita.hottakes.tpapihottakes.exposition.converter;

import com.epita.hottakes.tpapihottakes.entite.LikeDecision;
import com.epita.hottakes.tpapihottakes.entite.LikeDislike;
import com.epita.hottakes.tpapihottakes.entite.Sauce;
import com.epita.hottakes.tpapihottakes.entite.UserHotTakes;
import com.epita.hottakes.tpapihottakes.exposition.dto.DecisionReceivedDto;

public class ConvertLikeDislikeDto {

    public LikeDislike convertDecisionReceivedDtoToLikeDislike(Long sauceId, DecisionReceivedDto dDto){
        LikeDislike ld = new LikeDislike();
        UserHotTakes user = new UserHotTakes();
        Sauce s = new Sauce();

        user.setUserId(dDto.getUserId());
        s.setSauceId(sauceId);
        ld.setSauce(s);
        ld.setUser(user);

        System.out.println("decision transmise à l'API : "+dDto.getLike());

        switch (dDto.getLike()) {
            case 1 -> ld.setDecision(LikeDecision.LIKE);
            case -1 -> ld.setDecision(LikeDecision.DISLIKE);
        }
        System.out.println("decision finale : "+ld.getDecision());
        return ld;

    }

}
