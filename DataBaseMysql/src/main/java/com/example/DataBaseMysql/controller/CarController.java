package com.example.DataBaseMysql.controller;

import com.example.DataBaseMysql.model.CarModel;
import com.example.DataBaseMysql.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/car")
public class CarController {

    @Autowired
    public CarService carService;


    @PostMapping("/details")
    public CarModel createCar(@RequestBody CarModel carModel){
        return carService.carRepoMethod(carModel);
    }

    @GetMapping("/postDetails")
    public CarModel getDetails(CarModel carModel){
        return carService.carRepoMethod(carModel);
    }

    //return ALL cars
    @GetMapping("/getDetails")
    public List<CarModel> getCars(CarModel carModel){
        return carService.getAllCar();
    }

    //return one car
    @GetMapping("/getDetails/{id}")
    public CarModel getAllById(@PathVariable Long id){
        return carService.getALLCarById(id);
    }


    @GetMapping("/hello")
    public String name(){
        return "hello tanzania";
    }

}
