package com.api.library.mapper;

import com.api.library.dto.UserDto;
import com.api.library.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserDto userToUserDto( User user);
    User userDtoToUser(UserDto userDto);

}
