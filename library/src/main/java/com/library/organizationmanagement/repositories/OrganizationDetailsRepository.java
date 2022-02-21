package com.library.organizationmanagement.repositories;

import com.library.organizationmanagement.models.OrganizationDetails;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrganizationDetailsRepository extends JpaRepository<OrganizationDetails, Integer>{
    
}
