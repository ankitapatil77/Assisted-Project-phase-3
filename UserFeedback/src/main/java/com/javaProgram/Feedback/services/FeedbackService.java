package com.javaProgram.Feedback.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaProgram.Feedback.entities.Feedback;
import com.javaProgram.Feedback.repositories.FeedbackRepository;

@Service
public class FeedbackService {

	@Autowired
	FeedbackRepository feedbackRepo;
	
	public Iterable<Feedback> GetAllFeedback() {
		return feedbackRepo.findAll();
	}
	
	public Feedback addNewFeedback(Feedback fb) {
		return feedbackRepo.save(fb);
	}
}
