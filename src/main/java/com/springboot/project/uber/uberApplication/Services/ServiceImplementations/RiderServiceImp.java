package com.springboot.project.uber.uberApplication.Services.ServiceImplementations;

import com.springboot.project.uber.uberApplication.DTOs.DriverDto;
import com.springboot.project.uber.uberApplication.DTOs.RideDto;
import com.springboot.project.uber.uberApplication.DTOs.RideRequestDto;
import com.springboot.project.uber.uberApplication.DTOs.RiderDto;
import com.springboot.project.uber.uberApplication.Services.RiderService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RiderServiceImp implements RiderService {
    @Override
    public RideRequestDto requestRide(RideRequestDto rideRequestDto) {
        return null;
    }

    @Override
    public RideDto cancelRide(Long rideId) {
        return null;
    }

    @Override
    public DriverDto rateDriver(Long rideId, Integer rating) {
        return null;
    }

    @Override
    public RiderDto getDriverProfile() {
        return null;
    }

    @Override
    public List<RideDto> getAllRiderRides() {
        return List.of();
    }
}
