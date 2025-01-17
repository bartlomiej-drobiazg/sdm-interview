package com.sdm.interview.service;

import com.sdm.interview.entity.Student;
import com.sdm.interview.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student getStudentByEmail(String email) {
        return studentRepository.findByEmail(email);
    }

    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }
}
