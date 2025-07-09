package com.example.DataBaseMysql.controller;

import com.example.DataBaseMysql.model.GradeModel;
import com.example.DataBaseMysql.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/grade/")
public class GradeController {
    @Autowired
    public GradeService gradeService;

    @PostMapping("/average")
    public String checkingGrade(@RequestBody GradeModel gradeModel){
        return gradeService.checkGrade(gradeModel);
    }
}
