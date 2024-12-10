package com.springboot.project.uber.uberApplication.Services;

import com.springboot.project.uber.uberApplication.DTOs.RideRequestDto;
import com.springboot.project.uber.uberApplication.Entities.DriverEntity;
import com.springboot.project.uber.uberApplication.Entities.Enums.RideStatus;
import com.springboot.project.uber.uberApplication.Entities.RideEntity;

public interface RideService {
//Will be used internally by other services
    RideEntity getRideById(Long id);

    void matchWithDrivers(RideRequestDto rideRequestDto);

    RideEntity createNewRide(RideRequestDto rideRequestDto, DriverEntity driver);

    RideEntity updateRideStatus(Long rideId, RideStatus rideStatus);



}
