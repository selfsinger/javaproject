package com.xworkz.map.dto;

public class MapDTO {
private String type;
private int price;
public MapDTO(String type, int price) {
	super();
	this.type = type;
	this.price = price;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
@Override
public String toString() {
	return "MapDTO [type=" + type + ", price=" + price + "]";
}


}
