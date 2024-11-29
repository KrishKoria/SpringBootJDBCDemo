package com.krishkoria.springbootjdbcdemo.repositories;

import com.krishkoria.springbootjdbcdemo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

import static java.lang.Integer.parseInt;

@Repository
public class StudentRepository {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void save(Student s) {
        System.out.println("Student added: " + s);
        int rows = jdbcTemplate.update("insert into student values (?,?,?)", s.getRollNo(), s.getName(), parseInt(s.getMarks()));
        System.out.println("Rows inserted: " + rows);
    }

    public List<Student> findAll() {
        return jdbcTemplate.query("select * from student", (rs, rowNum) -> {
                Student s = new Student();
                s.setRollNo(rs.getInt("rollno"));
                s.setName(rs.getString("name"));
                s.setMarks(rs.getString("marks"));
                return s;
        });
    }
}
