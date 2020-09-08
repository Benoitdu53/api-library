package com.api.library.service.impl;

import com.api.library.repository.CopyDao;
import com.api.library.service.contract.BookService;
import com.api.library.service.contract.CopyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CopyServiceImpl implements CopyService {

    // ----------------- Injections de dépendances ----------------- //
    @Autowired
    private CopyDao copyDao;

    // -----------------------------------------------------  //
}
