package com.example.DataBaseMysql.controller;

import com.example.DataBaseMysql.model.BestSellerModel;
import com.example.DataBaseMysql.service.BestSellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/bestseller/")
public class BestSellerController {

    @Autowired
    public BestSellerService bestSellerService;

    @PostMapping("postsales")
    public BestSellerModel postBestSeller(@RequestBody BestSellerModel bestSellerModel){
        return bestSellerService.addSales(bestSellerModel);
    }
    @GetMapping("/sales/{id}")
    public ResponseEntity<BestSellerModel> getSales(@PathVariable Long id){
        return ResponseEntity.ok(bestSellerService.getSales(id));
    }
}
