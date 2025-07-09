package com.example.DataBaseMysql.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
//@Table(name = "catus")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;

}