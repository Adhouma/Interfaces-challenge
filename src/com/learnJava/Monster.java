package com.learnJava;

import java.util.ArrayList;
import java.util.List;

public class Monster implements Saveable {

	private String name;
	private int hitPoints;
	private int strength;
	
	// Constructor
	public Monster(String name, int hitPoints, int strength) {
		this.name = name;
		this.hitPoints = hitPoints;
		this.strength = strength;
	}

	// Getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHitPoints() {
		return hitPoints;
	}

	public void setHitPoints(int hitPoints) {
		this.hitPoints = hitPoints;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}
	
	// toString method
	@Override
	public String toString() {
		return "Monster [name=" + name +
				", hitPoints=" + hitPoints +
				", strength=" + strength + "]";
	}

	// Saveable interface Implemented methods
	@Override
	public List<String> write() {
		List<String> values = new ArrayList<String>();
		values.add(0, this.name);
		// "" + this.fieldName => convert fieldName to String
		values.add(1, "" + this.hitPoints);
		values.add(2, "" + this.strength);
		
		return values;
	}

	@Override
	public List read(List<String> savedValues) {
		if(savedValues != null && savedValues.size() > 0) {
			this.name = savedValues.get(0);
			// Integer.parseInt(String s) => Parses the string argument as a signed decimal integer.
			this.hitPoints = Integer.parseInt(savedValues.get(1));
			this.strength = Integer.parseInt(savedValues.get(2));
		}
		return savedValues;
	}
	
}
