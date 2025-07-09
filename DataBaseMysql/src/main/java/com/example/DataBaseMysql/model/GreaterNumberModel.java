package com.example.DataBaseMysql.model;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class GreaterNumberModel {
    @NotNull(message = "cant be null")
    private int number;


}
