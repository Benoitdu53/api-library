package com.api.library.service.impl;

import com.api.library.dto.CustomerDto;
import com.api.library.model.Customer;
import com.api.library.service.contract.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;

@Service
public class UserDetailServiceImpl implements UserDetailsService {

    @Autowired
    private CustomerService customerService;

    @Override
    public UserDetails loadUserByUsername(final String email) throws UsernameNotFoundException {
        CustomerDto customerDto = customerService.findCustomerByEmail(email);
        if (customerDto==null){throw new UsernameNotFoundException(email);}
        Collection<GrantedAuthority> authorities = new ArrayList<>();
        customerDto.getAppRoleDtos().forEach(r->{
            authorities.add(new SimpleGrantedAuthority(r.getRoleName()));
        });


        return new User(customerDto.getEmail(),customerDto.getPassword(),authorities);
    }
}
