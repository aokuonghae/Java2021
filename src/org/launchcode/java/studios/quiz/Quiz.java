package org.launchcode.java.studios.quiz;

import javax.lang.model.type.ArrayType;
import java.util.ArrayList;

public class Quiz {

    private ArrayList<Question> questions;
    private int score;
    private int total;

    public Quiz(ArrayList<Question> questions) {
        this.questions = questions;
        this.score = score;
        this.total = total;
        for (Question question : questions ){
            this.total = this.total + question.getPointValue();
        }
    }

    public void addQuestion (Question newQuestion){
        this.questions.add(newQuestion);
        this.total= this.total+ newQuestion.getPointValue();
    }

    public void runQuiz () {
        for (Question question : questions){
            question.printQuestion();
            question.showAnswers();
            int points = question.getUserAnswer();
            updateScore(points);
        }
    }

    public void updateScore (int x){
        this.score = this.score + x;
    }

    public void gradeQuiz () {
        System.out.println("Your score is "+ this.score + " out of " + total);
    }
}
