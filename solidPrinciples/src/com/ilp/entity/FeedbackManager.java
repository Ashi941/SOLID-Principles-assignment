
package com.ilp.entity;

import com.ilp.interfaces.FeedbackManagerInterface;

public class FeedbackManager implements FeedbackManagerInterface  {

	private String feedbackMAnagerId;
	private String fb;
    public Feedback feedback;
    
public FeedbackManager(Feedback feedback) {
		this.feedback = feedback;
		System.out.println("Feedback successful\n");
		
	}
	public String getFeedbackMAnagerId() {
		return feedbackMAnagerId;
	}
	
	public void setFeedbackMAnagerId(String feedbackMAnagerId) {
		this.feedbackMAnagerId = feedbackMAnagerId;
	}
	public String getFb() {
		return fb;
	}
	public void setFb(String fb) {
		this.fb = fb;
	}
//
	public void displayfeedback(Feedback feedback) {
		System.out.println("Admin displays the feedback");
		
	}
	public void replytofeedback(Feedback feedback) {
		// TODO Auto-generated method stub
		System.out.println("Admin replies to the feedback");
		
	}
	public void deletefeedback(Feedback feedback) {
		// TODO Auto-generated method stub
		System.out.println("Admin deletes the feedback");
	}
	
	
	
	
	}	
	
	
