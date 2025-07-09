package com.example.DataBaseMysql.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class EmployeeModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private DepartmentModel departmentModel;

}
