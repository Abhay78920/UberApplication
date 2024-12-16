package com.springboot.project.uber.uberApplication.Strategies.Impl;

import com.springboot.project.uber.uberApplication.DTOs.RideRequestDto;
import com.springboot.project.uber.uberApplication.Entities.DriverEntity;
import com.springboot.project.uber.uberApplication.Strategies.DriverMatchingStrategy;

import java.util.List;

public class DriverMatchingHighestRatedDriverStrategy implements DriverMatchingStrategy {
    @Override
    public List<DriverEntity> findAllTheMatchingDrivers(RideRequestDto rideRequestDto) {
        return List.of();
    }
}
