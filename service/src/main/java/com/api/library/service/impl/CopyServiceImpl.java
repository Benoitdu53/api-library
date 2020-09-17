package com.api.library.service.impl;

import com.api.library.repository.CopyRepository;
import com.api.library.service.contract.CopyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CopyServiceImpl implements CopyService {

    // ----------------- Injections de dépendances ----------------- //
    @Autowired
    private CopyRepository copyRepository;

    // -----------------------------------------------------  //
}
