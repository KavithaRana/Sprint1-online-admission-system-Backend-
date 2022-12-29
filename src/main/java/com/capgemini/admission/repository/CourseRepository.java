package com.capgemini.admission.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.admission.entity.Course;

@Repository
public interface CourseRepository extends CrudRepository<Course, Integer> {

}
