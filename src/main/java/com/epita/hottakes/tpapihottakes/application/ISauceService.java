package com.epita.hottakes.tpapihottakes.application;

import com.epita.hottakes.tpapihottakes.entite.Sauce;

import java.util.List;

public interface ISauceService {
    void createSauce(Sauce s);
    List<Sauce> getAllSauces();
    Sauce getOneSauce(Long sauceId);
    String updateSauce(Long sauceId, Sauce s);
    String deleteSauce(Long sauceId);
}
