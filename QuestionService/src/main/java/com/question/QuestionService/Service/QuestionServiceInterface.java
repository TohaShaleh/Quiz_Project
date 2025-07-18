package com.question.QuestionService.Service;

import com.question.QuestionService.Entities.Question;

import java.util.List;

public interface QuestionServiceInterface {

    Question findById(Long id);
    List<Question> findAll();
    Question create(Question question);
    Question deleteById(Long id);
}
