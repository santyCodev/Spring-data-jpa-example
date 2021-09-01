package com.santycodev.springdatajpa.repository;

import com.santycodev.springdatajpa.model.student.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
