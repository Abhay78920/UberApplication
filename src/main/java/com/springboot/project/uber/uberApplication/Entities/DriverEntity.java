package com.springboot.project.uber.uberApplication.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.locationtech.jts.geom.Point;

@Entity
@Getter
@Setter
public class DriverEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double rating;

    @OneToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;

    private Boolean isAvailableToTakeRides;
    //Column property added below which tells that this will be storing point type info for earth like geo
    @Column(columnDefinition = "Geometry(Point,4326)")
    Point currentLocation;
}
