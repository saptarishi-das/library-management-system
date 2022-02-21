package com.library.organizationmanagement.controllers;

import com.library.organizationmanagement.models.OrganizationDetails;
import com.library.organizationmanagement.repositories.OrganizationDetailsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/org")
public class OrganizationController {
    
    @Autowired
    private OrganizationDetailsRepository orgRepository;
    
    @ResponseBody
    @PostMapping(path="/create",
            consumes=MediaType.APPLICATION_JSON_VALUE,
            produces=MediaType.APPLICATION_JSON_VALUE)
    public OrganizationDetails createOrganization(@RequestBody OrganizationDetails orgDetails) {
        orgDetails = orgRepository.save(orgDetails);
        return orgDetails;
    }
}
