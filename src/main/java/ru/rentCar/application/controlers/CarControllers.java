package ru.rentCar.application.controlers;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.rentCar.application.entity.Car;
import ru.rentCar.application.repository.CarRepository;
import ru.rentCar.application.service.CarService;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@RequestMapping("/api/car")
@RestController
@AllArgsConstructor
public class CarControllers {
    @Autowired
    private final CarService carService;
    @Autowired
    private final CarRepository carRepository;
    @GetMapping("/")
    public List<Car> getAllCars(){
        return carRepository.findAll();
    }

    @RequestMapping("/dateAfter")
    public int getDate(@PathVariable("date") Date date) {
        return carService.getCarSpendAfterDate(date);
    }

    @GetMapping("/{id}")
    public Car getCarId(@PathVariable UUID id) {
        return carRepository.getCarById(id);
    }

    @PostMapping
    public Car addCar(@RequestBody Car car) {
        return carRepository.save(car);
    }

    @PutMapping("/upCar")
    public Car updateCar(@PathVariable UUID id, @RequestBody Car updateCar) {
        Car car = carRepository.findById(id).orElse(null);
        if (car != null) {
            car.setDriver(updateCar.getDriver());
            car.setMake(updateCar.getMake());

        }
        return car;
    }

}
