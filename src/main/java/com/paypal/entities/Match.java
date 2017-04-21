package com.paypal.entities;

public interface Match {

	void setHomeTeam(Team team);
	Team getHomeTeam();
	void setVisitorTeam(Team team);
	Team getVisitorTeam();
	String playMatch();

	

}
