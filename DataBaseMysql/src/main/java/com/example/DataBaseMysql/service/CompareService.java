package com.example.DataBaseMysql.service;

import com.example.DataBaseMysql.model.CompareModel;
import org.springframework.stereotype.Service;

@Service
public class CompareService {
    public String comparingTwoNUmber(CompareModel compareModel){
        // business logic
        int num1 = compareModel.getNumber1();
        int num2 = compareModel.getNumber2();
        if (num1 == num2){
            return "Equal number " + num1 + " = " + num2;
        }else {
            return "not equal number";
        }

    }
}
