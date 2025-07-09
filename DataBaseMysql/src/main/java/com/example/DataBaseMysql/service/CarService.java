package com.example.DataBaseMysql.service;

import com.example.DataBaseMysql.model.CarModel;
import com.example.DataBaseMysql.repo.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {
    @Autowired
    CarRepository carRepository;

    public CarModel carRepoMethod(CarModel carModel){

        return carRepository.save(carModel);
    }
    // return every CarModel row in the table
    public List<CarModel> getAllCar(){
        return carRepository.findAll();
    }
    public CarModel getALLCarById(long id){
        return carRepository.findById(id).orElse(new CarModel());
    }


}
