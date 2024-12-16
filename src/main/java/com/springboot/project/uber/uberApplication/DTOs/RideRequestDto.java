package com.springboot.project.uber.uberApplication.DTOs;

import com.springboot.project.uber.uberApplication.Entities.Enums.PaymentMethod;
import com.springboot.project.uber.uberApplication.Entities.Enums.RideRequestStatus;
import com.springboot.project.uber.uberApplication.Entities.RiderEntity;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;

public class RideRequestDto {
    private Long id;
    private Point pickupLocation;
    private Point dropOffLocation;
    private RiderEntity riderEntity;
    private LocalDateTime requestedTime;
    private PaymentMethod paymentMethod;
    private RideRequestStatus rideRequestStatus;
}
