package com.xworkz.pen.dto;

public class PenDTO {
	private String name;
	private String brandName;
	
	
	public PenDTO(String name, String brandName) {
		
		this.name = name;
		this.brandName = brandName;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	@Override
	public String toString() {
		return "PenDTO [name=" + name + ", brandName=" + brandName + "]";
	}
	

	
	
	

}
