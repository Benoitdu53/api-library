package com.api.library.controller;

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

    @PostMapping("users")
    public CustomerDto createCustomer(@RequestBody CustomerDto customerDto){

        return customerService.saveCustomer(customerDto);
    }
}
