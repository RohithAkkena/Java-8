package com.sathya.java8;

import java.util.List;

public class A_10 {

	public static void main(String[] args) {
		List<Double>interestRates=List.of(7.6,5.7,11.2,15.3);
		interestRates.stream().map(interest->interest+2)
		.forEach(interest->System.out.println(interest));

	}

}
