package ru.rentCar.application.controlers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.rentCar.application.service.CarService;

import java.util.Date;

@RestController
@AllArgsConstructor
public class RentControllers {
    private final CarService carService;
    @RequestMapping("/dateAfter")
    public int getDate(@PathVariable Date date){
        return carService.getCarSpendAfterDate(date);
    }
}
