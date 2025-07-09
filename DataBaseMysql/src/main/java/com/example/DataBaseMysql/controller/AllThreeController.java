package com.example.DataBaseMysql.controller;

import com.example.DataBaseMysql.model.AgeCheckerModel;
import com.example.DataBaseMysql.model.LeapYearModel;
import com.example.DataBaseMysql.model.TemperatureModel;
import com.example.DataBaseMysql.service.AllLogicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/all/")
public class AllThreeController {
    @Autowired
    public AllLogicService allLogicService;

    @PostMapping("/ageCategory")
    public String ageCheck(@RequestBody AgeCheckerModel ageCheckerModel){
        return " age category : "+ allLogicService.ageChecking(ageCheckerModel);
    }
    @PostMapping("/yearChecking")
    public String yearCheck(@RequestBody LeapYearModel leapYearModel){
        return "year : "+ allLogicService.leapYear(leapYearModel);
    }
    @PostMapping("/temperature")
    public String tempChecking(@RequestBody TemperatureModel temperatureModel){
        return "temperature : " + allLogicService.tempStatus(temperatureModel);
    }

}
