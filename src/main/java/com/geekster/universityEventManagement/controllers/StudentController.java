package com.geekster.universityEventManagement.controllers;

import com.geekster.universityEventManagement.models.Department;
import com.geekster.universityEventManagement.models.Student;
import com.geekster.universityEventManagement.services.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping(value = "/students/all")
    public Iterable<Student> getAllStudent(){
        return studentService.getAllStudent();
    }


    @GetMapping(value = "/student/id/{id}")
    public Optional<Student> getStudentById(@PathVariable Integer id){
        return studentService.getStudentById(id);
    }


    @PostMapping(value = "/student/add")
    public String addStudent(@RequestBody Student student){
       return studentService.addStudent(student);
    }
    @PostMapping(value = "/students/add")
    public String addStudents(@RequestBody List<Student>studentList){
        return studentService.addStudents(studentList);
    }


    @PutMapping(value = "/student/{studentId}/{department}")
    public  void updateStudentById(@Valid @PathVariable Integer studentId,@PathVariable Department department){
        studentService.updateStudentById(studentId,department);
    }
    @DeleteMapping(value = "/student/delete/id/{id}")
    public void deleteStudentById(@PathVariable Integer id){
         studentService.removeStudentById(id);
    }
    @DeleteMapping(value = "/students/delete/age/{age}")
    public void removeStudentsByAge(@PathVariable Integer age){
        studentService.removeStudentsByAge(age);
    }


}
