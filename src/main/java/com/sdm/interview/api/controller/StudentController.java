package com.sdm.interview.api.controller;

import java.util.List;
import java.util.stream.Collectors;

import com.sdm.interview.api.dto.StudentDto;
import com.sdm.interview.service.StudentService;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    private final StudentService studentService;
    private final ModelMapper modelMapper;

    public StudentController(StudentService studentService, ModelMapper modelMapper) {
        this.studentService = studentService;
        this.modelMapper = modelMapper;
    }

    @GetMapping("api/v1/students")
    public ResponseEntity<List<StudentDto>> getAllStudents() {
        var students = studentService.getAllStudents();
        var studentsList = students.stream().map(student -> modelMapper
                .map(student, StudentDto.class)).collect(Collectors.toList());
        return ResponseEntity.ok(studentsList);
    }
}
