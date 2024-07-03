package com.sathya.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class A_14 {

	public static void main(String[] args) {
		List<Integer>numbers=Arrays.asList(2,6,1,8,19,10,3,25);
		Collections.sort(numbers);
		System.out.println("Ascending order......"+numbers);
		Collections.sort(numbers,Collections.reverseOrder());
		System.out.println("Descending order...."+numbers);
		System.out.println("**************");
		numbers.sort((n1,n2)->n1.compareTo(n2));
		System.out.println("Ascending order....."+numbers);
		numbers.sort((n1,n2)->-n1.compareTo(n2));
		System.out.println("Descending order..."+numbers);

	}

}
