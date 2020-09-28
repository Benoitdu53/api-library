package com.api.library.controller;

import com.api.library.dto.CustomerDto;
import com.api.library.dto.EmpruntDto;
import com.api.library.service.contract.EmpruntService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
public class EmpruntController {

    // ----------------- Injections de dépendances ----------------- //
    @Autowired
    private EmpruntService empruntService;

    // -----------------------------------------------------  //

    /**
     * Récupère la liste des prêts de l'utilisateur
     * @param id
     * @return
     */
    @GetMapping(value = "emprunts/{id}")
    public List<EmpruntDto> displayEmpruntByCustomer(@PathVariable("id") Long id){

        List<EmpruntDto> empruntDtos = empruntService.getEmpruntByIdCustomer(id);

        return empruntDtos;
    }

    /**
     * Ajoute un prêt
     * @param format
     * @param nameLibrary
     * @return
     */
    @PostMapping(value = "emprunt/add")
    EmpruntDto createEmprunt(@RequestParam(name = "format") String format,
                             @RequestParam(name = "nameLibrary") String nameLibrary,
                             CustomerDto customerDto){

        return empruntService.addEmprunt(format, nameLibrary, customerDto);
    }

    /**
     * Prolonge le pret
     * @param httpSession
     * @param idEmprunt
     */
    @GetMapping(value = "emprunt/extended/{idEmprunt}")
    void extendLoan(HttpSession httpSession,
                    @PathVariable("idEmprunt") Long idEmprunt ){
        empruntService.extendLoan(idEmprunt);
    }
}
