package com.api.library.service.contract;

import com.api.library.dto.UserDto;
import com.api.library.model.User;

public interface UserService {

    // Ajouter un utilisateur
    UserDto createUser(UserDto userDto);

    // Authentification utilisateur
    User authentification(User user);
}
