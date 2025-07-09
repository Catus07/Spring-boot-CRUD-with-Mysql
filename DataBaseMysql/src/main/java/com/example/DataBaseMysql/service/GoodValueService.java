package com.example.DataBaseMysql.service;

import com.example.DataBaseMysql.model.GoodValueModel;
import org.springframework.stereotype.Service;

@Service
public class GoodValueService {
    public String getGoodValue(GoodValueModel goodValueModel){
        int val = goodValueModel.getPrice();
        if (val>1000000){
            return "this is expensive" + val;
        }
        else {
            return "this is affordable price : " + val;
        }
    }
}
