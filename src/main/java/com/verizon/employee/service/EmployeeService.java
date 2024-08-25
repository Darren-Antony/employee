package com.verizon.employee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.verizon.employee.entity.Employee;
import com.verizon.employee.respository.employeeRepository;

@Service
public class EmployeeService {
@Autowired
employeeRepository empRepo;

public Employee addEmp(Employee employee){
    return empRepo.save(employee);

}

public  List<Employee> getEmp(){
    return empRepo.findAll();
}

public Optional<Employee> getEmpById(int id){
    return empRepo.findById(id);
}

public Employee updateEmp(int id ,Employee emp){
    return empRepo.save(emp);
}

public void deleteEmp(int id){
    empRepo.deleteById(id);
}
}
