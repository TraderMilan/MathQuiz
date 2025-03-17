package org.example.Quiz;

import org.example.Quiz.question.Question;

import java.util.List;

public class Quiz {
    private final List<Question> questions;

    public Quiz(List<Question> questions){
        this.questions = questions;
    }

    public void getQuestion(int number){
        for (Question question: questions){
            if(question.getNumber() == number){
                question.printQuestion();
                break;
            }

        }
    }

}
