package com.api.library.controller;

import com.api.library.dto.EmpruntDto;
import com.api.library.mapper.EmpruntMapper;
import com.api.library.service.contract.BookService;
import com.api.library.service.contract.EmpruntService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class EmpruntController {

    // ----------------- Injections de dépendances ----------------- //
    @Autowired
    private EmpruntService empruntService;

    // -----------------------------------------------------  //

    @GetMapping(value = "emprunt/{id}")
    public List<EmpruntDto> displayEmpruntByCustomer(@PathVariable("id") Long id){

        List<EmpruntDto> empruntDtos = empruntService.getEmpruntByIdCustomer(id);

        return empruntDtos;
    }
}
