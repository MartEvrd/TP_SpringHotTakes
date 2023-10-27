package com.epita.hottakes.tpapihottakes.exposition.api;

import com.epita.hottakes.tpapihottakes.application.IUserService;
import com.epita.hottakes.tpapihottakes.entite.UserHotTakes;
import com.epita.hottakes.tpapihottakes.exposition.converter.ConvertUserDto;
import com.epita.hottakes.tpapihottakes.exposition.dto.UserResponseDto;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/auth")
public class UserController {

    @Autowired
    IUserService userService;

    @PostMapping("/signup")
    public String signUpUser(@RequestBody UserHotTakes u){
        System.out.println("-----SIGN UP PROCESS-----");
        return userService.signUpUser(u);
    }

    @PostMapping("/login")
    public UserResponseDto loginUser(@RequestBody UserHotTakes u){
        System.out.println("-----LOGIN PROCESS-----");
        ConvertUserDto convert = new ConvertUserDto();
        UserHotTakes completeUser = userService.loginUser(u.getEmail(), u.getPassword());
        return convert.convertUserToUserResponseDto(completeUser);
    }



}
