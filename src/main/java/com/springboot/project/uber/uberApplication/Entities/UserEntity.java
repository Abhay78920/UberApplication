package com.springboot.project.uber.uberApplication.Entities;

import com.springboot.project.uber.uberApplication.Entities.Enums.Role;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "UberUsers")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    private String email;
    private String Password;
    //As a cell in a row can only have 1 element as it is a sql
    // db so this will create a new table with name UberUsers_roles where
    // it will store the user id and the role
    @ElementCollection(fetch = FetchType.LAZY)
    @Enumerated(EnumType.STRING)   // This basically sets the role as they are in String( Admin,DriverEntity..)
    private Set<Role> roles;
}
