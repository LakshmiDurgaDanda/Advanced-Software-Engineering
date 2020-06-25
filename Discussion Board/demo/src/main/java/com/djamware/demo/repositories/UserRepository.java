package com.djamware.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.djamware.demo.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
 
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    
    User findByEmail(final String email);

}
