package com.api.library.mapper;

import com.api.library.dto.AppRoleDto;
import com.api.library.model.AppRole;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-09-17T11:46:47+0200",
    comments = "version: 1.3.0.Beta2, compiler: javac, environment: Java 11.0.8 (Ubuntu)"
)
public class AppRoleMapperImpl implements AppRoleMapper {

    @Override
    public AppRoleDto appRoleToAppRoleDto(AppRole appRole) {
        if ( appRole == null ) {
            return null;
        }

        AppRoleDto appRoleDto = new AppRoleDto();

        appRoleDto.setId( appRole.getId() );
        appRoleDto.setRoleName( appRole.getRoleName() );

        return appRoleDto;
    }

    @Override
    public AppRole appRoleDtoToAppRole(AppRoleDto appRoleDto) {
        if ( appRoleDto == null ) {
            return null;
        }

        AppRole appRole = new AppRole();

        appRole.setId( appRoleDto.getId() );
        appRole.setRoleName( appRoleDto.getRoleName() );

        return appRole;
    }
}
