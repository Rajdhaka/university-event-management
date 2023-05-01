package com.geekster.universityEventManagement.services;

import com.geekster.universityEventManagement.models.Department;
import com.geekster.universityEventManagement.models.Student;
import com.geekster.universityEventManagement.repositories.IStudentDao;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.codec.StringDecoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    IStudentDao studentDao;
    public Iterable<Student> getAllStudent() {
        return studentDao.findAll();
    }

    public Optional<Student> getStudentById(Integer id) {
        return studentDao.findById(id);

    }

    public String addStudent(Student student) {
        Student addedStudent = studentDao.save(student);
        if(addedStudent != null){
            return "Yes";
        }
        return "No";
    }

    public String addStudents(List<Student> studentList) {
        Iterable<Student> addedStudents = studentDao.saveAll(studentList);
        if(addedStudents != null){
            return "Yes";
        }
        return "No";
    }
    @Transactional
    public void updateStudentById( Integer studentId,Department department) {
        String studentDep =department.name();
        studentDao.updateStudentDepartmentById(studentId,studentDep);
    }

    public void removeStudentById(Integer id){
        studentDao.deleteById(id);
    }

    @Transactional
    public void removeStudentsByAge(Integer age) {
        studentDao.deleteStudentsByAge(age);
    }
}
