package ru.rentCar.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.rentCar.application.entity.Auto;

public interface AutoRepository extends JpaRepository<Auto,Long> {

}
