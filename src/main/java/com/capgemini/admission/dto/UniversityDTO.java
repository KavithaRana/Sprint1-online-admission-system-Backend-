package com.capgemini.admission.dto;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotBlank;

public class UniversityDTO{
	
	@NotBlank(message = "The University Name should not be blank,empty or Null")
	public String name;

	public int universityId;
	public List<CollegeDTO> collegeList = new ArrayList<CollegeDTO>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getUniversityId() {
		return universityId;
	}

	public void setUniversityId(int universityId) {
		this.universityId = universityId;
	}

	public List<CollegeDTO> getCollegeList() {
		return collegeList;
	}

	public void setCollegeList(List<CollegeDTO> collegeList) {
		this.collegeList = collegeList;
	}

}
