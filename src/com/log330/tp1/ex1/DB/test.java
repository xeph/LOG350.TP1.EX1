package com.log330.tp1.ex1.DB;

public class test {

	public static void main(String[] args) {
		
		DB.getInstance().setPlayer(0, 10, "A A", DB.TEAMRED);
		DB.getInstance().setPlayer(1, 20, "B B", DB.TEAMRED);
		DB.getInstance().setPlayer(2, 30, "C C", DB.TEAMRED);
		DB.getInstance().setPlayer(5, 60, "D D", DB.TEAMBLUE);
		DB.getInstance().setPlayer(6, 70, "E E", DB.TEAMBLUE);
		DB.getInstance().setPlayer(7, 80, "F F", DB.TEAMBLUE);
		System.out.println(DB.getInstance().getAllPlayers().toString());
		
		DB.getInstance().newGame();
		DB.getInstance().addGoal(DB.getInstance().getPlayerByNum(10, DB.TEAMRED), null, 5);
		DB.getInstance().addGoal(DB.getInstance().getPlayerByNum(20, DB.TEAMRED), null, 15);
		System.out.println(DB.getInstance().getScore().toString());
		
		System.out.println(DB.getInstance().getPeriod());
		DB.getInstance().nextPeriod();
		System.out.println(DB.getInstance().getPeriod());
		
		System.out.println(DB.getInstance().getGoals().toString());
		
		DB.getInstance().nextPeriod();
		DB.getInstance().nextPeriod();
		System.out.println(DB.getInstance().getWinner());
		
		DB.getInstance().newGame();
		System.out.println(DB.getInstance().getGoals().toString());
		
		System.out.println(DB.getInstance().getTop());
	}

}
