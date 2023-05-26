package ru.rentTaxi.application.entity;

import jakarta.persistence.*;
import lombok.Data;


import java.util.UUID;

@Data
@Entity
@Table(name = "DRIVER")
public class Driver  {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID Id;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;

    @Column(name = "LICENSE_NUMBER")
    private String licenseNumber;

}
