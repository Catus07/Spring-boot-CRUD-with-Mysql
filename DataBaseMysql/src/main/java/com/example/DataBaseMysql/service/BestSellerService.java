package com.example.DataBaseMysql.service;

import com.example.DataBaseMysql.model.BestSellerModel;
import com.example.DataBaseMysql.repo.BestSellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BestSellerService {
    @Autowired
    public BestSellerRepository bestSellerRepository;

    public BestSellerModel addSales(BestSellerModel bestSellerModel){
        return bestSellerRepository.save(bestSellerModel);
    }
    public BestSellerModel getSales(Long id){
        BestSellerModel mode = bestSellerRepository.findById(id).orElse(new BestSellerModel());
        if(mode.getPrice()>100000 ){
            mode.setStatus("BESTSALES");
        }else {
            mode.setStatus("OK");
        }
        return mode;
    }




}
