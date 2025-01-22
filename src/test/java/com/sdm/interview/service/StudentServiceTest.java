package com.sdm.interview.service;

import com.sdm.interview.persistance.repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class StudentServiceTest {
    private final StudentRepository studentRepository = Mockito.mock(StudentRepository.class);
    private final StudentService studentService = new StudentService(studentRepository);

    @Test
    void shouldReturnStudentById() {

    }

    @Test
    void shouldThrowExceptionWhenStudentNotFound() {

    }
}
