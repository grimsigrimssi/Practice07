package com.javaex.ex03;

public class Cat implements Soundable {

	private String sound;
	
	public Cat(String sound) {
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
