package com.example.DataBaseMysql.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class BestSellerModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private int price;
    private String bookTitle;
    private int copySold;

   @Transient
    private String Status;


}
