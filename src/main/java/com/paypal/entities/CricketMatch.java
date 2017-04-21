package com.paypal.entities;

import javax.sql.DataSource;

public class CricketMatch implements Match {
	
	private Team homeTeam;
	private Team visitorTeam;
	private DataSource datasource;
	
	public CricketMatch(Team homeTeam, Team visitorTeam) {
		super();
		this.homeTeam = homeTeam;
		this.visitorTeam = visitorTeam;
	}
	
	public String playMatch(){
		return Math.random() < 0.5 ? getHomeTeam().getName() : getVisitorTeam().getName();
	}
	
	public Team getHomeTeam() {
		return homeTeam;
	}

	public void setHomeTeam(Team homeTeam) {
		this.homeTeam = homeTeam;
	}

	public Team getVisitorTeam() {
		return visitorTeam;
	}

	public void setVisitorTeam(Team visitorTeam) {
		this.visitorTeam = visitorTeam;
	}

	public DataSource getDatasource() {
		return datasource;
	}

	public void setDatasource(DataSource datasource) {
		this.datasource = datasource;
	}

	
	


}
