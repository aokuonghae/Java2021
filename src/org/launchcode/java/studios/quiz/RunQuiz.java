package org.launchcode.java.studios.quiz;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class RunQuiz {
    public static void main(String[] args){
        Quiz aQuiz = new Quiz(new ArrayList<Question>());
        ArrayList<String> q1 = new ArrayList<>(Arrays.asList("Hello" , "Bye", "Au revoir", "Why"));
        ArrayList<Integer> correct1 = new ArrayList<>(Arrays.asList(3,4));
        CheckBox cq1 = new CheckBox(2, "What are the odd ones out", q1, correct1);
        aQuiz.addQuestion(cq1);
        ArrayList<String> q2 = new ArrayList<>(Arrays.asList("Hellor" , "Byez", "Au revoirz", "Whyyy"));
        MultipleChoice mq1= new MultipleChoice(1,"Which is french?", q2, 3);
        aQuiz.addQuestion(mq1);
        TrueFalse newQuestion3 = new TrueFalse(1, "Are all dogs the best?", true);
        aQuiz.addQuestion(newQuestion3);


        aQuiz.runQuiz();

        aQuiz.gradeQuiz();
    }
}
