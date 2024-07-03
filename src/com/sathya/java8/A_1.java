package com.sathya.java8;
interface Person{
	void eat();
}

public class A_1 {

	public static void main(String[] args) {
	Person p=()->System.out.println("I like Biryani");
	p.eat();

	}

}
