package com.example.sustainabledevelopmentgoals;

import java.util.ArrayList;
import java.util.List;

public class QuestionBank {
    public static List<QuestionsList> questionsLists(){

        final List<QuestionsList> questionsLists= new ArrayList<>();
        final QuestionsList question1= new QuestionsList("domanda","opzione1", "opzione2", "opzione3", "opzione4", "opzione1", " ");
        final QuestionsList question2= new QuestionsList("domanda","opzione1", "opzione2", "opzione3", "opzione4", "opzione1", " ");
        final QuestionsList question3= new QuestionsList("domanda","opzione1", "opzione2", "opzione3", "opzione4", "opzione1", " ");
        final QuestionsList question4= new QuestionsList("domanda","opzione1", "opzione2", "opzione3", "opzione4", "opzione1", " ");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);

        return questionsLists;
    }

}
