package com.example.DataBaseMysql.service;

import com.example.DataBaseMysql.model.NumberCheck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class NumberService {

    public String checkEvenOrOdd(NumberCheck numberCheck){
        int num = numberCheck.getNumber();

        if (num%2 == 0){
            return "even number :" + num;
        }
        else {
            return "odd number :"+ num;
        }
    }

}
