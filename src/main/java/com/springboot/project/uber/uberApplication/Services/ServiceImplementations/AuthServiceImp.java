package com.springboot.project.uber.uberApplication.Services.ServiceImplementations;

import com.springboot.project.uber.uberApplication.DTOs.DriverDto;
import com.springboot.project.uber.uberApplication.DTOs.SignUpDto;
import com.springboot.project.uber.uberApplication.DTOs.UserDto;
import com.springboot.project.uber.uberApplication.Services.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImp implements AuthService {

    @Override
    public String login(SignUpDto signUpDto) {
        return "";
    }

    @Override
    public UserDto signUpDto(SignUpDto signUpDto) {
        return null;
    }

    @Override
    public DriverDto onboardNewDriver(Long userId) {
        return null;
    }
}
