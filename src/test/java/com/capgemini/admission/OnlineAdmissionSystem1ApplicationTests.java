package com.capgemini.admission;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.capgemini.admission.dto.CollegeDTO;
import com.capgemini.admission.dto.CourseDTO;
import com.capgemini.admission.dto.UniversityDTO;
import com.capgemini.admission.service.IBranchService;
import com.capgemini.admission.service.ICollegeService;
import com.capgemini.admission.service.ICourseService;
import com.capgemini.admission.service.IUniversityService;

@SpringBootTest
class OnlineAdmissionSystem1ApplicationTests {

	@Autowired
	private IUniversityService universityService;

	@Autowired
	private ICollegeService collegeService;
	@Autowired
	private IBranchService branchService;
	@Autowired
	private ICourseService courseService;

	// @Test
	void contextLoads() {
	}

	@Test
	void testgetByUniversityId() {
		UniversityDTO u = universityService.getByUniversityId(38);
		assertEquals("JNTUH", u.getName());
	}

	@Test
	void testgetByClgId() {
		CollegeDTO c = collegeService.getByClgId(40);
		assertEquals("CBIT", c.getCollegeName());
	}

	@Test
	void testgetByCourseId() {
		CourseDTO c = courseService.getByCourseId(42);
		assertEquals("BTECH", c.getCourseName());
		assertEquals("12th pass", c.getEligibity());
	}
}
