package com.example.NestEmployeeApp_Backend.dao;

import com.example.NestEmployeeApp_Backend.model.Addtask;
import org.springframework.data.repository.CrudRepository;

public interface AddtaskDao extends CrudRepository<Addtask,Integer> {
}
