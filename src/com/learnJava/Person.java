package com.learnJava;

import java.util.ArrayList;
import java.util.List;

public class Person implements Saveable {

	private String name;
	private int hitPoints;
	private int strength;
	private String weapon;
	
	// Constructor
	public Person(String name, int hitPoints, int strength) {
		this.name = name;
		this.hitPoints = hitPoints;
		this.strength = strength;
		this.weapon = "Sword";
	}

	// Getters and Setters
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

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	// toString method
	@Override
	public String toString() {
		return "Person [name=" + name +
				", hitPoints=" + hitPoints +
				", strength=" + strength +
				", weapon=" + weapon + "]";
	}

	// Saveable interface Implemented methods
	@Override
	public List<String> write() {
		List<String> values = new ArrayList<String>();
		values.add(0, this.name);
		// "" + this.fieldName => convert fieldName to String
		values.add(1, "" + this.hitPoints);
		values.add(2, "" + this.strength);
		values.add(3, this.weapon);
		
		return values;
	}

	@Override
	public List read(List<String> savedValues) {
		if(savedValues != null && savedValues.size() > 0) {
			this.name = savedValues.get(0);
			// Integer.parseInt(String s) => Parses the string argument as a signed decimal integer.
			this.hitPoints = Integer.parseInt(savedValues.get(1));
			this.strength = Integer.parseInt(savedValues.get(2));
			this.weapon = savedValues.get(3);
		}
		return savedValues;
	}
	
}
