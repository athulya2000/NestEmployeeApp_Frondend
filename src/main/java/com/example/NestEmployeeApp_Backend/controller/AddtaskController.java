package com.example.NestEmployeeApp_Backend.controller;

import com.example.NestEmployeeApp_Backend.dao.AddtaskDao;
import com.example.NestEmployeeApp_Backend.model.Addtask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class AddtaskController {
    @Autowired
    private AddtaskDao dao1;
    @CrossOrigin(origins = "*")
    @PostMapping(path="/addtask",consumes = "application/json",produces = "application/json")
    public Map<String,String> Addtask(@RequestBody Addtask a){
        HashMap<String,String> map=new HashMap<>();
        dao1.save(a);
        map.put("status","success");
        return map;
    }
}
