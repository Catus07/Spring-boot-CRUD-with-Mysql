package com.example.DataBaseMysql.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class GradeModel {
    @NotNull
    private int grade;


}
