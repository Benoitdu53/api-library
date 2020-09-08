package com.api.library.controller;

import com.api.library.service.contract.BookService;
import com.api.library.service.contract.EmpruntService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class EmpruntController {

    // ----------------- Injections de dépendances ----------------- //
    @Autowired
    private EmpruntService empruntService;

    // -----------------------------------------------------  //
}
