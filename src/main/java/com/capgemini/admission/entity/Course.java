package com.capgemini.admission.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "courses")
public class Course {
	@Id
	@GeneratedValue
	private int courseId;
	private String courseName;
	private String eligibity;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "collegeReg_Id")
	@JsonIgnore
	private College college;

	@OneToMany(mappedBy = "course", fetch = FetchType.EAGER)
	@JsonBackReference
	private List<Branch> branchList = new ArrayList<>();

	public Course() {
		super();

	}

	public Course(int courseId, String courseName, String eligibity, College college, List<Branch> branchList) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.eligibity = eligibity;
		this.college = college;
		this.branchList = branchList;
	}

	public List<Branch> getBranchList() {
		return branchList;
	}

	public void setBranchList(List<Branch> branchList) {
		this.branchList = branchList;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getEligibity() {
		return eligibity;
	}

	public void setEligibity(String eligibity) {
		this.eligibity = eligibity;
	}

	public College getCollege() {
		return college;
	}

	public void setCollege(College college) {
		this.college = college;
	}

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", eligibity=" + eligibity + ", college="
				+ college + ", branchList=" + branchList + "]";
	}

}
