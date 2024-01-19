package com.ilp.entity;

import com.ilp.interfaces.FeedbackRemoteDatabase;

public class FeedbackMainDatabase {
	private FeedbackRemoteDatabase feedbackremotedatabase;     //Dependency Inversion Principle

	public FeedbackMainDatabase(FeedbackRemoteDatabase feedbackremotedatabase) {
		this.feedbackremotedatabase = feedbackremotedatabase;
	}
	
void promoteFeedback()
{
	System.out.println("The feedback has been promoted");
}
	
	
}
