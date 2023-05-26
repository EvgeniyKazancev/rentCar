package ru.rentCar.application.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "SPEND")
public class Spend {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


}
