package com.geekster.universityEventManagement.repositories;

import com.geekster.universityEventManagement.models.Department;
import com.geekster.universityEventManagement.models.Student;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentDao extends CrudRepository<Student,Integer> {
    @Modifying
    @Query(value = "update Student Set department=:dep where student_id =:id",nativeQuery = true)
    void updateStudentDepartmentById( Integer id,String dep);
    @Modifying
    @Query(value = "delete from Student where age =:studentAge",nativeQuery = true)
    void deleteStudentsByAge(Integer studentAge);
}
