package com.softuni.musicdb.model.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
public class UserEntity extends BaseEntity {

    private String username;

    private String password;

    @ManyToMany(fetch = FetchType.EAGER)
    private List<RoleEntity> roles = new ArrayList<>();

    public UserEntity() {
    }

    public String getUsername() {
        return this.username;
    }

    public UserEntity setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return this.password;
    }

    public UserEntity setPassword(String password) {
        this.password = password;
        return this;
    }

    public List<RoleEntity> getRoles() {
        return this.roles;
    }

    public UserEntity setRoles(List<RoleEntity> roles) {
        this.roles = roles;
        return this;
    }
}
