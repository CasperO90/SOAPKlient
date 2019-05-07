package DTO;

import java.io.Serializable;

public class FeedbackDTO implements Serializable {

    private int vote;
    private String comment;

    public FeedbackDTO() {
    }

    public int getVote() {
        return vote;
    }

    public void setVote(int vote) {
        this.vote = vote;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
