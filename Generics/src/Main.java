
public class Main {

	public static void main(String[] args) {
	    FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        adelaideCrows.addPlayer(joe);
        
        System.out.println(adelaideCrows.numPlayers());
        
        Team<BaseballPlayer> baseballPlayer = new Team<>("jatrabari");
        baseballPlayer.addPlayer(pat);
	}

}
