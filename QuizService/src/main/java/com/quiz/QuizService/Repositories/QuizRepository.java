package com.quiz.QuizService.Repositories;

import com.quiz.QuizService.Entities.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuizRepository extends JpaRepository<Quiz,Long> {
    List<Quiz> findByTitleContainingIgnoreCase(String Title); //Partial + Case-insensitive Search
}
