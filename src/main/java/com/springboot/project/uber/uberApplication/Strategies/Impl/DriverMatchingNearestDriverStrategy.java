package com.springboot.project.uber.uberApplication.Strategies.Impl;

import com.springboot.project.uber.uberApplication.DTOs.RideRequestDto;
import com.springboot.project.uber.uberApplication.Entities.DriverEntity;
import com.springboot.project.uber.uberApplication.Strategies.DriverMatchingStrategy;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DriverMatchingNearestDriverStrategy implements DriverMatchingStrategy {
    // what basically this wil do this just return us the list or notify the drivers about this ride req.
    @Override
    public List<DriverEntity> findAllTheMatchingDrivers(RideRequestDto rideRequestDto) {
        return List.of();
    }
}
