package org.launchcode.java.studios.quiz;

public abstract class Question {

    private int pointValue;
    private String question;

    public Question (int pointValue, String question){
        this.pointValue=pointValue;
        this.question=question;
    }

    public void printQuestion () {
        System.out.println(question);
    }

    public void setPointValue(int points) {
        this.pointValue = points;
    }

    public int getPointValue() {
        return this.pointValue;
    }

    public abstract void showAnswers();

//    public abstract boolean checkAnswer (int userAnswer);

    public abstract int getUserAnswer();

}
