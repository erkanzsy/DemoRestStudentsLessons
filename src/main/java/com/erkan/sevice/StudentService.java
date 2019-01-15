package com.erkan.sevice;

import com.erkan.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    private List<Student> students;

    public StudentService() {
        students = new ArrayList<>();
        Student student = new Student(0,"Erkan","ÖZSOY","Computer Engineering");
        List<String> lessons = new ArrayList<>();
        lessons.add("Math");
        lessons.add("Programming");
        lessons.add("Spring 101");

        student.setLessons(lessons);
        students.add(student);
        student = new Student(1,"Emrecan","OZTURK","Control And Automation Engineering");
        lessons = new ArrayList<>();
        lessons.add("Math");
        lessons.add("Matlab");
        lessons.add("Physics");
        student.setLessons(lessons);
        students.add(student);
        student = new Student(2,"Umut Can","KUMCU","Lawyer");
        lessons = new ArrayList<>();
        lessons.add("Medeni Hukuk");
        lessons.add("Ceza Hukuku");
        student.setLessons(lessons);
        students.add(student);
    }

    public Student getStudentwithId(int i){
        return students.get(i);
    }

    public List<Student> getAllStudents(){
        return students;
    }

    public List<Student> deleteStudentwithId(int i){
        students.remove(i);
        return students;
    }
}
