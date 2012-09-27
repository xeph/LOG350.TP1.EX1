package com.log330.tp1.ex1.data;

import java.util.ArrayList;

public class Team {
	
	private String name;
	private ArrayList<Player> players = new ArrayList<Player>();

	// --------------------------------------------------
	// Constructor(s)
	
	public Team(String name) {
		this.name = name;
	}

	// --------------------------------------------------
	// Accessor(s)

	public void addPlayer(Player player) {
		players.add(player);
	}

	public String getName() {
		return name;
	}
	
	// --------------------------------------------------
	// Mutators(s)

	// --------------------------------------------------
	// Method(s)

	public ArrayList<Player> getPlayers() {
		return players;
	}

	// --------------------------------------------------
	// Attribute(s)
}
