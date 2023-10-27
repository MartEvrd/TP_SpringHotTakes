package com.epita.hottakes.tpapihottakes.exposition.converter;

import com.epita.hottakes.tpapihottakes.entite.UserHotTakes;
import com.epita.hottakes.tpapihottakes.exposition.dto.UserResponseDto;

public class ConvertUserDto {

    public UserResponseDto convertUserToUserResponseDto(UserHotTakes u){
        UserResponseDto udto = new UserResponseDto();
        udto.setUserId(u.getUserId());
//        TODO - Remplacer par le token une fois la fonctionnalité implémentée
        udto.setToken(u.getUserId());
        return udto;
    }

}
