package com.api.library.mapper;

import com.api.library.dto.AppRoleDto;
import com.api.library.model.AppRole;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AppRoleMapper {

    AppRoleMapper INSTANCE = Mappers.getMapper(AppRoleMapper.class);
    AppRoleDto appRoleToAppRoleDto( AppRole appRole);
    AppRole appRoleDtoToAppRole ( AppRoleDto appRoleDto);
}
