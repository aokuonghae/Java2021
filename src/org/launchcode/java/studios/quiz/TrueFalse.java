package org.launchcode.java.studios.quiz;

import java.util.Scanner;

public class TrueFalse extends Question{

    private boolean correctAnswer;

    public TrueFalse(int pointValue, String text, boolean correctAnswer) {
        super(pointValue, text);
        setPointValue(1);
        this.correctAnswer = correctAnswer;
    }

    public boolean isCorrectAnswer (boolean userAnswer) {
        if (userAnswer == correctAnswer) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public void showAnswers() {
        System.out.println("True or False");
    }

    @Override
    public int getUserAnswer() {
        Scanner answer = new Scanner(System.in);
        System.out.println("Enter your answer. Type 'true' for True and 'false' for False");
        String userAnswer = answer.nextLine().toLowerCase();
        Boolean userBoolean = Boolean.parseBoolean(userAnswer);
        //convert the user's answer to true
        if (isCorrectAnswer(userBoolean)) {
            return 1;
        }
        else {
            return 0;
        }
    }
}

