package com.epita.hottakes.tpapihottakes.application;

import com.epita.hottakes.tpapihottakes.entite.UserHotTakes;
import com.epita.hottakes.tpapihottakes.exposition.dto.UserResponseDto;


public interface IUserService {
    String signUpUser(UserHotTakes u);
    UserHotTakes loginUser(String email, String password);
}
