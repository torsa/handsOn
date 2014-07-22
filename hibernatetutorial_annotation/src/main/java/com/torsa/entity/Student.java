package com.torsa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import static javax.persistence.GenerationType.IDENTITY;

@Entity

@Table(name = "student")
public class Student implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8682098994704712078L;

	private int studentId;
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "Student_Id", unique = true, nullable = false)
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	@Column(name = "First_Name",  nullable = false)
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name = "Last_Name",  nullable = false)
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	private String firstName;
	
	private String lastName;
	
	
}
