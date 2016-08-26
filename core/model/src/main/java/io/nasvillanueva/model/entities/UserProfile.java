package io.nasvillanueva.model.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by jvillanueva on 8/26/16.
 */
@Entity
public class UserProfile extends UserAccount {

    @Embedded
    private Name name;

    @Embedded
    private Address address;

    @Column
    private Date birthDate;

    @Column
    private Double gwa;

    @Column
    private Date dateHired;

    @Column
    private Boolean currentlyEmployed;

    @OneToMany(mappedBy = "person", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Contact> contactInfo = new ArrayList<>();

}
