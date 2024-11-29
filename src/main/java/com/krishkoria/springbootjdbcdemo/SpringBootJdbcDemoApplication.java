package com.krishkoria.springbootjdbcdemo;

import com.krishkoria.springbootjdbcdemo.model.Student;
import com.krishkoria.springbootjdbcdemo.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringBootJdbcDemoApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringBootJdbcDemoApplication.class, args);
        Student s = context.getBean(Student.class);
        s.setRollNo(1);
        s.setName("Krish");
        s.setMarks("100");
        StudentService service = context.getBean(StudentService.class);
        service.addStudent(s);

        List<Student> studentList = service.getAllStudents();
        System.out.println(studentList);
    }

}
