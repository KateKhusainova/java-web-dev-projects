package org.launchcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public abstract class Question {
    private final String question;
    private final HashMap<Integer, Choice> choiceMap = new HashMap();
    private int numberResponses = 1;

    public Question(String question, Choice[] choiceArray) {
        this.question = question;
    }

    public String getQuestion() {
        return question;
    }

    public HashMap<Integer, Choice> getChoiceMap() {
        return choiceMap;
    }

    public int getNumberResponses() {
        return numberResponses;
    }

    public void setNumberResponses(int numberResponses) {
        this.numberResponses = numberResponses;
    }

    @Override
    public abstract String toString();

    void createRandomChoiceMap(Choice[] choiceArray) {
        ArrayList<Choice> choiceList = new ArrayList<>();
        Collections.addAll(choiceList, choiceArray);
        Collections.shuffle(choiceList);
        for (int i = 0; i < choiceList.size(); i++) {
            choiceMap.put(i + 1, choiceList.get(i));
        }
    }

    String getFormattedChoices() {

        StringBuilder formattedChoices = new StringBuilder();
        String newLine = System.lineSeparator();
        for(int choiceNum: choiceMap.keySet()) {
            String choice = "\t" + choiceNum + " - " + choiceMap.get(choiceNum).getContent() + newLine;
            formattedChoices.append(choice);
        }
        return formattedChoices.toString();
    }

}

