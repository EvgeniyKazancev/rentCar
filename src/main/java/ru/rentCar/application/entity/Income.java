package ru.rentCar.application.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "INCOME")
public class Income {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}
