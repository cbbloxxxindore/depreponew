package com.vanguard.departmentservice.repository;

import com.vanguard.departmentservice.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository  extends JpaRepository<Department,Integer> {
}
