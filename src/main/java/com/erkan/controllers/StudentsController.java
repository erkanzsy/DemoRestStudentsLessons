package com.erkan.controllers;

import com.erkan.model.Student;
import com.erkan.sevice.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentsController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/allStudents")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @RequestMapping("/getStudent/{id}")
    public Student getStudentsWithId(@PathVariable int id){
        return studentService.getStudentwithId(id);
    }

    @RequestMapping("/deleteStudent/{id}")
    public List<Student> deleteStudentsWithId(@PathVariable int id){
        return studentService.deleteStudentwithId(id);
    }
}
