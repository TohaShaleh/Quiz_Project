package com.question.QuestionService.Controller;


import com.question.QuestionService.Entities.Question;
import com.question.QuestionService.Service.QuestionServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController{
    private QuestionServiceImpl questionService;
    public QuestionController(QuestionServiceImpl questionService){
        this.questionService = questionService;
    }

    @PostMapping
    public Question create(@RequestBody Question question){
        return questionService.create(question);
    }

    @GetMapping("/{id}")
    public Question findById(@PathVariable Long id){
        return questionService.findById(id);
    }

    @GetMapping
    public List<Question> findAll(){
        return questionService.findAll();
    }

    @DeleteMapping("/{id}")
    public Question deleteById(@PathVariable Long id){
        return questionService.deleteById(id);
    }
}
