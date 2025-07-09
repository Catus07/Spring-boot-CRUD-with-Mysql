package com.example.DataBaseMysql.service;

import com.example.DataBaseMysql.model.AgeCheckerModel;
import com.example.DataBaseMysql.model.LeapYearModel;
import com.example.DataBaseMysql.model.TemperatureModel;
import org.springframework.stereotype.Service;

@Service
public class AllLogicService {

    //age category checking method
    //
    public String ageChecking(AgeCheckerModel ageCheckerModel) {
        int ageValues = ageCheckerModel.getAgeCat();
        if (ageValues < 13) {
            return "adult";
        }else{
            return "teen";
        }
    }

    //temperature status
    //
    public String tempStatus(TemperatureModel temperatureModel){
        int temp = temperatureModel.getCentigrade();
        if (temp <0){
            return "frozen";
        } else if (temp>0 && temp<20) {
            return "cold";
        } else if (temp>21 && temp<30) {
            return "warm";
        } else if (temp>31) {
            return "hot";
        }
        return "";

    }

    //leap year method
    //
    public String leapYear(LeapYearModel leapYearModel){
        int yearCheck = leapYearModel.getYear();
        if (yearCheck % 4 == 0){
            if (yearCheck % 400 == 0){
                return "leap year : " + yearCheck;
            }
        }else {
            return "not leap year :" + yearCheck;
        }
        return "";
    }
}
