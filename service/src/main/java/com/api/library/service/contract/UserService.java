package com.api.library.service.contract;

import com.api.library.model.User;

public interface UserService {

    // Ajouter un utilisateur
    User addUser(User user);

    // Authentification utilisateur
    User authentification(User user);
}
