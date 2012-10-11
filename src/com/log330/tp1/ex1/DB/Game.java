package com.log330.tp1.ex1.DB;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class Game {
	public static Integer GAMENOTCREATED = 0;
	public static Integer PERIOD1 = 1;
	public static Integer PERIOD2 = 2;
	public static Integer PERIOD3 = 3;
	public static Integer GAMEFINISHED = 4;
	private Integer period = 1;
	private Integer scoreRED = 0;
	private Integer scoreBLU = 0;
	private Integer winner = -1;
	private ArrayList<Goal> goals = new ArrayList<Goal>();
	
	public Game(){
	}
	
	public Integer nextPeriod(){
		if (this.period != Game.GAMEFINISHED){
			this.period++;
			if (this.period == Game.GAMEFINISHED){
				if (this.scoreRED > this.scoreBLU){
					this.winner = DB.TEAMRED;
				}else if (this.scoreRED < this.scoreBLU){
					this.winner = DB.TEAMBLU;
				}else{
					this.winner = 0;
				}
			}
		}
		return this.period;
	}
	
	public Integer getPeriod(){
		return this.period;
	}
	
	public Integer getWinner(){
		return this.winner;
	}
	
	public void addGoal(Player player, Player assist, Player assist2, Integer period){
		if (player.team == DB.TEAMRED){
			this.scoreRED++;
		}else if (player.team == DB.TEAMBLU){
			this.scoreBLU++;
		}
		this.goals.add(new Goal(player, assist, assist2, period));
		
	}
	
	public ArrayList<String> getGoals(){
		ArrayList<String> ret = new ArrayList<String>();
		for (Goal x : this.goals){
			ret.add(x.toString());
		}
		return ret;
	}
	
	public HashMap<String, Integer> getScore(){
		HashMap<String, Integer> ret = new HashMap<String, Integer>();
		ret.put("RED", this.scoreRED);
		ret.put("BLU", this.scoreBLU);
		return ret;
	}
	
	public ArrayList<Player> getTop(){
		if (this.period != Game.GAMEFINISHED){
			return null;
		}
		ArrayList<Player> ret = new ArrayList<Player>();
		HashMap<Player, Integer> points = new HashMap<Player, Integer>();
		HashMap<Player, Integer> goals = new HashMap<Player, Integer>();
		
		for (Goal x : this.goals){
			if (points.get(x.scorer) != null){
				points.put(x.scorer, points.get(x.scorer)+1);
			}else{
				points.put(x.scorer, 2);
			}
			if (goals.get(x.scorer) != null){
				goals.put(x.scorer, goals.get(x.scorer)+2);
			}else{
				goals.put(x.scorer, 1);
			}
			if (x.assist != null){
				if (points.get(x.assist) != null){
					points.put(x.assist, points.get(x.assist)+1);
				}else{
					points.put(x.assist, 1);
				}
			}
			if (x.assist2 != null){
				if (points.get(x.assist2) != null){
					points.put(x.assist2, points.get(x.assist2)+1);
				}else{
					points.put(x.assist2, 1);
				}
			}
		}
		System.out.println("Points:"+points);
		
		Entry<Player, Integer> one = new AbstractMap.SimpleEntry<Player, Integer>(null, 0);
		Entry<Player, Integer> two = new AbstractMap.SimpleEntry<Player, Integer>(null, 0);
		Entry<Player, Integer> three = new AbstractMap.SimpleEntry<Player, Integer>(null, 0);
		for (Entry<Player, Integer> x : points.entrySet()){
			if (
					(x.getValue() > one.getValue()) ||
					(x.getValue() == one.getValue() && x.getKey().team == DB.getInstance().getWinner()) ||
					(x.getValue() == x.getValue() && x.getKey().team != DB.getInstance().getWinner() && 
						(goals.get(x.getKey()) != null ? goals.get(x.getKey()) : 0) > (goals.get(one) != null ? goals.get(one) : 0))
				){
				three = two;
				two = one;
				one = x;
			}else if (
					(x.getValue() > two.getValue()) ||
					(x.getValue() == two.getValue() && x.getKey().team == DB.getInstance().getWinner()) ||
					(x.getValue() == x.getValue() && x.getKey().team != DB.getInstance().getWinner() && 
						(goals.get(x.getKey()) != null ? goals.get(x.getKey()) : 0) > (goals.get(two) != null ? goals.get(two) : 0))
				){
				three = two;
				two = x;
			}else if (
					(x.getValue() > three.getValue()) ||
					(x.getValue() == three.getValue() && x.getKey().team == DB.getInstance().getWinner()) ||
					(x.getValue() == x.getValue() && x.getKey().team != DB.getInstance().getWinner() && 
						(goals.get(x.getKey()) != null ? goals.get(x.getKey()) : 0) > (goals.get(three) != null ? goals.get(three) : 0))
				){
				three = x;
			}
		}
		ret.add(one.getKey());
		ret.add(two.getKey());
		ret.add(three.getKey());
		
		return ret;
	}
}
