package com.log330.tp1.ex1.DB;

public class Player implements Comparable<Player> {
	public Integer num;
	public String fname;
	public String name;
	public Integer team;
	public Boolean onIce = false;
	
	public Player(Integer num, String fname, String name, Integer team, Boolean onIce){
		this.num = num;
		this.fname = fname;
		this.name = name;
		this.team = team;
		this.onIce = onIce;
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
