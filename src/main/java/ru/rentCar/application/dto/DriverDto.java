package ru.rentCar.application.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;



import java.util.Date;
import java.util.UUID;


@Getter
@Setter
@AllArgsConstructor
public class DriverDto {

    private UUID Id;


    private String firstName;


    private String lastName;

    private String email;


    private String phoneNumber;


    private String licenseNumber;


    private Date dateOfBirth;
}
