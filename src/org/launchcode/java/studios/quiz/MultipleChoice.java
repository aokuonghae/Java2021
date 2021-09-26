package org.launchcode.java.studios.quiz;
import java.util.ArrayList;
import java.util.Scanner;

public class MultipleChoice extends Question {

    private ArrayList<String> choices;
    private int answer;

    public MultipleChoice (int pointValue, String question, ArrayList<String> choices, int answer){
        super (pointValue,question);
        this.choices = choices;
        this.answer = answer;
        setPointValue(1);
    }

    @Override
    public void showAnswers() {
        for (int i=0; i<choices.size() ; i++){
            System.out.println(i+1 + ") " + this.choices.get(i));
        }
    }

   public  boolean checkAnswer (int userAnswer) {
        if (userAnswer == this.answer) {
            return true;
        } else {
            return false;
        }
   }

   public int getUserAnswer() {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter you the number that matches the correct answer: ");
        String response = input.nextLine();
        int result = Integer.parseInt(response);
        if (checkAnswer(result)) {
            return 1;
        } else {
            return 0;
        }
   }
}
