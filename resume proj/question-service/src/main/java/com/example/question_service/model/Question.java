package com.example.question_service.model;

// model== int dn it is table(table)
// Here we are trying to follow mvc architecture
// Question class tell that what data we are going to store in this table


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor // why
@AllArgsConstructor
@Entity
// having get methods for these peroperties and set method for thsese properties
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // structure of our table
    // all these are column
    private int id;
    @Column(name = "question_title")
    private String questionTitle;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    @Column(name = "difficulty_level")
    private String difficultyLevel;
    private String category;
}
