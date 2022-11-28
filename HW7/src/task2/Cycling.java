package task2;

public class Cycling extends WomenTeam {
	
	private String name;
	private int number_of_athletes;
	private int number_of_gold_medals;
	
	public Cycling(String name,int athletes, int medals) {
		this.name = name;
		this.number_of_athletes = athletes;
		this.number_of_gold_medals = medals;
	}
	
	@Override
	public void NumberOfAthletes() {
		System.out.println("Team: " + this.name +", Number of athletes: " + this.number_of_athletes);
	}

	@Override
	public void NumberOfGoldMedals() {
		System.out.println("Team: " + this.name +", Number of gold medals: " + this.number_of_gold_medals);
	}
}
