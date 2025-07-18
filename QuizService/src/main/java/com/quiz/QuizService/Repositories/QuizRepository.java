package com.quiz.QuizService.Repositories;

import com.quiz.QuizService.Entities.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizRepository extends JpaRepository<Quiz,Long> {

}
