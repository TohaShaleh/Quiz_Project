package com.question.QuestionService.Service;

import com.question.QuestionService.Entities.Question;
import com.question.QuestionService.Repository.QuestionRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuestionServiceImpl implements QuestionServiceInterface{

    private QuestionRepository questionRepository;
    public QuestionServiceImpl(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    @Override
    public Question findById(Long id) {
        Optional<Question> question=questionRepository.findById(id);
        if(question.isPresent()){
            return question.get();
        }
        else {
            throw new RuntimeException("Question with id :"+id+" not found");
        }
    }

    @Override
    public List<Question> findAll() {
        return questionRepository.findAll();
    }

    @Override
    public Question create(Question question) {
        return questionRepository.save(question);
    }

    @Override
    public Question deleteById(Long id) {
        Optional<Question> question=questionRepository.findById(id);
        if(question.isPresent()){
            questionRepository.deleteById(id);
            return question.get();
        }
        else{
            throw new RuntimeException("Question with id :"+id+" not found");
        }
    }


    @Override
    public List<Question> findByQuizId(Long id) {
        return questionRepository.findByQuizId(id);
    }

}
