package com.xworkz.abstractdto.dto;

public class IplTeamDTO {
	
	String id,name,sponser,captain;
	int noOfWins,noOfLostMatch;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSponser() {
		return sponser;
	}
	public void setSponser(String sponser) {
		this.sponser = sponser;
	}
	public String getCaptain() {
		return captain;
	}
	public void setCaptain(String captain) {
		this.captain = captain;
	}
	public int getNoOfWins() {
		return noOfWins;
	}
	public void setNoOfWins(int noOfWins) {
		this.noOfWins = noOfWins;
	}
	public int getNoOfLostMatch() {
		return noOfLostMatch;
	}
	public void setNoOfLostMatch(int noOfLostMatch) {
		this.noOfLostMatch = noOfLostMatch;
	}
	
}
