package com.example.NestEmployeeApp_Backend.controller;

import com.example.NestEmployeeApp_Backend.dao.NestEmployeeDao;
import com.example.NestEmployeeApp_Backend.model.NestEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class NestEmployeeController {
    @Autowired
    private NestEmployeeDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addemployee", consumes = "application/json", produces = "application/json")
    public Map<String, String> AddEmployee(@RequestBody NestEmployee n) {
        HashMap<String, String> map = new HashMap<>();
        dao.save(n);
        map.put("status", "success");
        return map;

    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/employeelogin", consumes = "application/json", produces = "application/json")
    public Map<String, String> EmployeeLogin(@RequestBody NestEmployee n) {
        String emailid = n.getEmailid().toString();
        String password = n.getPassword().toString();
        List<NestEmployee> result = (List<NestEmployee>) dao.EmployeeLogin(n.getEmailid(), n.getPassword());
        HashMap<String, String> st = new HashMap<>();
        st.put("employeeId", String.valueOf(result.get(0).getId()));
        if (result.size() == 0) {
            st.put("status", "failed");

        } else {
            st.put("status", "success");
        }
        return st;
    }
}