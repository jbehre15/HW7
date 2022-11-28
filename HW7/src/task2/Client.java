package task2;

public class Client {
	
	public static void main (String[] args) {
		
		Teakwondo teakwondo = new Teakwondo("Women's Teakwondo",5,2);
		Waterpolo waterpolo = new Waterpolo("Women's Waterpolo",6,1);
		ArtisticGymnastics artisticGymnastics = new ArtisticGymnastics("Women's Artistic Gymnastics",3,0);
		Shooting shooting = new Shooting("Men's Shooting",7, 3);
		CompositeTeams chinaWomenTeam = new CompositeTeams();
		CompositeTeams chinaMenTeam = new CompositeTeams();
		chinaWomenTeam.addTeam(teakwondo);
		chinaWomenTeam.addTeam(waterpolo);
		chinaWomenTeam.addTeam(artisticGymnastics);
		chinaMenTeam.addTeam(shooting);
		
		CompositeTeams chinaTeam = new CompositeTeams();
		chinaTeam.addTeam(chinaWomenTeam);
		chinaTeam.addTeam(chinaMenTeam);
		
		CompositeTeams asiaTeam = new CompositeTeams();
		asiaTeam.addTeam(chinaTeam);
		
		Cycling cycling = new Cycling ("Women's Cycling",10,3);
		Tennis tennis = new Tennis ("Women's Tennis",2,1);
		TableTennis tableTennis = new TableTennis ("Men's Table Tennis",4,0);
		Football gerFootball = new Football ("Men's Football GER",21,0);
		CompositeTeams gerWomenTeam = new CompositeTeams();
		CompositeTeams gerMenTeam = new CompositeTeams();
		gerWomenTeam.addTeam(cycling);
		gerWomenTeam.addTeam(tennis);
		gerMenTeam.addTeam(gerFootball);
		gerMenTeam.addTeam(tableTennis);
		CompositeTeams gerTeam = new CompositeTeams();
		gerTeam.addTeam(gerWomenTeam);
		gerTeam.addTeam(gerMenTeam);
		
		AlpineSki alpineSki = new AlpineSki ("Women's Alpine Ski",4,1);
		Football itFootball = new Football ("Women's Football IT",22,0);
		SwimmingTeam swimmingTeam = new SwimmingTeam ("Women's Swimming Team",10,2);
		CompositeTeams itWomenTeam = new CompositeTeams();
		CompositeTeams itMenTeam = new CompositeTeams();
		itWomenTeam.addTeam(alpineSki);
		itMenTeam.addTeam(itFootball);
		itMenTeam.addTeam(swimmingTeam);
		CompositeTeams itTeam = new CompositeTeams();
		itTeam.addTeam(itWomenTeam);
		itTeam.addTeam(itMenTeam);
		
		CompositeTeams europeTeam = new CompositeTeams();
		europeTeam.addTeam(gerTeam);
		europeTeam.addTeam(itTeam);
		
		CompositeTeams olympicTeams = new CompositeTeams();
		olympicTeams.addTeam(asiaTeam);
		olympicTeams.addTeam(europeTeam);
		
		System.out.println("Germany Men's Team");
		gerMenTeam.NumberOfAthletes();
		System.out.println("Germany");
		gerTeam.NumberOfGoldMedals();
		System.out.println("Asia");
		asiaTeam.NumberOfGoldMedals();
		System.out.println("Olympics 2024");
		olympicTeams.NumberOfAthletes();
	}
}
