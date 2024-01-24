package com.ilp.entity;

import com.ilp.interfaces.FeedbackRemoteDatabase;

public class FeedbackMainDatabase {
	private FeedbackDatabase feedbackdatabase;     

	public FeedbackMainDatabase(FeedbackDatabase feedbackdatabase) {
		this.feedbackdatabase = feedbackdatabase;
	}
	
void saveSettings()
{
	this.feedbackdatabase.store();
}

	
}
