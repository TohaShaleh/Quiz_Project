package com.quiz.QuizService.Services;

import com.quiz.QuizService.Entities.Quiz;

import java.util.List;

public interface QuizServiceInterface {

    Quiz findById(Long id);
    List<Quiz> findAll();
    Quiz createQuiz(Quiz quiz);
    Quiz deleteById(Long id);
    List<Quiz> findByTitle(String Title);
}
