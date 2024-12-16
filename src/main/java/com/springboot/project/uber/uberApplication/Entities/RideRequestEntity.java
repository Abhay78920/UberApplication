package com.springboot.project.uber.uberApplication.Entities;

import com.springboot.project.uber.uberApplication.Entities.Enums.PaymentMethod;
import com.springboot.project.uber.uberApplication.Entities.Enums.RideRequestStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.locationtech.jts.geom.Point;
import java.time.LocalDateTime;

@Entity
@Setter
@Getter
public class RideRequestEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(columnDefinition = "Geometry(Point, 4326)")
    private Point pickupLocation;
    @Column(columnDefinition = "Geometry(Point, 4326)")
    private Point dropOffLocation;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "rider_id")
    private RiderEntity riderEntity;
    @CreationTimestamp
    private LocalDateTime requestedTime;
    @Enumerated(EnumType.STRING)
    private PaymentMethod paymentMethod;
    @Enumerated(EnumType.STRING)
    private RideRequestStatus rideRequestStatus;


}
