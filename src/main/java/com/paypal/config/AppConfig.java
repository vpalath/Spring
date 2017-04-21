package com.paypal.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.paypal.entities.CSK;
import com.paypal.entities.CricketMatch;
import com.paypal.entities.DelhiDare;
import com.paypal.entities.Match;
import com.paypal.entities.RoyalChallengers;
import com.paypal.entities.Team;

@Configuration
@Import(DBConnectInfo.class)
public class AppConfig {
	
	@Bean
	public Team csk(){
		return new CSK();
	}
	
	@Bean
	public Team delhiDare(){
		return new DelhiDare();
	}
	
	@Bean
	public Team royalChallengers(){
		return new RoyalChallengers();
	}
	
	@Bean
	public Match match(DataSource dataSource){
		CricketMatch cm = new CricketMatch(csk(),delhiDare());
		cm.setDatasource(dataSource);
		return cm;
	}
	
}

