package com.gym.oracleGym.service;

import java.util.ArrayList;
import java.util.HashMap;

import com.gym.oracleGym.model.TestModel;

public interface TestService {
	
	public void resetTest();
	
	public ArrayList<String> getValidAnswers(String questionNumber);
	
	public ArrayList<String> getQuestion(String questionNumber);
	
	public void setFails(int questionNumber);
	
	public void setSuccess(int questionNumber);
	
	public void setQuestionNow(int questionNumber);
	
    public int getFails();
	
	public int getSuccess();
	
	public int getQuestionNow();
	
	public int calculateScore();
	
	public boolean getImage(String imagenNumber);
	
	public ArrayList<Integer> failQuestionList();
	
	public ArrayList<Integer> successQuestionList();
	
	public boolean verifyAnswer(int numQue, ArrayList<String> answersUser);
	
	public void setImage(String imgNumber);
	
	public int getTier();
	
	public void setTier(int tier);
	
	public boolean getType();

	public void setType(boolean typeTest);
	
	

}
