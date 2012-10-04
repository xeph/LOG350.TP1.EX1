package com.log330.tp1.ex1.DB;

public class Goal {
	public Player scorer;
	public Player assist;
	public int time;
	
	public Goal(Player scorer, Player assist, int time){
		this.scorer = scorer;
		this.assist = assist;
		this.time = time;
	}
	
	public String toString(){
		return "SCORER: "+this.scorer.toString()+(this.assist != null ? " ASSIST: "+this.assist.toString() : "")+" @"+this.time+"min";
	}
}
