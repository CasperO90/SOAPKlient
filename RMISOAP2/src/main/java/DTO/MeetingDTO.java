package DTO;

import java.io.Serializable;
import java.util.Date;

public class MeetingDTO implements Serializable {

    private String name;
    private String topic;
    private String place;
    private int state; // 0 ikke starte, 1 igang, 2 slut.
    private int day;
    private int month;
    private int year;
    private Date realStartTime;
    private Date realendTime;
    private String meetingID;
    private String userMeetingID;
    private Date startTime;
    private Date endTime;
    private String expectedDuration;
    private String CreatedById;
    private String questionsID;

    public MeetingDTO() {
    }

    public MeetingDTO(String name, String topic, String place, int state, int day, int month, int year, Date realStartTime, Date realendTime, String meetingID, String userMeetingID, Date startTime, Date endTime, String expectedDuration, String createdById) {
        this.name = name;
        this.topic = topic;
        this.place = place;
        this.state = state;
        this.day = day;
        this.month = month;
        this.year = year;
        this.realStartTime = realStartTime;
        this.realendTime = realendTime;
        this.meetingID = meetingID;
        this.userMeetingID = userMeetingID;
        this.startTime = startTime;
        this.endTime = endTime;
        this.expectedDuration = expectedDuration;
        CreatedById = createdById;
    }

    public MeetingDTO(String name, String topic, String place, int day, int month, int year, Date startTime, Date endTime, String createdById) {
        this.name = name;
        this.topic = topic;
        this.place = place;
        this.day = day;
        this.month = month;
        this.year = year;
        this.startTime = startTime;
        this.endTime = endTime;
        this.CreatedById = createdById;
    }

    public String getQuestionsID() {
        return questionsID;
    }

    public void setQuestionsID(String questionsID) {
        this.questionsID = questionsID;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getExpectedDuration() {
        return expectedDuration;
    }

    public String getCreatedById() {
        return CreatedById;
    }

    public void setCreatedById(String createdById) {
        CreatedById = createdById;
    }

    public void setExpectedDuration(String expectedDuration) {
        this.expectedDuration = expectedDuration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Date getRealStartTime() {
        return realStartTime;
    }

    public void setRealStartTime(Date realStartTime) {
        this.realStartTime = realStartTime;
    }

    public Date getRealendTime() {
        return realendTime;
    }

    public void setRealendTime(Date realendTime) {
        this.realendTime = realendTime;
    }

    public String getMeetingID() {
        return meetingID;
    }

    public void setMeetingID(String meetingID) {
        this.meetingID = meetingID;
    }

    public String getUserMeetingID() {
        return userMeetingID;
    }

    public void setUserMeetingID(String userMeetingID) {
        this.userMeetingID = userMeetingID;
    }

    @Override
    public String toString() {
        return "MeetingDTO{" +
                "name='" + name + '\'' +
                ", topic='" + topic + '\'' +
                ", place='" + place + '\'' +
                ", state=" + state +
                ", day=" + day +
                ", month=" + month +
                ", year=" + year +
                ", realStartTime=" + realStartTime +
                ", realendTime=" + realendTime +
                ", meetingID='" + meetingID + '\'' +
                ", userMeetingID='" + userMeetingID + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", expectedDuration='" + expectedDuration + '\'' +
                ", CreatedById='" + CreatedById + '\'' +
                ", questionsID='" + questionsID + '\'' +
                '}';
    }
}
