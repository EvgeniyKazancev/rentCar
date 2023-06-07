package ru.rentCar.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.rentCar.application.entity.Spend;

import java.sql.Date;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

@Repository
public interface SpendRepository extends JpaRepository<Spend, Long> {


}
