package com.library.usermanagement.repositories;

import com.library.usermanagement.models.UserAuthentication;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAuthenticationRepository extends JpaRepository<UserAuthentication, String>{
    
}
