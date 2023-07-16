package com.saikumar.Instagram.BackEnd.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userId;
    private String userFirstName;
    private String userLastName;
    private Integer userAge;

    @Email
    @Column(unique = true)
    private String userEmail;
    private  String userPassword;
    private String userPhoneNumber;

}
