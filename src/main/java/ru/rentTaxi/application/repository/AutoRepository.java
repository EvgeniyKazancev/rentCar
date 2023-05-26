package ru.rentTaxi.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.rentTaxi.application.entity.Auto;

public interface AutoRepository extends JpaRepository<Auto,Long> {

}
