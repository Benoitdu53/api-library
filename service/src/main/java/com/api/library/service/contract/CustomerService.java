package com.api.library.service.contract;

import com.api.library.dto.AppRoleDto;
import com.api.library.dto.CustomerDto;
import com.api.library.model.AppRole;
import com.api.library.model.Customer;

public interface CustomerService {

    // Récupère les utilisateurs en base
    CustomerDto findByEmail (String email);
    // Inscrit un nouvel utilisateur
    CustomerDto saveCustomer(CustomerDto customerDto);
    // Ajoute un role
    AppRoleDto saveRole(AppRoleDto appRoleDto);
    //Ajoute un role au client
    void addRoleToCustomer(String email, String rolename);
    // Retourne l'utilisateur
    CustomerDto findCustomerByEmail(String email);



    // Ajouter un utilisateur
    CustomerDto createUser(CustomerDto customerDto);

    // Authentification utilisateur
    Customer authentification(Customer customer);
}
