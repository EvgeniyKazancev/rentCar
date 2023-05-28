package ru.rentCar.application.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "INCOME")
public class Income {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany
    private Car car;

    @Column(name = "PRICE")
    private int price;

    @Column(name = "DATA")
    private Date data;
}
