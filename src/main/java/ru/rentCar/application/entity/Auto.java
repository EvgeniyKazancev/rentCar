package ru.rentCar.application.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "AUTO")
@Data
public class Auto {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "NUMBER_PTS")
    private BigDecimal numberPTS;

    @Column(name = "MAKE")
    private String make;

    @Column(name = "MODEL")
    private String model;

    @Column(name = "YEAR")
    private int year;

    @Column(name = "COLOR")
    private String color;

    @Column(name = "RENTEL_PRICE_PER_DAY")
    private double rentalPricePerDay;

    @Column(name = "MILEAGE")
    private Long mileage;

    @Column(name = "RENTED")
    private boolean rented;
}
