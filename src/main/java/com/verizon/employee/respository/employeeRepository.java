package com.verizon.employee.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.verizon.employee.entity.Employee;

public interface employeeRepository extends JpaRepository<Employee,Integer>{

}
