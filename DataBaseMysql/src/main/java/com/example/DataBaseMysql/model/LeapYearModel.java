package com.example.DataBaseMysql.model;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class LeapYearModel {
    @NotNull(message = "cant be null")
    public int year;


}
