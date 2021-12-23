package com.example.demo.student;

import java.util.Optional;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository 
            extends JpaRepository<Student, Long>{
    
    // Select * from student where email = ? 
    // @Query("select s from student s where s.email = ?1")
    Optional<Student> findStudentByEmail(String email);
}
