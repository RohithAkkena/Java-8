package com.sathya.java8;

import java.util.List;

public class A_12 {

	public static void main(String[] args) {
		List<String>names=List.of("raju","rani","anu","sathya","ratan");
	    names.stream()
		.filter(name->name.startsWith("r")&&name.length()<=4)
		.map(name->name+"it")
		.forEach(name->System.out.println(name));
	    
	   String l= names.stream()
				.filter(name->name.startsWith("r")&&name.length()<=4)
				.map(name->name+"it")
				.reduce((n1,n2)->n1+n2)
				.get();
	   System.out.println(l.length());
		
				

	}

}
