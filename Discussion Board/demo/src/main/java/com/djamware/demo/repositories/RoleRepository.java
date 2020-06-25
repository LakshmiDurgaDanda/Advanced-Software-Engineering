package com.djamware.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.djamware.demo.models.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    
    Role findByRole(final String role);

}
