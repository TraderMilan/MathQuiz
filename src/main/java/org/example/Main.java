package org.example;

import org.example.Quiz.Quiz;
import org.example.Quiz.question.Question;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to my Math Quiz!");


        String ans1 = "a) 16^2";
        String ans2 = "b) 256";
        String ans3 = "c) 2^8";
        List<String> answers1 = new ArrayList<>();
        answers1.add(ans1);
        answers1.add(ans2);
        answers1.add(ans3);

        Question question1 = new Question(1, "Kolko je 4^4 ? (Viacero odpovedi je spravnych)"
                , answers1, "abc");


        String ans1_2 = "a) 60";
        String ans2_2 = "b) 170";
        String ans3_2 = "c) 3";
        List<String> answers2 = new ArrayList<>();
        answers2.add(ans1_2);
        answers2.add(ans2_2);
        answers2.add(ans3_2);


        Question question2 = new Question(2, "Aký je najmensi spolocny nasobok cisel 12 a 15 ? (Jedna odpoved je spravna)"
                , answers2, "a");


        String ans1_3 = "a) ano";
        String ans2_3 = "b) nie";
        List<String> answers3 = new ArrayList<>();
        answers3.add(ans1_3);
        answers3.add(ans2_3);

        Question question3 = new Question(3, "Je cislo 37 prvocislo ? (Jedna odpoved je spravna)"
                , answers3, "a");

        List<Question> questions = new ArrayList<>();
        questions.add(question1);
        questions.add(question2);
        questions.add(question3);

        Quiz mathQuiz = new Quiz(questions);


        boolean repeat = true;

        while(repeat){
            int count = 1;
            int score = 0;
            while (count < 4){
                mathQuiz.getQuestion(count);
                System.out.println("Zadaj odpoved: ");


                String odpoved = scanner.nextLine().trim();

                if(odpoved.equals(questions.get(count-1).getRightAnswers())){
                    score++;
                }


                count++;
                scanner.nextLine();
            }
            System.out.println("Mal si spravne " + score + " z 3 odpovedi" );
            System.out.println("Chces skusit znovu? (ano/nie)");
            String odpoved = scanner.nextLine().trim();
            if (odpoved.equals("nie")){
                repeat = false;
            }
        }






    }
}