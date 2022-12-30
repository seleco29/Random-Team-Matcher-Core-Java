package com.randomTeamGenerator.model;

import java.util.ArrayList;
import java.util.List;

import com.randomTeamGenerator.controller.RandomMatchTeams;

public class TeamNames {
	RandomMatchTeams rmt = new RandomMatchTeams();

	List<String> teamNames = new ArrayList<>();

	public void addTeams(String name) {
		teamNames.add(name);
	}

	public List<String> viewTeamNames() {
		return teamNames;
	}

	public void sendList() {
		rmt.getListFromModel(teamNames);
	}
}
