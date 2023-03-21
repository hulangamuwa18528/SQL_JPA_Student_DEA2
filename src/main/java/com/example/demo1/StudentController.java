package com.example.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentRepository studentRepository;

    @GetMapping(value = "/student") //read all
    public List<Student> getAllStudent()
    {
        return studentRepository.findAll();
    }

    @PostMapping(value = "/student") //create
    public Student add(@RequestBody Student student)
    {
        return studentRepository.save(student);
    }

    @GetMapping(value = "/student/{id}") //read by id
    public Student getById(@PathVariable String id)
    {
        return studentRepository.findStudentById(id);
    }

    @DeleteMapping(value = "/student/{id}") //delete
    public void delete(@PathVariable String id)
    {
        studentRepository.deleteById(id);
    }

    @PutMapping(value = "/student/{id}") //update
    public Student update(@PathVariable String id,@RequestBody Student student)
    {
        studentRepository.deleteById(id);
        return studentRepository.save(student);
    }
}
