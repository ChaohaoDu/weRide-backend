package com.weride.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "user")
@Data
public class User {
    private Long id;

    private String firstName;

    private String lastName;

    private String email;

    private String address;

//    @Column(name="")
    private String phoneNumber;

    @Column(name="password")
    private String password;

    private Boolean gender;

    @Column(name="create_date")
    private Date createDate;


    private Long driverId;

    private Date dateOfBirth;

    private Date lastUpdateAtDate;
}