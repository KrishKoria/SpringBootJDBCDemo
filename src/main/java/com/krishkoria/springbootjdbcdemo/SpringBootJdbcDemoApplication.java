package com.krishkoria.springbootjdbcdemo;

import com.krishkoria.springbootjdbcdemo.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootJdbcDemoApplication {

    public static void main(String[] args) {
       ApplicationContext context = SpringApplication.run(SpringBootJdbcDemoApplication.class, args);
       Student s = context.getBean(Student.class);
       s.setRollNo(1);
       s.setName("Krish");
       s.setMarks("100");

    }

}
