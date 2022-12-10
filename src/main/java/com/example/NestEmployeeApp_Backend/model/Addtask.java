package com.example.NestEmployeeApp_Backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="task")
public class Addtask {
    @Id
    @GeneratedValue
    private int id;
    private int employeeId;
    private String empname;
    private String task;

    public Addtask() {
    }

    public Addtask(int id, int employeeId, String empname, String task) {
        this.id = id;
        this.employeeId = employeeId;
        this.empname = empname;
        this.task = task;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }
}


