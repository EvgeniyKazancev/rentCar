package ru.rentTaxi.application.repository;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.rentTaxi.application.entity.Driver;

import java.util.List;
import java.util.UUID;

@Repository

public interface DriverRepository extends JpaRepository <Driver, Long>{
    List<Driver> getDriverById (Long Id);
}
