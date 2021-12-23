package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;
@Configuration
public class StudentConfig {
    
    @Bean
    CommandLineRunner commandLineRuneer(StudentRepository studentRepository) {
        return args -> {
            Student kyper = new Student(
                                            "Kyper",
                                            LocalDate.of(2000, Month.JANUARY, 1),
                                            "kyper@exmaple.com"			 
			                            );
            Student alex = new Student( 
                                        "Alex",
                                        LocalDate.of(2004, Month.JANUARY, 1),
                                        "kyper@exmaple.com"			 
                                    );
            studentRepository.saveAll(List.of(kyper, alex));
        };


    }
}
