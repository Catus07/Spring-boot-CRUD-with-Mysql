package com.example.DataBaseMysql.controller;

import com.example.DataBaseMysql.model.DepartmentModel;
import com.example.DataBaseMysql.repo.DepartmentRepository;
import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/departments")
public class DepartmentController {
    @Autowired
    private DepartmentRepository departmentRepository;

    @PostMapping
    public DepartmentModel createDepartment(@RequestBody DepartmentModel departmentModel){
        return departmentRepository.save(departmentModel);
    }
    @GetMapping("/getData")
    public List<DepartmentModel> getDapartment(){
        return departmentRepository.findAll();
    }
}
