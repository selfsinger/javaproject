package com.xwrokz.calender.dto;

public class CalenderDTO {
	
	private String weeks;
	private String date;
	private String festivals;
	private int cost;
	public CalenderDTO(String weeks, String date, String festivals, int cost) {
		super();
		this.weeks = weeks;
		this.date = date;
		this.festivals = festivals;
		this.cost = cost;
	}
	public String getWeeks() {
		return weeks;
	}
	public void setWeeks(String weeks) {
		this.weeks = weeks;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getFestivals() {
		return festivals;
	}
	public void setFestivals(String festivals) {
		this.festivals = festivals;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "CalenderDTO [weeks=" + weeks + ", date=" + date + ", festivals=" + festivals + ", cost=" + cost + "]";
	}
	
	
	
	

}
