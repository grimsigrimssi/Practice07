package com.javaex.ex03;

public class Dog implements Soundable {

	private String sound;
		
	public Dog(String sound) {
		this.sound = sound;
	}

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}
	
	public String sound() {
		return sound;
	}

	
}
