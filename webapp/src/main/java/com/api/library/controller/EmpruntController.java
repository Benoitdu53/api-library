package com.api.library.controller;

import com.api.library.dto.EmpruntDto;
import com.api.library.service.contract.EmpruntService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmpruntController {

    // ----------------- Injections de dépendances ----------------- //
    @Autowired
    private EmpruntService empruntService;

    // -----------------------------------------------------  //

    @GetMapping(value = "emprunts/{id}")
    public List<EmpruntDto> displayEmpruntByCustomer(@PathVariable("id") Long id){

        List<EmpruntDto> empruntDtos = empruntService.getEmpruntByIdCustomer(id);

        return empruntDtos;
    }
}
