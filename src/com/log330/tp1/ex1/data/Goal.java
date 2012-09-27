package com.log330.tp1.ex1.data;

import java.util.ArrayList;

public class Goal {

	private Team team;
	private ArrayList<Player> players = new ArrayList<Player>();
	
	// --------------------------------------------------
	// Constructor(s)
	
	public Goal(Team team, ArrayList<Player> players) {
		this.team = team;
		this.players = players;
	}

	// --------------------------------------------------
	// Accessor(s)

	public Team getTeam() {
		return team;
	}

	public ArrayList<Player> getPlayers() {
		return players;
	}
	
	// --------------------------------------------------
	// Mutators(s)

	// --------------------------------------------------
	// Method(s)

	// --------------------------------------------------
	// Attribute(s)
}
