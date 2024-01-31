package com.example.namrata.model;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;

@Entity
//@NoArgsConstructor
//@AllArgsConstructor
//@Data
public class Attendance {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

private String employeeId;

private Date date;

private boolean present;

// Constructors, getters and setters

public Attendance() {
}

public Attendance(String employeeId, Date date, boolean present) {
this.employeeId = employeeId;
this.date = date;
this.present = present;
}

// Getters and setters

public Long getId() {
return id;
}

public void setId(Long id) {
this.id = id;
}

public String getEmployeeId() {
return employeeId;
}

public void setEmployeeId(String employeeId) {
this.employeeId = employeeId;
}

public Date getDate() {
return date;
}

public void setDate(Date date) {
this.date = date;
}

public boolean isPresent() {
return present;
}

public void setPresent(boolean present) {
this.present = present;
}
}
