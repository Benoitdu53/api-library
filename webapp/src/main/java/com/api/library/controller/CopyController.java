package com.api.library.controller;

import com.api.library.service.contract.CopyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class CopyController {

    // ----------------- Injections de dépendances ----------------- //
    @Autowired
    private CopyService copyService;

    // -----------------------------------------------------  //
}
