package org.launchcode.java.studios.quiz;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class CheckBox extends Question{

    private ArrayList<String> questions;
    private ArrayList<Integer> correctAnswers;

    public CheckBox(int pointValue, String question, ArrayList<String>questions, ArrayList<Integer> correctAnswers) {
        super(pointValue, question);
        this.questions = questions;
        this.correctAnswers=correctAnswers;
    }

    @Override
    public void showAnswers() {
        for (int i=0; i<questions.size(); i++) {
            System.out.println(i+1 + " ): " + questions.get(i));
        }
    }

    public int checkAnswers (ArrayList<Integer> userAnswers){
        int answersRight = 0;
        for (int userAnswer : userAnswers) {
            if (correctAnswers.contains(userAnswer)){
                answersRight++;
            }
        }
        return answersRight;
    }

    @Override
    public int getUserAnswer() {
        ArrayList<Integer> userResponse = new ArrayList<Integer>();
        System.out.println("There are multiple answers. To begin, enter y");
        Scanner input = new Scanner(System.in);
        String userBegin = input.nextLine();
        int counter =0;
        while (userBegin.indexOf('y') < 0 ){
            System.out.println("To progress, enter y");
            userBegin = input.nextLine().toLowerCase();
        }
        while (counter < this.getPointValue()){
            System.out.println("Enter the number of the answer you think is correct.");
            Scanner userChoice =  new Scanner(System.in);
            Integer ans = userChoice.nextInt();
            userResponse.add(ans);
            counter++;
        }
        return checkAnswers(userResponse);
    }
}
