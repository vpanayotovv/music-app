package com.softuni.musicdb.model.entity;

import com.softuni.musicdb.model.entity.enums.RoleName;

import javax.persistence.*;

@Entity
@Table(name = "roles")
public class RoleEntity extends BaseEntity {

    @Enumerated(EnumType.STRING)
    private RoleName role;

    public RoleEntity() {
    }

    public RoleName getRole() {
        return this.role;
    }

    public RoleEntity setRole(RoleName role) {
        this.role = role;
        return this;
    }
}
