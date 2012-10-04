import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;


public class DB {
	private static DB instance = new DB();
	public static int TEAMRED = 1;
	public static int TEAMBLUE = 2;
	private HashMap<Integer, Player> players = new HashMap<Integer, Player>();
	private HashMap<Integer, Player> playersRED = new HashMap<Integer, Player>();
	private HashMap<Integer, Player> playersBLUE = new HashMap<Integer, Player>();
	private ArrayList<Game> oldGames = new ArrayList<Game>();
	private Game game = null;
	
	private DB(){
	}
	
	public static DB getInstance(){
		return DB.instance;
	}
	
	public void removePlayer(int index){
		Player oPlayer = this.players.get(index);
		if (oPlayer != null){
			if (oPlayer.getTeam() == DB.TEAMRED){
				this.playersRED.remove(oPlayer.getNum());
			}else if (oPlayer.getTeam() == DB.TEAMBLUE){
				this.playersBLUE.remove(oPlayer.getNum());
			}
			this.players.remove(index);
		}
	}
	
	public void setPlayer(int index, int num, String name, int team){
		Player oPlayer = new Player(num, name, team);
		this.players.put(index, oPlayer);
		if (team == DB.TEAMRED){
			this.playersRED.put(num, oPlayer);
		}else if (team == DB.TEAMBLUE){
			this.playersBLUE.put(num, oPlayer);
		}
	}
	
	public Player getPlayerByIndex(int index){
		return this.players.get(index);
	}
	
	public Player getPlayerByNum(int num, int team){
		if (team == DB.TEAMRED){
			return this.playersRED.get(num);
		}else if(team == DB.TEAMBLUE){
			return this.playersBLUE.get(num);
		}else{
			for (Player x : this.players.values()){
				if (x.getNum() == num){
					return x;
				}
			}
			return null;
		}
	}
	
	public Player getPlayerByName(String name){
		for (Player x : this.players.values()){
			if (x.getName().equals(name)){
				return x;
			}
		}
		return null;
	}
	
	public HashMap<Integer, ArrayList<Player>> getAllPlayers(){
		HashMap<Integer, ArrayList<Player>> ret = new HashMap<Integer, ArrayList<Player>>();
		
		ArrayList<Player> RED = new ArrayList<Player>(this.playersRED.values());
		Collections.sort(RED);
		ret.put(DB.TEAMRED, RED);
		ArrayList<Player> BLUE = new ArrayList<Player>(this.playersBLUE.values());
		Collections.sort(BLUE);
		ret.put(DB.TEAMBLUE, BLUE);
		return ret;
	}
	
	public Game newGame(){
		Game oGame = new Game();
		if (this.game != null){
			this.oldGames.add(this.game);
		}
		this.game = oGame;
		return oGame;
	}
	
	public int getPeriod(){
		return this.game.getPeriod();
	}
	
	public int nextPeriod(){
		if (this.game == null){
			return Game.GAMENOTCREATED;
		}
		return this.game.nextPeriod();
	}
	
	public int getWinner(){
		return this.game.getWinner();
	}
	
	public void addGoal(Player player, Player assist, int time){
		this.game.addGoal(player, assist, time);
	}
	
	public ArrayList<Goal> getGoals(){
		return this.game.getGoals();
	}
	
	public HashMap<String, Integer> getScore(){
		return this.game.getScore();
	}
	
	public HashMap<Integer, Player> getTop(){
		return this.game.getTop();
	}
	
	
}
