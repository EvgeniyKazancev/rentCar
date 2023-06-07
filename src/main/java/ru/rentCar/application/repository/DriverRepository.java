package ru.rentCar.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.rentCar.application.entity.Driver;

import java.util.List;

@Repository

public interface DriverRepository extends JpaRepository <Driver, Long>{

}
