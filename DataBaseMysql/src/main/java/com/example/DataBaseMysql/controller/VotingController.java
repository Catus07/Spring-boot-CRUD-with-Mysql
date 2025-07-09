package com.example.DataBaseMysql.controller;

import com.example.DataBaseMysql.model.VotingModel;
import com.example.DataBaseMysql.service.VotingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/voting/")
public class VotingController {
    @Autowired
    public VotingService votingService;
    @PostMapping("age")
    public String checkAge(@RequestBody VotingModel votingModel){

        return " age checking : " +votingService.checkEligible(votingModel);
    }
}
