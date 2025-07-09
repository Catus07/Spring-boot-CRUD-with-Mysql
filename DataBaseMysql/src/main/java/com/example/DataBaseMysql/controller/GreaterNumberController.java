package com.example.DataBaseMysql.controller;

import com.example.DataBaseMysql.model.GreaterNumberModel;
import com.example.DataBaseMysql.service.GreaterNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/numberCheck")
public class GreaterNumberController {
    @Autowired
    public GreaterNumberService greaterNumberService;
    @PostMapping("/checking")
    public String checkNumberValue(@RequestBody GreaterNumberModel grt){
        return greaterNumberService.checkGreaterNumber(grt);
    }

}
