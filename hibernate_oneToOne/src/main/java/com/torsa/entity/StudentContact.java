package com.torsa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity

@Table(name = "student_contact")
public class StudentContact {

	private String phone;
	private Student student;
	
	
	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Column(name = "Phone_Number",  nullable = false)
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Column(name = "Address",  nullable = false)
	public String getAddess() {
		return addess;
	}

	public void setAddess(String addess) {
		this.addess = addess;
	}
	@GenericGenerator(name = "generator", strategy = "foreign", 
			parameters = @Parameter(name = "property", value = "student"))
			@Id
			@GeneratedValue(generator = "generator")
			@Column(name = "Student_Id", unique = true, nullable = false)
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	private String addess;
	
	private int studentId;

}
