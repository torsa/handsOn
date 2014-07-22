package com.torsa.entity;

public class Student implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8682098994704712078L;

	private int studentId;
	
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	private String firstName;
	
	private String lastName;
	
	
}
