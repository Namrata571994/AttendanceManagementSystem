package com.example.namrata.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.namrata.model.Attendance;

public interface AttendanceRepository  extends JpaRepository<Attendance, Long>{

}
