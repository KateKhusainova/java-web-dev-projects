package org.launchcode;

public class Checkbox extends Question {
    public Checkbox(String question, Choice[] choiceArray) {
        super(question, choiceArray);
        setNumberResponses(getNumCorrect());
    }
    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return newLine + "Choose one or more:" + newLine +
                getQuestion() + newLine +
                getFormattedChoices();
    }
    public int getNumCorrect() {
        int numCorrect = 0;
        for (Choice choice : getChoiceMap().values()) {
            if (choice.isCorrect()) {
                numCorrect++;
            }
        }
        return numCorrect;
    }
}
