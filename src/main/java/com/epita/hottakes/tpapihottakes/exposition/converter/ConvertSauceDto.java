package com.epita.hottakes.tpapihottakes.exposition.converter;

import com.epita.hottakes.tpapihottakes.entite.Sauce;
import com.epita.hottakes.tpapihottakes.entite.UserHotTakes;
import com.epita.hottakes.tpapihottakes.exposition.dto.SauceAllDto;
import com.epita.hottakes.tpapihottakes.exposition.dto.SauceOneDto;
import com.epita.hottakes.tpapihottakes.exposition.dto.SauceReceivedDto;
import com.epita.hottakes.tpapihottakes.exposition.dto.SauceReceivedModifDto;

import java.util.List;

public class ConvertSauceDto {

    public Sauce convertSauceReceivedDtoToSauce(SauceReceivedDto sPost){
        Sauce sauce = new Sauce();
        UserHotTakes user = new UserHotTakes();
        user.setUserId(sPost.getUserId());
        sauce.setName(sPost.getName());
        sauce.setManufacturer(sPost.getManufacturer());
        sauce.setDescription(sPost.getDescription());
        sauce.setMainPepper(sPost.getMainPepper());
        sauce.setImageUrl(sPost.getImageUrl());
        sauce.setHeat(sPost.getHeat());
        sauce.setUserHotTakes(user);

        return sauce;
    }

    public SauceAllDto convertSauceToSauceAllDto(Sauce s){
        SauceAllDto sdto = new SauceAllDto(
                s.getSauceId(),
                s.getUserHotTakes().getUserId(),
                s.getName(),
                s.getImageUrl(),
                s.getHeat());
        return sdto;
    }

    public SauceOneDto convertSauceToSauceOneDto(Sauce s){
        SauceOneDto sdto = new SauceOneDto(
                s.getSauceId(),
                s.getUserHotTakes().getUserId(),
                s.getName(),
                s.getManufacturer(),
                s.getDescription(),
                s.getMainPepper(),
                s.getImageUrl(),
                s.getHeat(),
                s.getLikes(),
                s.getDislikes(),
                s.getUsersLiked(),
                s.getUsersDisliked());
        return sdto;
    }

    public Sauce convertSauceReceivedModifDtoToSauce(Long sauceId, SauceReceivedModifDto sPost){
        Sauce sauce = new Sauce();
        UserHotTakes user = new UserHotTakes();
        user.setUserId(sPost.getUserId());
        sauce.setSauceId(sauceId); //Rajout de l'ID essentiel pour la modif
        sauce.setName(sPost.getName());
        sauce.setManufacturer(sPost.getManufacturer());
        sauce.setDescription(sPost.getDescription());
        sauce.setMainPepper(sPost.getMainPepper());
        sauce.setImageUrl(sPost.getImageUrl());
        sauce.setHeat(sPost.getHeat());
        sauce.setUserHotTakes(user);

        return sauce;
    }

}
