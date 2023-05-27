package ru.rentCar.application.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "SPEND")
public class Spend {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "SPEND")
    private int spend;
    @Column(name = "DATA")
    private Date data;


}
