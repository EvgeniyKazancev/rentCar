package ru.rentCar.application.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "CAR")
@Getter
@Setter
@AllArgsConstructor
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DRIVER_ID")
    private Driver driver;

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


    public Car() {

    }
}
