package ru.rentCar.application.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.UUID;


@Getter
@Setter
@AllArgsConstructor
public class CarDto {

    private UUID id;


    private BigDecimal numberPts;

    private String make;


    private String model;


    private int year;

    private String color;


    private double rentalPricePerDay;


    private Long mileage;


    private boolean rented;
}
