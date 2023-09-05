package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * This interface is responsible for the data access
 * Basically this is our Data Access Layer
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
