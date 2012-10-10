package com.log330.tp1.ex1.DB;

public class Goal {
	public Player scorer;
	public Player assist;
	public Player assist2;
	public Integer period;
	
	public Goal(Player scorer, Player assist, Player assist2, Integer period){
		this.scorer = scorer;
		this.assist = assist;
		this.assist2 = assist2;
		this.period = period;
	}
	
	public String toString(){
		return "SCORER: "+this.scorer.toString()+(this.assist != null ? " ASSIST: "+this.assist.toString() : "")+
				(this.assist2 != null ? " ASSIST: "+this.assist2.toString() : "")+(this.period != null ? " PERIOD:"+this.period+"min" : "");
	}
}
