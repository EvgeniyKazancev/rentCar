package ru.rentCar.application.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.rentCar.application.repository.StatsRepository;

import java.util.Date;
import java.util.UUID;

@Service
@AllArgsConstructor
public class CarService {
   private final StatsRepository statsRepository;


    public int getCarSpendAfterDate(Date date){

          return statsRepository.getSpendFromIsDate(date);


    }
}
