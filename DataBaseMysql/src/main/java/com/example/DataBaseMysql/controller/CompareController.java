package com.example.DataBaseMysql.controller;

import com.example.DataBaseMysql.model.CompareModel;
import com.example.DataBaseMysql.service.CompareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/compare")
public class CompareController {
    @Autowired
    public CompareService compareService;

    @PostMapping("/number")
    public String comparison(@RequestBody CompareModel compareModel){
        return "comparison " + compareService.comparingTwoNUmber(compareModel);
    }
}
