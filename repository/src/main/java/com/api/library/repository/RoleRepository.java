package com.api.library.repository;

import com.api.library.model.AppRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<AppRole, Long> {

    AppRole findByRoleName(String rolename);
}
