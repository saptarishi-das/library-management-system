package com.library.usermanagement.models;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.library.usermanagement.enums.UserRolesEnum;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

@Entity
@Table(name = "user_details")
public class UserDetails implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private BigDecimal userId;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "primary_email", unique = true)
    private String primaryEmail;

    @Column(name = "secondary_email")
    private String secondaryEmail;

    @Column(name = "mobile_number", unique = true)
    private BigDecimal mobileNumber;

    @Column(name = "is_active")
    private boolean isActive = true;

    @Column(name = "is_new_user")
    private boolean isNewUser = true;

    // TODO - encoding
    @Column(name = "password")
    private String password;

    @Column(name = "user_role")
    private UserRolesEnum userRole;

    @Column(name = "created_on")
    @CreatedDate
    private Date createdOn;

    @Column(name = "last_updated_on")
    @LastModifiedDate
    private Date lastUpdatedOn;

    @Column(name = "created_by")
    @CreatedBy
    private String createdBy;

    @Column(name = "last_modified_by")
    @LastModifiedBy
    private String lastModifiedBy;

    public BigDecimal getUserId() {
        return userId;
    }

    public void setUserId(BigDecimal userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPrimaryEmail() {
        return primaryEmail;
    }

    public void setPrimaryEmail(String primaryEmail) {
        this.primaryEmail = primaryEmail;
    }

    public String getSecondaryEmail() {
        return secondaryEmail;
    }

    public void setSecondaryEmail(String secondaryEmail) {
        this.secondaryEmail = secondaryEmail;
    }

    public BigDecimal getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(BigDecimal mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    public boolean isNewUser() {
        return isNewUser;
    }

    public void setNewUser(boolean isNewUser) {
        this.isNewUser = isNewUser;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserRolesEnum getUserRole() {
        return userRole;
    }

    public void setUserRole(UserRolesEnum userRole) {
        this.userRole = userRole;
    }

    public UserDetails() {
    }

    public UserDetails(BigDecimal userId, String userName, String primaryEmail, String secondaryEmail,
            BigDecimal mobileNumber, boolean isActive, boolean isNewUser, String password, UserRolesEnum userRole,
            Date createdOn, Date lastUpdatedOn, String createdBy, String lastModifiedBy) {
        this.userId = userId;
        this.userName = userName;
        this.primaryEmail = primaryEmail;
        this.secondaryEmail = secondaryEmail;
        this.mobileNumber = mobileNumber;
        this.isActive = isActive;
        this.isNewUser = isNewUser;
        this.password = password;
        this.userRole = userRole;
        this.createdOn = createdOn;
        this.lastUpdatedOn = lastUpdatedOn;
        this.createdBy = createdBy;
        this.lastModifiedBy = lastModifiedBy;
    }

}
