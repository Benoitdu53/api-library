package com.api.library.service.contract;

import com.api.library.model.Emprunt;

import java.util.List;

public interface EmpruntService {

    // Récupère les emprunts par l'id de l'utilisateur
    List<Emprunt> getEmpruntById(Long id);

    // Modifie le isExtended pour ajouter une période de prêt
    void updateEmprunt(Long id);

    // Ajoute un emprunt
    Emprunt addEmprunt(Emprunt emprunt);

    // Supprime un emprunt
    void deleteEmprunt(Long id);
}
