package com.library.usermanagement.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

import java.sql.Date;
import java.io.Serializable;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.library.usermanagement.enums.UserRolesEnum;

@Entity
@Table(name="user_authorization")
@EntityListeners(AuditingEntityListener.class)
public class UserAuthorization implements Serializable{

    @Id
    @Column(name="user_roles")
    @Enumerated(EnumType.STRING)
    private UserRolesEnum userRoles;

    @Column(name="created_on")
    @CreatedDate
    private Date createdOn;

    @Column(name="last_updated_on")
    @LastModifiedDate
    private Date last_updated_on;

    public UserAuthorization() {
    }

    public UserAuthorization(UserRolesEnum userRoles, Date createdOn, Date last_updated_on) {
        this.userRoles = userRoles;
        this.createdOn = createdOn;
        this.last_updated_on = last_updated_on;
    }

    public UserRolesEnum getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(UserRolesEnum userRoles) {
        this.userRoles = userRoles;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public Date getLast_updated_on() {
        return last_updated_on;
    }

    public void setLast_updated_on(Date last_updated_on) {
        this.last_updated_on = last_updated_on;
    }
    
}
