package com.api.library.repository;

import com.api.library.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {

    Customer findByEmail(String email);

    @Query("SELECT c FROM Customer c WHERE c.id = :idSession")
    Customer getCustomerById(@Param("idSession")Long idSession);
}
