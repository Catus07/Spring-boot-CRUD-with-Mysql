package com.example.DataBaseMysql.controller;

import com.example.DataBaseMysql.model.NumberCheck;
import com.example.DataBaseMysql.service.NumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/numbers")
public class NumberController {
    @Autowired
    public NumberService numberService;

    @PostMapping("chcek")
    public String checkNumber(@RequestBody NumberCheck numberCheck){
        return "number" + numberService.checkEvenOrOdd(numberCheck);
    }
    @GetMapping
    public String name(){
        return "test mapping";
    }
}
