package com.example.NestEmployeeApp_Backend.dao;

import com.example.NestEmployeeApp_Backend.model.NestEmployee;
import org.springframework.data.repository.CrudRepository;

public interface NestEmployeeDao extends CrudRepository<NestEmployee,Integer>{
}
