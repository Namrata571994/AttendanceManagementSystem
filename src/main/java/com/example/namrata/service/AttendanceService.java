package com.example.namrata.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.namrata.exception.AttendanceNotFoundException;
import com.example.namrata.model.Attendance;
import com.example.namrata.repository.AttendanceRepository;

@Service
public class AttendanceService {
	@Autowired
private AttendanceRepository attendanceRepository;


public AttendanceService(AttendanceRepository attendanceRepository) {
this.attendanceRepository = attendanceRepository;
}

public List<Attendance> getAllAttendances() {
return attendanceRepository.findAll();
	//return attendanceRepository.deleteAll();
}

public Attendance getAttendanceById(Long id) {
Optional<Attendance> attendance = attendanceRepository.findById(id);
if (attendance.isPresent()) {
return attendance.get();
} else {
throw new AttendanceNotFoundException("Attendance not found with id: " + id);
}
}

public Attendance saveAttendance(Attendance attendance) {
return attendanceRepository.save(attendance);
}

	public void deleteAllAttendance() {
		attendanceRepository.deleteAll();
	}



public void deleteAttendance(Long id)  {
Optional<Attendance> attendance = attendanceRepository.findById(id);
if (attendance.isPresent()) {
attendanceRepository.deleteById(id);
} else {
throw new AttendanceNotFoundException("Attendance not found with id: " + id);
}
}

public Attendance updateAttendance(Long id) {
	// TODO Auto-generated method stub
	Attendance attendance= attendanceRepository.findById(id).get();
	attendance.setEmployeeId("100000");
	attendanceRepository.save(attendance);
	return attendance;
 
}
}

