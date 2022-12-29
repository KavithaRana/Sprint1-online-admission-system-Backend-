package com.capgemini.admission.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.capgemini.admission.dto.CollegeDTO;
import com.capgemini.admission.entity.College;
@Repository
public interface CollegeRepository extends CrudRepository<College, Integer> {
	
	 @Query(
	            value = 
	            "select u.collegeList from University u where u.universityId=:universityId")



	            List<College> FindCollegesByUniversityId(@Param("universityId") Integer universityId );


	 
}
