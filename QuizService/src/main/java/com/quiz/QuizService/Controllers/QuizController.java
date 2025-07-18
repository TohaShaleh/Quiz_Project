package com.quiz.QuizService.Controllers;

import com.quiz.QuizService.Entities.Quiz;
import com.quiz.QuizService.Services.QuizServiceImpl;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizController {

    private QuizServiceImpl quizService;
    public QuizController(QuizServiceImpl quizService) {
        this.quizService = quizService;
    }

    @GetMapping
    public List<Quiz> findAll() {
        return quizService.findAll();
    }

    @GetMapping("/{id}")
    Quiz findById(@PathVariable Long id) {
        return quizService.findById(id);
    }

    @PostMapping
    public Quiz create(@RequestBody Quiz quiz)
    {
        return quizService.createQuiz(quiz);
    }

    @DeleteMapping("/{id}")
    public Quiz deleteById(@PathVariable Long id) {
        return quizService.deleteById(id);
    }
}
