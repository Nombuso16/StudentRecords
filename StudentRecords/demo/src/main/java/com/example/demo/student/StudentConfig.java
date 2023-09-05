package com.example.demo.student;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

/**
 *  This class is our configuration file
 */
@Configuration
public class StudentConfig {

    /**
     * Commandline to populate our database
     * @param  repository used to save our student data
     * @return arguments of 2 students data and the saving
     * of the 2 students with the Student repository
     */
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student nombuso = new Student(
                    "Nombuso",
                    "dlamini.nombuso0407@gmail.com",
                    LocalDate.of(2004, Month.JULY, 5),
                    19
            );

            Student vezi = new Student(
                    "Vezi",
                    "nene@gmail.com",
                    LocalDate.of(2004, Month.MARCH, 15),
                    19
            );

            repository.saveAll(
                    List.of(nombuso, vezi)
            );

        };
    }
}
