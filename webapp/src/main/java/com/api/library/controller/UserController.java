package com.api.library.controller;

import com.api.library.service.contract.BookService;
import com.api.library.service.contract.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    // ----------------- Injections de dépendances ----------------- //
    @Autowired
    private UserService userService;

    // -----------------------------------------------------  //
}
