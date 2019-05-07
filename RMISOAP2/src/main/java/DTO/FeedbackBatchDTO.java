package DTO;

import java.io.Serializable;
import java.util.ArrayList;

/*
var meetingID: String?
var feedback : [FeedbackDTO]?
 */

public class FeedbackBatchDTO implements Serializable {

      private ArrayList<FeedbackDTO> feedback;
      private String meetingID;

    public FeedbackBatchDTO() {
    }

    public ArrayList<FeedbackDTO> getFeedback() {
        return feedback;
    }

    public void setFeedback(ArrayList<FeedbackDTO> feedback) {
        this.feedback = feedback;
    }

    public String getMeetingID() {
        return meetingID;
    }

    public void setMeetingID(String meetingID) {
        this.meetingID = meetingID;
    }
}
