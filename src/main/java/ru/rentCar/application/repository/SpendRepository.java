package ru.rentCar.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.rentCar.application.entity.Spend;

import java.sql.Date;
import java.util.List;

@Repository
public interface SpendRepository extends JpaRepository<Spend, Long> {
    List<Spend> getSpendBySpendIsAfterOrDate (Date date);
    List<Spend> getAllBySpend ();

}
