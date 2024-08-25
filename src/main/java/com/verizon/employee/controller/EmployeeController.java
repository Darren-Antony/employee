package com.verizon.employee.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.verizon.employee.entity.Employee;
import com.verizon.employee.respository.employeeRepository;
import com.verizon.employee.service.EmployeeService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
@RequestMapping("/Employee")
public class EmployeeController {
    @Autowired
    EmployeeService empService;

    @PostMapping
    public ResponseEntity<Employee> addEmp(@RequestBody Employee emp) {
        return ResponseEntity.ok(empService.addEmp(emp)) ;
    }

    @GetMapping
    public ResponseEntity<List<Employee>> getEmp() {
       
        
        return ResponseEntity.ok(empService.getEmp());
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmpById(@PathVariable int id) {
        return ResponseEntity.ok(empService.getEmpById(id).get());
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<Employee> updateEmp(@PathVariable int id, @RequestBody Employee emp) {
        
        
        return ResponseEntity.ok(empService.updateEmp(id, emp));
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEmp(@PathVariable int id){
         empService.deleteEmp(id);
         return ResponseEntity.noContent().build();
    }

}
