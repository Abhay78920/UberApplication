package com.springboot.project.uber.uberApplication.DTOs;
import com.springboot.project.uber.uberApplication.Entities.Enums.PaymentMethod;
import com.springboot.project.uber.uberApplication.Entities.Enums.RideStatus;
import org.locationtech.jts.geom.Point;
import java.time.LocalDateTime;

public class RideDto {

    private Long id;
    private Point pickupLocation;
    private Point dropOffLocation;
    private DriverDto driver;
    private RiderDto rider;
    private LocalDateTime createdTime;
    private PaymentMethod paymentMethod;
    private RideStatus rideStatus;
    private Double fare;
    private LocalDateTime rideStartedAt;
    private LocalDateTime rideEndedAt;
    private String OTP;

}
