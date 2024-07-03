package com.sathya.java8;
interface Service{
	public String voteCheck(int age, String location);
	
}
public class A_3 {

	public static void main(String[] args) {
		Service s=(age,location)->{String ans=(age>=18) && location.equals("hyderabad")?"Eligible":"Noteligible";
				return ans;};
				System.out.println(s.voteCheck(19, "hyderabad"));
		
		}
		

	}


