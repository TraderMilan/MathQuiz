package org.example.Quiz.question;

import java.util.List;

public class Question {
    private int number;
    private String question;
    private List<String> answers;
    private String rightAnswers;

    public Question(int number, String question, List<String> answers, String rightAnswers){
        this.number = number;
        this.question = question;
        this.answers = answers;
        this.rightAnswers = rightAnswers;
    }

    public int getNumber() {
        return number;
    }

    public String getQuestion(){
        return question;
    }

    public List<String> getAnswers(){
        return answers;
    }

    public String getRightAnswers() {
        return rightAnswers;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setQuestion(String question){
        this.question = question;
    }

    public void setAnswers(List<String> answers) {
        this.answers = answers;
    }

    public void setRightAnswers(String rightAnswers) {
        this.rightAnswers = rightAnswers;
    }

    public void printQuestion(){
        System.out.println(getNumber() + ". " + getQuestion());
        for (String ans: answers){
            System.out.println(ans);
        }
    }

}
