package com.sathya.java8;

import java.util.List;

class Student{
	private String rollNo;
	private String Name;
	private Integer maths;
	private Integer science;
	private Integer Social;
	public Student(String rollNo, String name, Integer maths, Integer science, Integer social) {
		super();
		this.rollNo = rollNo;
		Name = name;
		this.maths = maths;
		this.science = science;
		Social = social;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", Name=" + Name + ", maths=" + maths + ", science=" + science
				+ ", Social=" + Social + "]";
	}
	public String getRollNo() {
		return rollNo;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Integer getMaths() {
		return maths;
	}
	public void setMaths(Integer maths) {
		this.maths = maths;
	}
	public Integer getScience() {
		return science;
	}
	public void setScience(Integer science) {
		this.science = science;
	}
	public Integer getSocial() {
		return Social;
	}
	public void setSocial(Integer social) {
		Social = social;
	}
	
	
	
}
public class A_8 {

	public static void main(String[] args) {
		List<Student>students=List.of(
				new Student("19341a0310", "rohith", 110, 150, 290),
				new Student("19341a0315", "dp", 30, 50, 30),
				new Student("19341a0325", "suresh", 200, 310, 290)
				);
		students.stream()
		.filter(stu->((stu.getMaths())+(stu.getScience())+(stu.getSocial()))>150)
		.forEach(stu->System.out.println(stu));
		System.out.println("**************");
		students.stream()
		.filter(stu->((stu.getMaths())+(stu.getScience())+(stu.getSocial()))/3>150)
		.forEach(stu->System.out.println(stu));

	}

}
