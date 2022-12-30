package com.randomTeamGenerator.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomMatchTeams {
	List<String> controllerList;
	List<String> newList = new ArrayList<>();

	public void getListFromModel(List<String> list) {
		this.controllerList = list;
		Random random = new Random();
		while (controllerList.size() != 0) {
			int randomValue = random.nextInt(controllerList.size());
			newList.add(controllerList.get(randomValue));
			list.remove(controllerList.get(randomValue));
		}
		System.out.println("***********************");
		System.out.println("Random team list "+newList);
		System.out.println("***********************");
		displayMatch(newList);
	}
	
	public static void displayMatch(List<String> list) {
		
		for(int i=0;i<list.size();i=i+2) {
	
			System.out.println(list.get(i)+" Vs "+list.get(i+1));
		
		}
	}

}
