
public class Start {

	public static void main(String[] args) {
		
		DB.getInstance().setPlayer(0, 10, "A A", 1);
		DB.getInstance().setPlayer(1, 20, "B B", 1);
		DB.getInstance().setPlayer(2, 30, "C C", 1);
		DB.getInstance().setPlayer(5, 60, "D D", 2);
		DB.getInstance().setPlayer(6, 70, "E E", 2);
		DB.getInstance().setPlayer(7, 80, "F F", 2);
		System.out.println(DB.getInstance().getAllPlayers().toString());
		
		DB.getInstance().newGame();
		DB.getInstance().addGoal(DB.getInstance().getPlayerByNum(10, 1), null, 5);
		DB.getInstance().addGoal(DB.getInstance().getPlayerByNum(20, 1), null, 15);
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
	}

}