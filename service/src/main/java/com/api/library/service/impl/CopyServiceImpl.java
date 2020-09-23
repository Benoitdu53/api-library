package com.api.library.service.impl;

import com.api.library.dto.CopyDto;
import com.api.library.mapper.CopyMapper;
import com.api.library.repository.CopyRepository;
import com.api.library.service.contract.CopyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CopyServiceImpl implements CopyService {

    // ----------------- Injections de dépendances ----------------- //
    @Autowired
    private CopyRepository copyRepository;

    // -----------------------------------------------------  //

    // Retourne les exemplaires selon l'id du livre et le nombre de dispo
    @Override
    public List<CopyDto> getCopyByIdBook(final Long id) {
        return CopyMapper.INSTANCE.map(copyRepository.getCopyByIdBook(id));
    }

    // Retourne l'exemplaire selon son id
    @Override
    public CopyDto getCopyById(final Long idCopy) {
        return CopyMapper.INSTANCE.copyToCopyDto(copyRepository.getCopyById(idCopy));
    }
}
