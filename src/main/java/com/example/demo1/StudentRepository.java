package com.example.demo1;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,String> {

    Student findStudentById(String id);
}
