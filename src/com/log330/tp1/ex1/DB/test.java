package com.log330.tp1.ex1.DB;

public class test {

	public static void main(String[] args) {
		
		/*DB.getInstance().setPlayer(10, "A", "A", DB.TEAMRED, true);
		DB.getInstance().setPlayer(20, "B", "B", DB.TEAMRED, true);
		DB.getInstance().setPlayer(30, "C", "C", DB.TEAMRED, true);
		DB.getInstance().setPlayer(60, "D", "D", DB.TEAMBLU, true);
		DB.getInstance().setPlayer(70, "E", "E", DB.TEAMBLU, true);
		DB.getInstance().setPlayer(80, "F", "F", DB.TEAMBLU, true);*/
		System.out.println(DB.getInstance().getAllPlayers().toString());
		
		DB.getInstance().newGame();
		DB.getInstance().addGoal(DB.getInstance().getPlayerByNum(10, DB.TEAMRED), DB.getInstance().getPlayerByNum(20, DB.TEAMRED), null);
		DB.getInstance().addGoal(DB.getInstance().getPlayerByNum(20, DB.TEAMRED), null, null);
		System.out.println(DB.getInstance().getScore().toString());
		
		System.out.println(DB.getInstance().getPeriod());
		DB.getInstance().nextPeriod();
		System.out.println(DB.getInstance().getPeriod());
		
		System.out.println("Goals:"+DB.getInstance().getGoals().toString());
		
		DB.getInstance().nextPeriod();
		DB.getInstance().nextPeriod();
		System.out.println("Winner:"+DB.getInstance().getWinner());
		
		System.out.println("Top:"+DB.getInstance().getTop());
		
		DB.getInstance().newGame();
		System.out.println("Goals:"+DB.getInstance().getGoals().toString());
		
		
	}

}
