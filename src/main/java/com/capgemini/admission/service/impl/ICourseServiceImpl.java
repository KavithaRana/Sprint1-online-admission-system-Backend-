package com.capgemini.admission.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.admission.dto.CourseDTO;
import com.capgemini.admission.entity.College;
import com.capgemini.admission.entity.Course;
import com.capgemini.admission.repository.CollegeRepository;
import com.capgemini.admission.repository.CourseRepository;
import com.capgemini.admission.service.ICourseService;

@Service
public class ICourseServiceImpl implements ICourseService {
	// Inject dependency of CourseRepository
	@Autowired
	private CourseRepository repository;

	@Autowired
	private CollegeRepository collegeRepository;

	@Override
	public CourseDTO saveCourse(CourseDTO courseDTO) {
		int collegeRegId = courseDTO.getCollegeRegId();
		College college = collegeRepository.findById(collegeRegId).get();

		if (college != null) {
			Course course = new Course();// Empty Entity Object
			BeanUtils.copyProperties(courseDTO, course);
			course.setCollege(college);
			course.setCourseName(courseDTO.getCourseName());
			course.setEligibity(courseDTO.getEligibity());
			repository.save(course);

		}

		return courseDTO;
	}

	@Override
	public CourseDTO updateCourse(CourseDTO courseDTO) {
		// convert the DTO to entity
		Course course = new Course();
		BeanUtils.copyProperties(courseDTO, course);
		repository.save(course);
		return courseDTO;
	}

	@Override
	public boolean deleteCourse(CourseDTO courseDTO) {
		// convert the DTO to entity
		Course course = new Course();
		BeanUtils.copyProperties(courseDTO, course);
		repository.delete(course);
		return true;

	}

	@Override
	public CourseDTO getByCourseId(int courseId) {
		Optional<Course> course = repository.findById(courseId);
		if (course.isPresent()) {
			// convert the entity to DTO
			CourseDTO dto = new CourseDTO();
			BeanUtils.copyProperties(course.get(), dto);
			return dto;

		}
		return null;
	}

	@Override
	public List<CourseDTO> findAll() {

		Iterable<Course> list = repository.findAll();
		List<CourseDTO> dtos = new ArrayList<>();
		for (Course c : list) {
			CourseDTO dto = new CourseDTO();
			BeanUtils.copyProperties(c, dto);
			dtos.add(dto);

		}
		return dtos;

	}

}
