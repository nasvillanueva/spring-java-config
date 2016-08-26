package io.nasvillanueva.model.entities;

import io.nasvillanueva.model.base.BaseEntity;
import io.nasvillanueva.model.ref.RoleType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Role role = (Role) o;

        return new EqualsBuilder()
                .append(name, role.name)
                .append(roleType, role.roleType)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(name)
                .append(roleType)
                .toHashCode();
    }
}
