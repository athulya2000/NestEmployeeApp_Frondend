package com.example.NestEmployeeApp_Backend.dao;

import com.example.NestEmployeeApp_Backend.model.NestEmployee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface NestEmployeeDao extends CrudRepository<NestEmployee,Integer>{

    @Query(value="SELECT `id`, `companywebsite`, `designation`, `emailid`, `empcode`, `empname`, `password`, `phoneno`, `salary` FROM `employee` WHERE `emailid`= :emailid AND`password`= :password",nativeQuery = true)
    List<NestEmployee> EmployeeLogin(@Param("emailid") String emailid,@Param("password") String password);
}
