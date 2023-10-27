package com.epita.hottakes.tpapihottakes.exposition.api;

import com.epita.hottakes.tpapihottakes.application.ILikeDislikeService;
import com.epita.hottakes.tpapihottakes.application.ISauceService;
import com.epita.hottakes.tpapihottakes.entite.Sauce;
import com.epita.hottakes.tpapihottakes.exposition.converter.ConvertLikeDislikeDto;
import com.epita.hottakes.tpapihottakes.exposition.converter.ConvertSauceDto;
import com.epita.hottakes.tpapihottakes.exposition.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/sauces")
public class SauceController {

    @Autowired
    ISauceService sauceService;
    @Autowired
    ILikeDislikeService decisionService;

    @PostMapping
    public void createSauce(@RequestBody SauceReceivedDto sdto){
        ConvertSauceDto convert = new ConvertSauceDto();
        sauceService.createSauce(convert.convertSauceReceivedDtoToSauce(sdto));
    }

    @GetMapping
    public List<SauceAllDto> getAllSauces(){
        ConvertSauceDto convert = new ConvertSauceDto();
        List<Sauce> listAllSauces = sauceService.getAllSauces();
        List<SauceAllDto> listAllSaucesDto =new ArrayList<>();
        for(Sauce s : listAllSauces){
            listAllSaucesDto.add(convert.convertSauceToSauceAllDto(s));
        }
        return listAllSaucesDto;
    }

    @GetMapping("/{id}")
    public SauceOneDto getOneSauce(@PathVariable("id") Long sauceId){
        ConvertSauceDto convert = new ConvertSauceDto();
        Sauce s = sauceService.getOneSauce(sauceId);
        return convert.convertSauceToSauceOneDto(s);
    }

    @PutMapping("/:{id}")
    public String updateSauce(@PathVariable("id") Long sauceId, @RequestBody SauceReceivedModifDto smDto){
        ConvertSauceDto convert = new ConvertSauceDto();
        return sauceService.updateSauce(sauceId, convert.convertSauceReceivedModifDtoToSauce(sauceId, smDto));
    }

    @DeleteMapping("/:{id}")
    public String deleteSauce(@PathVariable("id") Long sauceId){
        return sauceService.deleteSauce(sauceId);
    }


//    -> MANIPULATION DES LIKE/DISLIKE
    @PostMapping(":{id}/like")
    public String createLike(@PathVariable("id") Long sauceId, @RequestBody DecisionReceivedDto dDto){
        ConvertLikeDislikeDto convert = new ConvertLikeDislikeDto();
        if(dDto.getLike()==0){
            return decisionService.deleteLike(sauceId, dDto.getUserId());
        } else if (dDto.getLike() == 1 || dDto.getLike() == -1){
            return decisionService.createLike(convert.convertDecisionReceivedDtoToLikeDislike(sauceId, dDto));
        } else {
            throw new ResponseStatusException(HttpStatusCode.valueOf(400), "Like code invalid, must be 1, 0 or -1");
        }
    }
}