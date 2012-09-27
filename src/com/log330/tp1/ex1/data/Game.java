package com.log330.tp1.ex1.data;

import java.util.ArrayList;

public class Game {
	
	private ArrayList<Period> periods = new ArrayList<Period>();

	// --------------------------------------------------
	// Constructor(s)

	public Game() {
		
	}
	
	// --------------------------------------------------
	// Accessor(s)

	public ArrayList<Period> getPeriods() {
		return periods;
	}
	
	// --------------------------------------------------
	// Mutators(s)

	// --------------------------------------------------
	// Method(s)

	public void addPeriod(Period period) {
		periods.add(period);
	}
	
	// --------------------------------------------------
	// Attribute(s)
}
