package com.sathya.java8;
interface Operation{
	public void mul(int num1,int num2);
		
	}

public class A_2 {

	public static void main(String[] args) {
		Operation o=(n1,n2)->System.out.println(n1*n2);
		o.mul(23, 34);
		

	}

}
