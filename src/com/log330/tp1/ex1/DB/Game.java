import java.util.ArrayList;
import java.util.HashMap;


public class Game {
	public static int GAMENOTCREATED = 0;
	public static int PERIOD1 = 1;
	public static int PERIOD2 = 2;
	public static int PERIOD3 = 3;
	public static int GAMEFINISHED = 4;
	private int period = 1;
	private int scoreRED = 0;
	private int scoreBLUE = 0;
	private int winner = -1;
	private ArrayList<Goal> goals = new ArrayList<Goal>();
	
	public Game(){
	}
	
	public int nextPeriod(){
		if (this.period != Game.GAMEFINISHED){
			this.period++;
			if (this.period == Game.GAMEFINISHED){
				if (this.scoreRED > this.scoreBLUE){
					this.winner = DB.TEAMRED;
				}else if (this.scoreRED < this.scoreBLUE){
					this.winner = DB.TEAMBLUE;
				}else{
					this.winner = 0;
				}
			}
		}
		return this.period;
	}
	
	public int getPeriod(){
		return this.period;
	}
	
	public int getWinner(){
		return this.winner;
	}
	
	public void addGoal(Player player, Player assist, int time){
		if (player.getTeam() == DB.TEAMRED){
			this.scoreRED++;
		}else if (player.getTeam() == DB.TEAMBLUE){
			this.scoreBLUE++;
		}
		this.goals.add(new Goal(player, assist, time));
	}
	
	public ArrayList<Goal> getGoals(){
		return this.goals;
	}
	
	public HashMap<String, Integer> getScore(){
		HashMap<String, Integer> ret = new HashMap<String, Integer>();
		ret.put("RED", this.scoreRED);
		ret.put("BLUE", this.scoreBLUE);
		return ret;
	}
	
	public HashMap<Integer, Player> getTop(){
		if (this.period != Game.GAMEFINISHED){
			return null;
		}
		HashMap<Integer, Player> ret = new HashMap<Integer, Player>();
		HashMap<Player, Integer> points = new HashMap<Player, Integer>();
		
		for (Goal x : this.goals){
			if (points.get(x.scorer) != null){
				points.put(x.scorer, points.get(x.scorer)+2);
			}else{
				points.put(x.scorer, 2);
			}
			if (points.get(x.assist) != null){
				points.put(x.assist, points.get(x.assist)+1);
			}else{
				points.put(x.assist, 1);
			}
		}
		
		return ret;
	}
}
