package ru.rentCar.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.rentCar.application.entity.Income;

@Repository
public interface IncomeRepository extends JpaRepository<Income,Long> {
}
