package ru.rentTaxi.application.entity;

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

    @Column
    private BigDecimal numberPTS;

    @Column
    private String make;

    @Column
    private String model;

    @Column
    private int year;

    @Column
    private String color;

    @Column
    private double rentalPricePerDay;

    @Column
    private Long mileage;

    @Column
    private boolean rented;
}
