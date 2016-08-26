package io.nasvillanueva.model.entities;

import io.nasvillanueva.model.base.BaseEntity;

import javax.persistence.*;

/**
 * Created by jvillanueva on 8/26/16.
 */
@Entity
public class Contact extends BaseEntity {

    private static final long serialVersionUID = -1772785729825786403L;

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "USER_PROFILE_ID")
    private UserProfile person;

    @Column
    private String contactInfo;

    @Column
    private String contactType;

    public UserProfile getPerson() {
        return person;
    }

    public void setPerson(UserProfile person) {
        this.person = person;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public String getContactType() {
        return contactType;
    }

    public void setContactType(String contactType) {
        this.contactType = contactType;
    }
}
