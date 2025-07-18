package com.question.QuestionService.Repository;

import com.question.QuestionService.Entities.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface QuestionRepository extends JpaRepository<Question,Long> {

}
