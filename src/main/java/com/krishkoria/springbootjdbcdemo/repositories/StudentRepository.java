package com.krishkoria.springbootjdbcdemo.repositories;

import com.krishkoria.springbootjdbcdemo.model.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentRepository {

    public void save(Student s) {
        System.out.println("Student added: " + s);
    }

    public List<Student> findAll() {
        return List.of();
    }
}
