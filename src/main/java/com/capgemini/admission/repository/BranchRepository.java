package com.capgemini.admission.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.capgemini.admission.dto.BranchDTO;
import com.capgemini.admission.entity.Branch;
import com.capgemini.admission.entity.Course;
@Repository
public interface BranchRepository extends CrudRepository<Branch, Integer>{

	//Optional<Branch> findById(Integer branchId);

	 @Query(value = "select c.branchList from Course c where c.courseId=:courseId ")
	    List<Branch>FindBranchesByCourseId(@Param("courseId")Integer courseId);
	    @Query(value="select c.branchList from College c where c.collegeRegId=:collegeRegId")
	    List<Branch>FindBranchesByCollegeRegId(@Param("collegeRegId")Integer collegeRegId);

	 


	

}
