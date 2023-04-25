package com.project.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Shirt {
	@Id
	private int modelno;
	private String clothtype;
	private String brand;
	private String color;
	private String size;
	private String pattern;
	private String materialtype;
	private String fit;
	private int price;
	Shirt(){}
	public int getModelno() {
		return modelno;
	}
	public void setModelno(int modelno) {
		this.modelno = modelno;
	}
	public String getClothtype() {
		return clothtype;
	}
	public void setClothtype(String clothtype) {
		this.clothtype = clothtype;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getPattern() {
		return pattern;
	}
	public void setPattern(String pattern) {
		this.pattern = pattern;
	}
	public String getMaterialtype() {
		return materialtype;
	}
	public void setMaterialtype(String materialtype) {
		this.materialtype = materialtype;
	}
	public String getFit() {
		return fit;
	}
	public void setFit(String fit) {
		this.fit = fit;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Shirt(int modelno, String clothtype, String brand, String color, String size, String pattern,
			String materialtype, String fit, int price) {
		super();
		this.modelno = modelno;
		this.clothtype = clothtype;
		this.brand = brand;
		this.color = color;
		this.size = size;
		this.pattern = pattern;
		this.materialtype = materialtype;
		this.fit = fit;
		this.price = price;
	}
	

}
