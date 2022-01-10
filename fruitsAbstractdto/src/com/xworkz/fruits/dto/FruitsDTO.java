package com.xworkz.fruits.dto;

public class FruitsDTO {
	private String name;
	int cost;
	public FruitsDTO(String name, int cost) {
		
		this.name = name;
		this.cost = cost;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "FruitsDTO [name=" + name + ", cost=" + cost + "]";
	}
	
	
	
	

}
