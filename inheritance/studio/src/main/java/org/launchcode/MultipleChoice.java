package org.launchcode;

public class MultipleChoice extends Question {
    public MultipleChoice(String question, Choice[] choiceArray) {
        super(question, choiceArray);
    }
    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return newLine + "Choose one:" + newLine +
                getQuestion() + newLine +
                getFormattedChoices();
    }
}
