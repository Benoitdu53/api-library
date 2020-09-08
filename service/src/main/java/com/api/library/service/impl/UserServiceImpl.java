package com.api.library.service.impl;

import com.api.library.model.User;
import com.api.library.repository.UserDao;
import com.api.library.service.contract.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    // ----------------- Injections de dépendances ----------------- //
    @Autowired
    private UserDao userDao;

    // -----------------------------------------------------  //

    @Override
    public User addUser(final User user) {
        return null;
    }

    @Override
    public User authentification(final User user) {
        return null;
    }
}
