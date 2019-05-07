package DTO;

import java.io.Serializable;
import java.util.ArrayList;

public class CommentDTO implements Serializable {

    private String question;
    private ArrayList<String> comments;

    public CommentDTO() {
        comments = new ArrayList<String>();
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public ArrayList<String> getComments() {
        return comments;
    }

    public void setComments(ArrayList<String> comments) {
        this.comments = comments;
    }
}
