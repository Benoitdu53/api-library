package com.api.library.service.contract;

import com.api.library.dto.AppRoleDto;
import com.api.library.dto.CustomerDto;

public interface RoleService {

    // Ajoute un role
    AppRoleDto saveRole(AppRoleDto appRoleDto);
    //Ajoute un role au client
    void addRoleToCustomer(CustomerDto customerDto, String rolename);
}
