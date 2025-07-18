package com.quiz.QuizService.Services;

import com.quiz.QuizService.Entities.Quiz;
import com.quiz.QuizService.Repositories.QuizRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class QuizServiceImpl implements QuizServiceInterface{

    private QuizRepository quizRepository;
    public QuizServiceImpl(QuizRepository quizRepository) {
        this.quizRepository = quizRepository;
    }


    @Override
    public Quiz findById(Long id) {
        Optional<Quiz> quiz = quizRepository.findById(id);
        if (quiz.isPresent()) {
            return quiz.get();
        } else {
            throw new NoSuchElementException("Quiz not found with id: " + id);
        }
    }

    @Override
    public List<Quiz> findAll() {
        return quizRepository.findAll();
    }

    @Override
    public Quiz createQuiz(Quiz quiz) {
        return quizRepository.save(quiz);
    }

    @Override
    public Quiz deleteById(Long id) {
        Optional<Quiz> quiz = quizRepository.findById(id);
        if(quiz.isPresent()){
            quizRepository.deleteById(id);
            return quiz.get();
        }
        else
        {
            throw new NoSuchElementException("Quiz not found with id: " + id);
        }
    }


}
