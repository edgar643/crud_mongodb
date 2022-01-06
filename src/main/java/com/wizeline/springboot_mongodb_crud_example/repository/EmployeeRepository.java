/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.wizeline.springboot_mongodb_crud_example.repository;

import com.wizeline.springboot_mongodb_crud_example.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author edgargarcia
 */
public interface EmployeeRepository extends MongoRepository<Employee, Long> {
    
}
