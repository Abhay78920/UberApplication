package com.springboot.project.uber.uberApplication.DTOs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RiderDto {
    private UserDto userDto;
    private Double rating;
}
