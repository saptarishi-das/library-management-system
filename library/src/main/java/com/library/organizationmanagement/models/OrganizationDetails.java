package com.library.organizationmanagement.models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="organization_details")
@EntityListeners(AuditingEntityListener.class)
public class OrganizationDetails {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="org_id")
    private int orgId;

    @Column(name="org_name")
    private String orgName;

    @Column(name="created_on")
    @CreatedDate
    private Date createdOn;

    @Column(name="is_active")
    private boolean isActive;

    public int getOrgId() {
        return orgId;
    }

    public void setOrgId(int orgId) {
        this.orgId = orgId;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }
}
