package com.example.DataBaseMysql.model;

import jakarta.persistence.*;

import java.util.List;


@Entity
public class DepartmentModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private  String name;

    @OneToMany(mappedBy="departmentModel", cascade=CascadeType.ALL)
    private List<EmployeeModel> employee;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
