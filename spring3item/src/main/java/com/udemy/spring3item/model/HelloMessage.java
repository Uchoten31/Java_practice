package com.udemy.spring3item.model;

public class HelloMessage {
	
	public HelloMessage(String inMsg) {
		this.strMessage = inMsg;
	}
	
	private String strMessage;

	public String getStringMessage() {
		return strMessage;
	}

	public void setStringMessage(String strMessage) {
		this.strMessage = strMessage;
	}
	
	

}
