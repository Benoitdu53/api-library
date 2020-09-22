package com.api.library.service.impl;

import com.api.library.dto.EmpruntDto;
import com.api.library.mapper.EmpruntMapper;
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

    /**
     * Récupère les prêts de l'utilisateur selon son id
     * @param id
     * @return
     */
    @Override
    public List<EmpruntDto> getEmpruntByIdCustomer(final Long id) {

        List<Emprunt> emprunts = empruntRepository.getEmpruntByIdCustomer(id);

        return EmpruntMapper.INSTANCE.map(emprunts);
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
