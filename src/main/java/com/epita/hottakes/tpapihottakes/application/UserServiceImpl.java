package com.epita.hottakes.tpapihottakes.application;

import com.epita.hottakes.tpapihottakes.entite.UserHotTakes;
import com.epita.hottakes.tpapihottakes.exposition.dto.UserResponseDto;
import com.epita.hottakes.tpapihottakes.infrastructure.IUserRepo;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    IUserRepo userRepository;

    @Override
    public String signUpUser(UserHotTakes u) {
        userRepository.save(u);
        return("User Created");
    }

    @Override
    public UserHotTakes loginUser(String email, String password) {

        UserHotTakes user = userRepository.findByEmail(email);

        if (user == null){
            throw new ResponseStatusException(HttpStatusCode.valueOf(403), "Couple email/mdp inexistant");
        } else if (!(user.getPassword().equals(password))) {
            throw new ResponseStatusException(HttpStatusCode.valueOf(403), "Couple email/mdp inexistant");
        } else {
            return user;
        }
    }
}
