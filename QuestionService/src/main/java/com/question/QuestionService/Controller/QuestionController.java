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

    @GetMapping
    public List<Question> findAll(){
        return questionService.findAll();
    }

    @PostMapping("/add")
    public Question create(@RequestBody Question question){
        return questionService.create(question);
    }

    @GetMapping("/{id}")
    public Question findById(@PathVariable Long id){
        return questionService.findById(id);
    }


    @DeleteMapping("/delete/{id}")
    public Question deleteById(@PathVariable Long id)
    {
        return questionService.deleteById(id);
    }


    @GetMapping("/quiz/{quizId}")
    public List<Question> findAllByQuizId(@PathVariable Long quizId){
        return questionService.findByQuizId(quizId);

    }

}
