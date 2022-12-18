package com.example.NestEmployeeApp_Backend.dao;

import com.example.NestEmployeeApp_Backend.model.Addtask;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AddtaskDao extends CrudRepository<Addtask,Integer> {

    @Query(value="SELECT `id`, `employee_id`, `empname`, `task` FROM `task` WHERE `employee_id`= :employeeId",nativeQuery = true)
    List<Addtask> ViewMyTask(@Param("employeeId") Integer employeeId);


}
