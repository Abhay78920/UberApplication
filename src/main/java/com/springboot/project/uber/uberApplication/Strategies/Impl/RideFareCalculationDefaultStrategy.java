package com.springboot.project.uber.uberApplication.Strategies.Impl;

import com.springboot.project.uber.uberApplication.DTOs.RideRequestDto;
import com.springboot.project.uber.uberApplication.Strategies.RideFareCalculationStrategy;

public class RideFareCalculationDefaultStrategy implements RideFareCalculationStrategy {

    //based on distance default fare will be returned
    @Override
    public double calculateFair(RideRequestDto rideRequestDto) {
        return 0;
    }
}
