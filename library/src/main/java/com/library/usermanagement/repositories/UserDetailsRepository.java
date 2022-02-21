package com.library.usermanagement.repositories;

import java.math.BigDecimal;

import com.library.usermanagement.models.UserDetails;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDetailsRepository extends JpaRepository<UserDetails, BigDecimal>{
    
}
