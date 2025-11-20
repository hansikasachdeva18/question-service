package com.example.question_service.controller;


import com.example.question_service.model.Question;
import com.example.question_service.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// This is a Spring Boot REST Controller that exposes
// REST APIs for anything related to Questions in a quiz application.
//It receives HTTP requests → passes them to QuestionService → returns a response to the client.
// we talk about all API in out project in controller package
@RestController
// Tells Spring that this class contains REST API endpoints that return JSON.
// rest api
@RequestMapping("/question")
// This means all APIs inside this class will start with: /question/...
// https://leetcode.com/problems/flip-equivalent-binary-trees/ example
public class QuestionController {

    @Autowired
    private QuestionService questionService;
    // write method first
    @GetMapping("/allQuestions")
    public ResponseEntity<List<Question>> getAllQuestions(){
        // ResponseEntity -> instead returning ArraysList convert this in json format
        // why json ormat -> json commonly used
        // Question -> class
        return questionService.getAllQuestions();
    }


    @GetMapping("/hello")
    public String hello() {
        return "<h1>Hello World</h1>";
    }


}
// put -> updating

//constroller -> ask to service -> service ask to dao and dao ask to db
// db returns to dao -> serice -> controller
