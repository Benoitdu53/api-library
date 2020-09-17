package com.api.library.service.impl;

import com.api.library.dto.AppRoleDto;
import com.api.library.dto.CustomerDto;
import com.api.library.mapper.AppRoleMapper;
import com.api.library.model.AppRole;
import com.api.library.model.Customer;
import com.api.library.repository.CustomerRepository;
import com.api.library.repository.RoleRepository;
import com.api.library.service.contract.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {

    // ----------------- Injections de dépendances ----------------- //
    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private CustomerRepository customerRepository;

    // ----- ----- //

    /**
     *  Ajoute un role en base
     * @param appRoleDto
     * @return le role ajouté
     */
    @Override
    public AppRoleDto saveRole(final AppRoleDto appRoleDto) {

        AppRole appRole = AppRoleMapper.INSTANCE.appRoleDtoToAppRole(appRoleDto);
        appRole = roleRepository.save(appRole);

        return AppRoleMapper.INSTANCE.appRoleToAppRoleDto(appRole);
    }

    /**
     * Ajoute un role à un utilisateur
     * @param customerDto
     * @param rolename
     */
    @Override
    public void addRoleToCustomer(final CustomerDto customerDto, final String rolename) {
        AppRole appRole = roleRepository.findByRoleName(rolename);
        Customer customer = customerRepository.findByEmail(customerDto.getEmail());
        customer.getRoles().add(appRole);
    }

}
