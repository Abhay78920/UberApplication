package com.springboot.project.uber.uberApplication.Services.ServiceImplementations;

import com.springboot.project.uber.uberApplication.DTOs.DriverDto;
import com.springboot.project.uber.uberApplication.DTOs.RideDto;
import com.springboot.project.uber.uberApplication.DTOs.RiderDto;
import com.springboot.project.uber.uberApplication.Services.DriverService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DriverServiceImp implements DriverService {
    @Override
    public RideDto acceptRide(Long rideId) {
        return null;
    }

    @Override
    public RideDto cancelRide(Long rideId) {
        return null;
    }

    @Override
    public RideDto startRide(Long rideId) {
        return null;
    }

    @Override
    public RideDto endRide(Long rideId) {
        return null;
    }

    @Override
    public RiderDto rateRider(Long rideId, Integer rating) {
        return null;
    }

    @Override
    public DriverDto getDriverProfile() {
        return null;
    }

    @Override
    public List<RideDto> getAllDriverRides() {
        return List.of();
    }
}
