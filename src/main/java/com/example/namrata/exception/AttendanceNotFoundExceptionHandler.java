package com.example.namrata.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import com.example.namrata.exception.Error.GlobalError;


@RestControllerAdvice
public class AttendanceNotFoundExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(AttendanceNotFoundException.class)
	public ResponseEntity<GlobalError> fizzException(AttendanceNotFoundException attendancenotfound) {
		
		GlobalError globalError=new GlobalError();
		globalError.setErrorReason("Bad Request");
		globalError.setMessage("Employee Attendance is Not Present in our Database");
		return new ResponseEntity<GlobalError>(globalError,HttpStatus.BAD_REQUEST);
		
	}
	
}

