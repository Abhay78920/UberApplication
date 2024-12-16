package com.springboot.project.uber.uberApplication.Strategies.Impl;

import com.springboot.project.uber.uberApplication.DTOs.RideRequestDto;
import com.springboot.project.uber.uberApplication.Strategies.RideFareCalculationStrategy;

public class RideFareCalculationSurgePricingStrategy implements RideFareCalculationStrategy {
    @Override
    public double calculateFair(RideRequestDto rideRequestDto) {
        return 0;
    }
}
