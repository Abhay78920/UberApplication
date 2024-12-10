package com.springboot.project.uber.uberApplication.Services;

import com.springboot.project.uber.uberApplication.DTOs.DriverDto;
import com.springboot.project.uber.uberApplication.DTOs.SignUpDto;
import com.springboot.project.uber.uberApplication.DTOs.UserDto;

public interface AuthService {

    String login(SignUpDto signUpDto);

    UserDto signUpDto(SignUpDto signUpDto);

    DriverDto onboardNewDriver(Long userId);


}
