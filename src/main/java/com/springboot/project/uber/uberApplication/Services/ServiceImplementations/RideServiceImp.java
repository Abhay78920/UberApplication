package com.springboot.project.uber.uberApplication.Services.ServiceImplementations;

import com.springboot.project.uber.uberApplication.DTOs.RideRequestDto;
import com.springboot.project.uber.uberApplication.Entities.DriverEntity;
import com.springboot.project.uber.uberApplication.Entities.Enums.RideStatus;
import com.springboot.project.uber.uberApplication.Entities.RideEntity;
import com.springboot.project.uber.uberApplication.Services.RideService;
import org.springframework.stereotype.Service;

@Service
public class RideServiceImp implements RideService {
    @Override
    public RideEntity getRideById(Long id) {
        return null;
    }

    @Override
    public void matchWithDrivers(RideRequestDto rideRequestDto) {

    }

    @Override
    public RideEntity createNewRide(RideRequestDto rideRequestDto, DriverEntity driver) {
        return null;
    }

    @Override
    public RideEntity updateRideStatus(Long rideId, RideStatus rideStatus) {
        return null;
    }
}
