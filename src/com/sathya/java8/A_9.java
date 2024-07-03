package com.sathya.java8;

import java.util.List;

class Bottle{
	private String Name;
	private String color;
	private String madeIn;
	private Double price;
	public Bottle(String name, String color, String madeIn, Double price) {
		super();
		Name = name;
		this.color = color;
		this.madeIn = madeIn;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Bottle [Name=" + Name + ", color=" + color + ", madeIn=" + madeIn + ", price=" + price + "]";
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMadeIn() {
		return madeIn;
	}
	public void setMadeIn(String madeIn) {
		this.madeIn = madeIn;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
}
public class A_9 {

	public static void main(String[] args) {
		List<Bottle>bottle=List.of(
				new Bottle("Drinkbottle", "Black", "India", 99.54),
				new Bottle("PETbottle", "White", "India", 70.54),
				new Bottle("Cokebottle", "Red", "Korean", 110.54)
				);
		bottle.stream()
		.filter(b->b.getColor()=="Red")
		.forEach(b->System.out.println(b));
		System.out.println("*************");
		bottle.stream()
		.filter(b->b.getPrice()>100)
		.forEach(b->System.out.println(b));
		System.out.println("**********");
		bottle.stream()
		.filter(b->b.getMadeIn().equals("India"))
		.forEach(b->System.out.println(b));
		System.out.println("***************");
		bottle.stream()
		.filter(b->b.getColor()=="White")
		.forEach(b->System.out.println(b));
	}

}
