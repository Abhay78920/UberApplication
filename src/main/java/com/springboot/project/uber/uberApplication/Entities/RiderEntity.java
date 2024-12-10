package com.springboot.project.uber.uberApplication.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class RiderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double rating;

    @OneToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;
}
