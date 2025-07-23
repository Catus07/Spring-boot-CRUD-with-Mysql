package com.example.DataBaseMysql.controller;

import com.example.DataBaseMysql.model.*;
import com.example.DataBaseMysql.service.RestClientServiceTwo;
import com.example.DataBaseMysql.service.AllLogicService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/all/")
public class AllThreeController {

    private final AllLogicService allLogicService;

    private final RestClientServiceTwo restClientService;

    public AllThreeController(RestClientServiceTwo restClientService, AllLogicService allLogicService ){
        this.restClientService = restClientService;
        this.allLogicService = allLogicService;
    }
    //getting resource from external api json placeholder
    @GetMapping("/resource")
    public JsonModel jsonModel(){
        return restClientService.getJsonModel();
    }
    //listing all resource from external api json placeholder
    @GetMapping("/listing")
    public List<JsonModel> jsonModel2(){
        return restClientService.externalApi2();
    }
    @PutMapping("/update")
    public JsonModel update(@RequestBody JsonModel jsonModel){
        return restClientService.update(jsonModel);
    }

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
