package com.springboot.project.uber.uberApplication.Strategies;

import com.springboot.project.uber.uberApplication.DTOs.DriverDto;
import com.springboot.project.uber.uberApplication.DTOs.RideRequestDto;
import com.springboot.project.uber.uberApplication.Entities.DriverEntity;

import java.util.List;

public interface DriverMatchingStrategy {
 // could be based on the ratings, nearest location
    List<DriverEntity> findAllTheMatchingDrivers(RideRequestDto rideRequestDto);

}
