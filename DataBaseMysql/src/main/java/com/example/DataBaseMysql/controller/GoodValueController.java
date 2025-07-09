package com.example.DataBaseMysql.controller;

import com.example.DataBaseMysql.model.GoodValueModel;
import com.example.DataBaseMysql.service.GoodValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/product")
public class GoodValueController {
    @Autowired
    public GoodValueService goodValueService;

    @PostMapping("/value")
    public String getValueController(@RequestBody GoodValueModel goodValueModel){
        return "value : " + goodValueService.getGoodValue(goodValueModel);
    }

}
