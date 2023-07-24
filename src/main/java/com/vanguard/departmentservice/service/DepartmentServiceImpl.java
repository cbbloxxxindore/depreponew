package com.vanguard.departmentservice.service;

import com.vanguard.departmentservice.models.Department;
import com.vanguard.departmentservice.repository.DepartmentRepository;
import org.springframework.stereotype.Service;
@Service
public class DepartmentServiceImpl  implements  DepartmentService{
    private DepartmentRepository departmentRepository;

    public DepartmentServiceImpl(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }
}
