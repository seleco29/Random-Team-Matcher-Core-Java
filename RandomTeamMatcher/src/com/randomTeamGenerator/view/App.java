package com.randomTeamGenerator.view;

import com.randomTeamGenerator.model.TeamNames;

public class App {
	public static void main(String[] args) {
		TeamNames teamNames = new TeamNames();
		teamNames.addTeams("team1");
		teamNames.addTeams("Team2");
		teamNames.addTeams("team3");
		teamNames.addTeams("team4");
		teamNames.addTeams("team5");
		teamNames.addTeams("team6");

		System.out.println("Original team list "+teamNames.viewTeamNames());
		teamNames.sendList();
	}
}
