package com.example.DataBaseMysql.service;

import com.example.DataBaseMysql.model.GradeModel;
import com.example.DataBaseMysql.model.GreaterNumberModel;
import org.springframework.stereotype.Service;

@Service
public class GradeService {

    public String checkGrade(GradeModel gradeModel){
        int gradeValue = gradeModel.getGrade();
        if (gradeValue >= 80){
            return "A grade : " + gradeValue;
        }else if (gradeValue >=60 && gradeValue<=79){
            return "B grade" + gradeValue;
        }else if (gradeValue>=40 && gradeValue<=60){
            return "C grade" + gradeValue;
        }
        return "final check";
    }
    public int checkGreater(GreaterNumberModel greaterNumberModel){
        return greaterNumberModel.getNumber();
    }
}
