package task2;

import java.util.List;
import java.util.ArrayList;

public class CompositeTeams implements OlympicsTeams {
	
	private List<OlympicsTeams> teamList = new ArrayList<OlympicsTeams>();
	
	public void addTeam(OlympicsTeams team) {
		teamList.add(team);
	}
	
	public void NumberOfAthletes() {
		for(OlympicsTeams team: teamList) {
			team.NumberOfAthletes();
		}
	}
	
	public void NumberOfGoldMedals() {
		for(OlympicsTeams team: teamList) {
			team.NumberOfGoldMedals();
		}
	}
}
