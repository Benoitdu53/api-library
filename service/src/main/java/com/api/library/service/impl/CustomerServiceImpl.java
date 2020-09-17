package com.api.library.service.impl;

import com.api.library.dto.AppRoleDto;
import com.api.library.dto.CustomerDto;
import com.api.library.mapper.AppRoleMapper;
import com.api.library.mapper.CustomerMapper;
import com.api.library.model.AppRole;
import com.api.library.model.Customer;
import com.api.library.repository.CustomerRepository;
import com.api.library.repository.RoleRepository;
import com.api.library.service.contract.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

    // ----------------- Injections de dépendances ----------------- //
    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    private RoleRepository roleRepository;

    // -----------------------------------------------------  //

    /**
     *
     * @param email
     * @return les utilisateurs par mail
     */
    @Override
    public CustomerDto findByEmail(final String email) {
        return null;
    }

    /**
     * Ajoute un utilisateur en base
     * @param customerDto
     * @return l'utilisateur ajouté
     */
    @Override
    public CustomerDto saveCustomer(final CustomerDto customerDto) {
        String hashPw=bCryptPasswordEncoder.encode(customerDto.getPassword());
        customerDto.setPassword(hashPw);

        Customer customer = CustomerMapper.INSTANCE.userDtoToUser(customerDto);
        customer = customerRepository.save(customer);

        return CustomerMapper.INSTANCE.userToUserDto(customer);
    }

    /**
     *
     * @param email
     * @return l'utilisateur selon le mail
     */
    @Override
    public CustomerDto findCustomerByEmail(final String email) {
        Customer customer = customerRepository.findByEmail(email);

        return CustomerMapper.INSTANCE.userToUserDto(customer);
    }


    //  -- Ancienne version -- //

    @Override
    public CustomerDto createUser(final CustomerDto customerDto) {

        Customer customer = CustomerMapper.INSTANCE.userDtoToUser(customerDto);
        customer = customerRepository.save(customer);

        return CustomerMapper.INSTANCE.userToUserDto(customer);
    }

    @Override
    public Customer authentification(final Customer customer) {
        return null;
    }


}
