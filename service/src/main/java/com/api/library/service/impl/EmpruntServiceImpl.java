package com.api.library.service.impl;

import com.api.library.model.Emprunt;
import com.api.library.repository.EmpruntRepository;
import com.api.library.service.contract.EmpruntService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpruntServiceImpl implements EmpruntService {

    // ----------------- Injections de dépendances ----------------- //
    @Autowired
    private EmpruntRepository empruntRepository;

    // -----------------------------------------------------  //


    @Override
    public List<Emprunt> getEmpruntById(final Long id) {
        return null;
    }

    @Override
    public void updateEmprunt(final Long id) {

    }

    @Override
    public Emprunt addEmprunt(final Emprunt emprunt) {
        return null;
    }

    @Override
    public void deleteEmprunt(final Long id) {

    }
}
