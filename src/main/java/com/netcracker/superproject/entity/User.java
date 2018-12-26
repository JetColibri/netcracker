package com.netcracker.superproject.entity;

import com.netcracker.superproject.entity.annotations.Attribute;
import com.netcracker.superproject.entity.annotations.Entity;
import lombok.Builder;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.List;


@Entity(type = "1")
public class User extends BaseEntity implements UserDetails {
    @Attribute(type = "100x")
    private List<Role> authorities;
    @Attribute(type = "100x")
    private boolean accountNonExpired;
    @Attribute(type = "100x")
    private boolean accountNonLocked;
    @Attribute(type = "100x")
    private boolean credentialsNonExpired;
    @Attribute(type = "100x")
    private boolean enable;

    @Attribute(type = "1001")
    private String email;

    @Attribute(type = "1002")
    private String password;

    @Attribute(type = "1003")
    private String role;

    @Attribute(type = "1004")
    private String firstName;

    @Attribute(type = "1005")
    private String lastName;

    @Attribute(type = "1006")
    private String location;

    @Attribute(type = "1007")
    private String birthdayDate;

    @Attribute(type = "1008")
    private String registrationDate;

    @Attribute(type = "1009")
    private String photo;

    public User() {
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoto() {
        return this.photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getBirthdayDate() {
        return this.birthdayDate;
    }

    public void setBirthdayDate(String birthdayDate) {
        this.birthdayDate = birthdayDate;
    }

    public String getRegistrationDate() {
        return this.registrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    @Override
    public List<Role> getAuthorities() {
        return authorities;
    }

    @Override
    public boolean isAccountNonExpired() {
        return accountNonExpired;
    }

    @Override
    public boolean isAccountNonLocked() {
        return accountNonLocked;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return credentialsNonExpired;
    }

    @Override
    public boolean isEnabled() {
        return enable;
    }

    @Override
    public String getUsername() {
        return email;
    }

    public void setAuthorities(List<Role> authorities) {
        this.authorities = authorities;
    }

    public void setAccountNonExpired(boolean accountNonExpired) {
        this.accountNonExpired = accountNonExpired;
    }

    public void setAccountNonLocked(boolean accountNonLocked) {
        this.accountNonLocked = accountNonLocked;
    }

    public void setCredentialsNonExpired(boolean credentialsNonExpired) {
        this.credentialsNonExpired = credentialsNonExpired;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }
}