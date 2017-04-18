package de.eva.Aufgabe2;

public abstract class Tier {
	
	private String name;
	
	public Tier(String name) {
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
}
