package com.api.library.controller;

import com.api.library.dto.AuthenticationDto;
import com.api.library.dto.CustomerDto;
import com.api.library.service.contract.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustomerController {

    // ----------------- Injections de dépendances ----------------- //
    @Autowired
    private CustomerService customerService;

    // -----------------------------------------------------  //

    @PostMapping("login")
    public CustomerDto login(@RequestBody CustomerDto customerDto){

        return customerDto;
    }

    /**
     *
     * @param email
     * @return l'utilisateur si il existe sinon null
     */
    @PostMapping("user")
    public CustomerDto getCustomerByEmail(@RequestBody String email){

        CustomerDto customerDto = customerService.findCustomerByEmail(email);

        return customerDto;
    }

    /**
     * Ajout un utilisateur en base
     * @param customerDto
     * @return l'utilisateur rajouter
     */
    @PostMapping("users")
    public CustomerDto createCustomer(@RequestBody CustomerDto customerDto){

        return customerService.saveCustomer(customerDto);
    }

    /**
     * Validation du login
     * @param authenticationDto
     * @return
     */
    @PostMapping("validationAuthencation")
    public CustomerDto validationAuthentication(@RequestBody AuthenticationDto authenticationDto){

        CustomerDto customerDto = customerService.validationAuthentication(authenticationDto);

        return customerDto ;
    }
}
