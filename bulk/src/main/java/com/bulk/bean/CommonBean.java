package com.bulk.bean;

import com.bulk.annotation.Validation;

public class CommonBean {

	
//	@ExcelColumnName(value = "STUDENT NAME")
	@Validation
	private String studentName;

	@Validation
	private int location;

	public String getStudentName() {
		return studentName;
	}

	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public int getLocation() {
		return location;
	}


	public void setLocation(int location) {
		this.location = location;
	}
	
	

//	public String getLocation() {
//		return location;
//	}
//
//	public void setLocation(String location) {
//		this.location = location;
//	}

/*	@Validation
	private void validate() {

		this.studentName = this.studentName.toUpperCase();
		System.out.println(studentName);

	}*/

}
