package ru.rentCar.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.rentCar.application.entity.Car;

import java.util.List;
import java.util.UUID;

public interface CarRepository extends JpaRepository<Car, UUID> {


}
