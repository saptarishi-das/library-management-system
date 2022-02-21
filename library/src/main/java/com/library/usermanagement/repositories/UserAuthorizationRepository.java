package com.library.usermanagement.repositories;

import com.library.usermanagement.models.UserAuthentication;
import com.library.usermanagement.models.UserAuthorization;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAuthorizationRepository extends JpaRepository<UserAuthorization, UserAuthentication>{
    
}
