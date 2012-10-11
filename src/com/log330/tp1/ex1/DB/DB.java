package com.log330.tp1.ex1.DB;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;


public class DB {
	public static Integer TEAMRED = 1;
	public static Integer TEAMBLU = 2;
	private static Integer seq = 0;
	private HashMap<Integer, Player> players = new HashMap<Integer, Player>();
	private HashMap<Integer, Player> playersRED = new HashMap<Integer, Player>();
	private HashMap<Integer, Player> playersBLU = new HashMap<Integer, Player>();
	private ArrayList<Game> oldGames = new ArrayList<Game>();
	private Game game = new Game();
	private static DB instance = new DB();
	
	private DB(){
		this.setPlayer(10, "AAA", "111", DB.TEAMRED, true);
		this.setPlayer(20, "BBB", "222", DB.TEAMRED, true);
		this.setPlayer(30, "CCC", "333", DB.TEAMRED, true);
		this.setPlayer(40, "DDD", "444", DB.TEAMBLU, true);
		this.setPlayer(50, "EEE", "555", DB.TEAMBLU, true);
		this.setPlayer(60, "FFF", "666", DB.TEAMBLU, true);
	}
	
	public static DB getInstance(){
		return DB.instance;
	}
	
	public void setPlayer(Integer num, String fname, String name, Integer team, Boolean onIce){
		Player sPlayer = this.getPlayerByNum(num, team);
		if (sPlayer != null){
			if (fname != null) sPlayer.fname = fname;
			if (name != null) sPlayer.name = name;
			if (onIce != null) sPlayer.onIce = onIce;
		}else{
			Player oPlayer = new Player(num, fname, name, team, onIce);
			this.players.put(seq++, oPlayer);
			if (team == DB.TEAMRED){
				this.playersRED.put(num, oPlayer);
			}else if (team == DB.TEAMBLU){
				this.playersBLU.put(num, oPlayer);
			}
		}
	}
	
	public Player getPlayerByNum(Integer num, Integer team){
		if (team == DB.TEAMRED){
			return this.playersRED.get(num);
		}else if(team == DB.TEAMBLU){
			return this.playersBLU.get(num);
		}else{
			for (Player x : this.players.values()){
				if (x.num == num){
					return x;
				}
			}
			return null;
		}
	}
	
	public Player getPlayerByName(String name){
		for (Player x : this.players.values()){
			if (x.name.equals(name)){
				return x;
			}
		}
		return null;
	}
	
	public ArrayList<Player> playersOnIce(Integer team){
		ArrayList<Player> ret = new ArrayList<Player>();
		if (team == DB.TEAMRED){
			for (Player x : this.playersRED.values()){
				if (x.onIce){
					ret.add(x);
				}
			}
		}else if (team == DB.TEAMBLU){
			for (Player x : this.playersBLU.values()){
				if (x.onIce){
					ret.add(x);
				}
			}
		}
		return ret;
	}
	
	public HashMap<Integer, ArrayList<Player>> getAllPlayers(){
		HashMap<Integer, ArrayList<Player>> ret = new HashMap<Integer, ArrayList<Player>>();
		
		ArrayList<Player> RED = new ArrayList<Player>(this.playersRED.values());
		Collections.sort(RED);
		ret.put(DB.TEAMRED, RED);
		ArrayList<Player> BLU = new ArrayList<Player>(this.playersBLU.values());
		Collections.sort(BLU);
		ret.put(DB.TEAMBLU, BLU);
		return ret;
	}
	
	public Game newGame(){
		Game oGame = new Game();
			this.oldGames.add(this.game);
		this.game = oGame;
		return oGame;
	}
	
	public Integer getPeriod(){
		return this.game.getPeriod();
	}
	
	public Integer nextPeriod(){
		if (this.game == null){
			return Game.GAMENOTCREATED;
		}
		return this.game.nextPeriod();
	}
	
	public Boolean isGameFinished(){
		return (this.game.getPeriod() == Game.GAMEFINISHED);
	}
	
	public Integer getWinner(){
		return this.game.getWinner();
	}
	
	public void addGoal(Player player, Player assist, Player assist2){
		this.game.addGoal(player, assist, assist2, this.game.getPeriod());
	}
	
	public ArrayList<String> getGoals(){
		return this.game.getGoals();
	}
	
	public HashMap<String, Integer> getScore(){
		return this.game.getScore();
	}
	
	public ArrayList<Player> getTop(){
		return this.game.getTop();
	}
	
	
}
