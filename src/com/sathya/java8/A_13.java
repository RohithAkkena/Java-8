package com.sathya.java8;

import java.util.List;

public class A_13 {

	public static void main(String[] args) {
		List<Integer>values=List.of(1,2,9,11,77,3,4,5);
		Integer n=values.stream().filter(value->value<10)
		.map(value->value*3)
		.reduce((v1,v2)->v1+v2).get();
		System.out.println(n);

	}

}
