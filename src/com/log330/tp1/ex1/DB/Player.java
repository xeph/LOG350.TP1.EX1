package com.log330.tp1.ex1.DB;

public class Player implements Comparable<Player> {
	private int num;
	private String name;
	private int team;
	
	public Player(int num, String name, int team){
		this.num = num;
		this.name = name;
		this.team = team;
	}
	
	public int getNum(){
		return this.num;
	}
	public String getName(){
		return this.name;
	}
	
	public int getTeam(){
		return this.team;
	}
	
	public String toString(){
		return "#"+this.num+"_"+this.name;
	}
	
	public int compareTo(Player oPlayer){
		if (oPlayer.num > this.num){
			return -1;
		}else{
			return 1;
		}
	}
}
