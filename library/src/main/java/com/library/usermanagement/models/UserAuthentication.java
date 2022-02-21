package com.library.usermanagement.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.EntityListeners;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.sql.Date;
import java.io.Serializable;

@Entity
@Table(name="user_authentication")
@EntityListeners(AuditingEntityListener.class)
public class UserAuthentication implements Serializable{

    @Id
    @Column(name="user_id")
    private String userId;

    @Column(name="password")
    private String password;

    @Column(name="created_on")
    @CreatedDate
    private Date createdOn;

    @Column(name="last_login_date")
    private Date lastLoginDate;

    public UserAuthentication() {
    }

    public UserAuthentication(String userId, String password, Date createdOn, Date lastLoginDate) {
        this.userId = userId;
        this.password = password;
        this.createdOn = createdOn;
        this.lastLoginDate = lastLoginDate;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }
    
}
