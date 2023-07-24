package com.vanguard.departmentservice.resource;

import com.vanguard.departmentservice.models.Department;
import com.vanguard.departmentservice.service.DepartmentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentResource {


    private DepartmentService departmentService;

    public DepartmentResource(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @PostMapping("/departments")
    public ResponseEntity<Department> createDepartment(@RequestBody Department department)
    {
        Department department1 = departmentService.saveDepartment(department);
return  ResponseEntity.ok(department1);
    }
}
