package DTO;

import java.io.Serializable;
import java.util.ArrayList;

public class QuestionsDTO implements Serializable {

    private ArrayList<String> questions;

    public QuestionsDTO() {
    }

    public ArrayList<String> getQuestions() {
        return questions;
    }

    public void setQuestions(ArrayList<String> questions) {
        this.questions = questions;
    }
}
