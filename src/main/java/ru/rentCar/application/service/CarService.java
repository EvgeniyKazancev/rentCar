package ru.rentCar.application.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.rentCar.application.entity.Spend;
import ru.rentCar.application.repository.IncomeRepository;
import ru.rentCar.application.repository.SpendRepository;
import ru.rentCar.application.repository.StatsRepository;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class CarService {
   private final StatsRepository statsRepository;
   private  final SpendRepository spendRepository;
   private final IncomeRepository incomeRepository;

    public int getCarSpendAfterDate(Date date){

          return statsRepository.getSpendFromIsDate(date);
    }
    public List<Spend> getAllSpend(UUID id, int spend){
        return spendRepository.getAllBySpend();
    }
}
