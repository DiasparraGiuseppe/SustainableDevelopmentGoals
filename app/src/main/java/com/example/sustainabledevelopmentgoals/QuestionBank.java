package com.example.sustainabledevelopmentgoals;

import java.util.ArrayList;
import java.util.List;

public class QuestionBank {
    public static List<QuestionsList> questionsLists(){

        final List<QuestionsList> questionsLists= new ArrayList<>();
        final QuestionsList question1= new QuestionsList("Quante persone vivono in condizioni di estrema povertà a livello mondiale?","Circa 800 persone", "Circa 8.000 persone", "Più di 800 milioni di persone", "Più di 800 milioni di persone", "");
        final QuestionsList question2= new QuestionsList("In quale continente vive la maggior parte dei bambini che non frequentano la scuola?","Europa", "Asia", "Africa", "Africa", "");
        final QuestionsList question3= new QuestionsList("Quale delle seguenti è una democrazia?","Un Paese governato da un dittatore", "Un Paese governato dal popolo", "Un Paese governato solo da uomini", "Un Paese governato dal popolo", "");
        final QuestionsList question4= new QuestionsList("Chi è un bambino rifugiato?","Un bambino che va in vacanza", "Un bambino che è costretto a lasciare la propria casa a causa di un conflitto armato", "Un bambino che trascorre la notte a casa di un amico", "Un bambino che è costretto a lasciare la propria casa a causa di un conflitto armato", "");
        final QuestionsList question5= new QuestionsList("I sacchetti di plastica sono pericolosi per le tartarughe perché a volte li scambiano per...","Cibo", "Un giocattolo", "Un guscio", "Cibo", "");
        final QuestionsList question6= new QuestionsList("In che modo le api aiutano l'ambiente?","Aiutano le piante a crescere e producono cibo", "Non aiutano, producono solamente il miele", "Mangiano altri insetti", "Aiutano le piante a crescere e producono cibo", "");
        final QuestionsList question7= new QuestionsList("Chi deve prendersi cura del pianeta?","Gli scienziati", "Tutti", "I governi", "Tutti", "");
        final QuestionsList question8= new QuestionsList("Chi dovrebbe cucinare e fare le pulizie in casa?","Gli uomini di casa", "Le donne di casa", "Tutti dovrebbero dare una mano!", "Tutti dovrebbero dare una mano!", "");
        final QuestionsList question9= new QuestionsList("Quanto cibo viene sprecato ogni giorno nel mondo?","Nessuno, tutto il cibo viene mangiato", "Un terzo di tutto il cibo prodotto", "Molto poco", "Un terzo di tutto il cibo prodotto", "");
        final QuestionsList question10= new QuestionsList("Qual è l'aspettativa media di vita nel mondo?","50 anni", "60 anni", "70 anni", "70 anni", "");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);


        return questionsLists;
    }

}
