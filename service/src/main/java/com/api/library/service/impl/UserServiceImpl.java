package com.api.library.service.impl;

import com.api.library.dto.UserDto;
import com.api.library.mapper.UserMapper;
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
    public UserDto createUser(final UserDto userDto) {

        User user = UserMapper.INSTANCE.userDtoToUser(userDto);
        user = userDao.save(user);

        return UserMapper.INSTANCE.userToUserDto(user);
    }

    @Override
    public User authentification(final User user) {
        return null;
    }
}
