package com.example.namrata.controller;

import com.example.namrata.model.Attendance;
import com.example.namrata.service.AttendanceService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/attendances")
public class AttendanceController {

private AttendanceService attendanceService;

@Autowired
public AttendanceController(AttendanceService attendanceService) {
this.attendanceService = attendanceService;
}

@GetMapping
public List<Attendance> getAllAttendances() {
return attendanceService.getAllAttendances();
}

@GetMapping("/{id}")
public Attendance getAttendanceById(@PathVariable Long id) {
return attendanceService.getAttendanceById(id);
}

@PostMapping
//@ResponseStatus(code=HttpStatus.CREATED)
public ResponseEntity<String> createAttendance(@RequestBody Attendance attendance) {
	attendanceService.saveAttendance(attendance);
return ResponseEntity.status(HttpStatus.CREATED).body("FYI- Attendance Inserted Sucessfully");
		
}

@PutMapping("/update/{id}")
public Attendance updateAttendance(@PathVariable Long id) {
	return attendanceService.updateAttendance(id);
	
}

@DeleteMapping
@ResponseStatus(code=HttpStatus.NO_CONTENT)
public void deleteAttendance() {
attendanceService.deleteAllAttendance();

}

@DeleteMapping("/{id}")
public void deleteAttendance(@PathVariable Long id) {
attendanceService.deleteAttendance(id);
}

}
	
	

