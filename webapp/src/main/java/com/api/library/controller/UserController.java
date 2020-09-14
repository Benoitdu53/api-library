package com.api.library.controller;

import com.api.library.dto.UserDto;
import com.api.library.mapper.UserMapper;
import com.api.library.model.User;
import com.api.library.service.contract.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    // ----------------- Injections de dépendances ----------------- //
    @Autowired
    private UserService userService;

    // -----------------------------------------------------  //

    @PostMapping("users")
    public UserDto createUser(@RequestBody UserDto userDto){

        return userService.createUser(userDto);
    }
}
