package com.springboot.project.uber.uberApplication.Services;

import com.springboot.project.uber.uberApplication.DTOs.DriverDto;
import com.springboot.project.uber.uberApplication.DTOs.RideDto;
import com.springboot.project.uber.uberApplication.DTOs.RiderDto;

import java.util.List;

public interface DriverService {

    RideDto acceptRide(Long rideId);

    RideDto cancelRide(Long rideId);

    RideDto startRide(Long rideId);

    RideDto endRide(Long rideId);

    RiderDto rateRider(Long rideId, Integer rating);

    DriverDto getDriverProfile();

    List<RideDto> getAllDriverRides();


}
