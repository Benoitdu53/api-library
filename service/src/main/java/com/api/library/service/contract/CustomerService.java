package com.api.library.service.contract;

import com.api.library.dto.AuthenticationDto;
import com.api.library.dto.CustomerDto;

public interface CustomerService {

    // Récupère les utilisateurs en base
    CustomerDto findByEmail (String email);
    // Inscrit un nouvel utilisateur
    CustomerDto saveCustomer(CustomerDto customerDto);
    // Retourne l'utilisateur
    CustomerDto findCustomerByEmail(String email);
    // Ajouter un utilisateur
    CustomerDto createUser(CustomerDto customerDto);
    // Validation d'authentification
    CustomerDto validationAuthentication(AuthenticationDto authenticationDto);
}
