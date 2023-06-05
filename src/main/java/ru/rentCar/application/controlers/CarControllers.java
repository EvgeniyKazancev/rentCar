package ru.rentCar.application.controlers;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.rentCar.application.dto.GetXmlCar;
import ru.rentCar.application.entity.Car;
import ru.rentCar.application.entity.Spend;
import ru.rentCar.application.repository.CarRepository;
import ru.rentCar.application.repository.IncomeRepository;
import ru.rentCar.application.repository.SpendRepository;
import ru.rentCar.application.service.CarService;

import javax.validation.Valid;
import java.math.BigDecimal;
import java.util.ArrayList;
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
    @Autowired
    private final SpendRepository spendRepository;
    @Autowired
    private final IncomeRepository incomeRepository;
    @GetMapping("/cars/all")
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
    @DeleteMapping("/delete/{id}")
    public void deleteCar(@PathVariable UUID id){
        carRepository.delete(id);

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
    @PostMapping("/addCar")
    public ResponseEntity<String> addCar(@Valid @RequestBody GetXmlCar getXmlCar){
        UUID id = UUID.randomUUID();
        Car car =new Car(getXmlCar.getNumberPts(),getXmlCar.getMake(),getXmlCar.getModel(),getXmlCar.getYear(),getXmlCar.getColor(),getXmlCar.getRentalPricePerDay(),getXmlCar.getMileage());
        car.setId(id);
        carRepository.save(car);
        return ResponseEntity.status(HttpStatus.CREATED).body("Новый автомобиль добавлен");
    }
     @GetMapping("/spend/all")
    public List<Spend> getAll (@PathVariable int spend){
        List<Spend> allListSpend = new ArrayList<>();
        allListSpend.addAll( spendRepository.getAllBySpend());
        return allListSpend;
     }

}
