package com.api.library.service.contract;

import com.api.library.dto.CustomerDto;
import com.api.library.dto.EmpruntDto;
import com.api.library.model.Emprunt;

import java.util.List;

public interface EmpruntService {

    // Récupère les emprunts par l'id de l'utilisateur
    List<EmpruntDto> getEmpruntByIdCustomer(Long id);

    // Modifie le isExtended pour ajouter une période de prêt
    void updateEmprunt(Long id);

    // Ajoute un emprunt
    EmpruntDto addEmprunt(String format, String nameLibrary, CustomerDto customerDto );

    // Supprime un emprunt
    void deleteEmprunt(Long id);
}
