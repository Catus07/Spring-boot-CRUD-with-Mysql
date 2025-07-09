package com.example.DataBaseMysql.service;

import com.example.DataBaseMysql.model.GreaterNumberModel;
import org.springframework.stereotype.Service;

@Service
public class GreaterNumberService {
    public String checkGreaterNumber(GreaterNumberModel greaterNumberModel){
        int numberGreater = greaterNumberModel.getNumber();
        if (numberGreater >= 10){
            return "number is greater than : "+numberGreater;
        }else {
            return "number is less than :" + numberGreater;
        }

    }
}
