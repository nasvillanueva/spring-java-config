package io.nasvillanueva.model.entities;

import io.nasvillanueva.model.base.BaseEntity;
import io.nasvillanueva.model.io.navillanueva.model.ref.RoleType;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by jvillanueva on 8/24/16.
 */
@Entity
public class Role extends BaseEntity {

    @Column
    private String name;

    @Column
    private RoleType roleType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RoleType getRoleType() {
        return roleType;
    }

    public void setRoleType(RoleType roleType) {
        this.roleType = roleType;
    }
}
