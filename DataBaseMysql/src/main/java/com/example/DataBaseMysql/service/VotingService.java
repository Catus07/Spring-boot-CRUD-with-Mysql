package com.example.DataBaseMysql.service;

import com.example.DataBaseMysql.model.VotingModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VotingService {
    public String checkEligible(VotingModel votingModel){
        int ages = votingModel.getAge();
        if (ages >= 18){
            return " is eligible" + ages;
        }else{
            return "is not eligible" + ages;
        }

    }
}
