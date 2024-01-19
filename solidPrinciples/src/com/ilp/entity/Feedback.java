package com.ilp.entity;

import com.ilp.interfaces.FeedbackInterface;

public class Feedback implements FeedbackInterface {
private String feedbackId;
private String feedback;
private int rating;

public String getFeedbackId() {
	return feedbackId;
}
public void setFeedbackId(String feedbackId) {
	this.feedbackId = feedbackId;
}
public String getFeedback() {
	return feedback;
}
public void setFeedback(String feedback) {
	this.feedback = feedback;
}


public int getRating() {
	return rating;
}
public void setRating(int rating) {
	this.rating = rating;
}
@Override
public void addfeedback(Feedback feedback) {
	System.out.println("Feedback is added");
	
}
@Override
public void submitfeedback(Feedback feedback) {
	// TODO Auto-generated method stub
	System.out.println("Feedback is subitted");

}
}
