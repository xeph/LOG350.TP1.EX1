package com.log330.tp1.ex1.data;

import java.util.ArrayList;

public class Period {
	
	private ArrayList<Goal> goals = new ArrayList<Goal>();

	// --------------------------------------------------
	// Constructor(s)
	
	public Period() {
		
	}

	// --------------------------------------------------
	// Accessor(s)

	public ArrayList<Goal> getGoals() {
		return goals;
	}
	
	// --------------------------------------------------
	// Mutators(s)

	// --------------------------------------------------
	// Method(s)
	
	public void addGoal(Goal goal) {
		goals.add(goal);
	}

	// --------------------------------------------------
	// Attribute(s)
}
