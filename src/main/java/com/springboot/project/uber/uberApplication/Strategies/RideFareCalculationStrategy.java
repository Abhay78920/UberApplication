package com.springboot.project.uber.uberApplication.Strategies;

import com.springboot.project.uber.uberApplication.DTOs.RideRequestDto;

public interface RideFareCalculationStrategy {
    double calculateFair(RideRequestDto rideRequestDto);
}
