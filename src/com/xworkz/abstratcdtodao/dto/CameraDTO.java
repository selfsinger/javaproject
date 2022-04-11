package com.xworkz.abstratcdtodao.dto;

/**
 * @author acer
 *
 */
public class CameraDTO {
	// id,brand,pixel,type,price
	 int id;
	 String brand,pixel,type;
	double price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getPixel() {
		return pixel;
	}
	public void setPixel(String pixel) {
		this.pixel = pixel;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "CameraDTO [id=" + id + ", brand=" + brand + ", pixel=" + pixel + ", type=" + type + ", price=" + price
				+ "]";
	}
	
	
	

}
