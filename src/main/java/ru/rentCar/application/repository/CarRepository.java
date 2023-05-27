package ru.rentCar.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.rentCar.application.entity.Car;

import java.util.UUID;
@Repository
public interface CarRepository extends JpaRepository<Car, UUID> {
 Car getCarById (UUID Id);

}
