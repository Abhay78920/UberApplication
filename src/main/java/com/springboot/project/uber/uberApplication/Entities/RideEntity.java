package com.springboot.project.uber.uberApplication.Entities;

import com.springboot.project.uber.uberApplication.Entities.Enums.PaymentMethod;
import com.springboot.project.uber.uberApplication.Entities.Enums.RideStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.locationtech.jts.geom.Point;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class RideEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @Column(columnDefinition = "Geometry(Point,4326)")
    private Point pickupLocation;
    @Column(columnDefinition = "Geometry(Point,4326)")
    private Point dropOffLocation;
    @ManyToOne
    @JoinColumn(name = "driver_id")
    private DriverEntity driver;
    @ManyToOne
    @JoinColumn(name = "rider_id")
    private RiderEntity rider;
    @CreationTimestamp
    private LocalDateTime createdTime;
    @Enumerated(EnumType.STRING)
    private PaymentMethod paymentMethod;
    @Enumerated(EnumType.STRING)
    private RideStatus rideStatus;

    private Double fare;
    private LocalDateTime rideStartedAt;
    private LocalDateTime rideEndedAt;
    private String OTP;



}
