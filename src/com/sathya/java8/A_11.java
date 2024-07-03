package com.sathya.java8;

import java.util.List;

class Employee
{
	private Integer id;
	private String name;
	private Double esal;
	public Employee(Integer id, String name, Double esal) {
		super();
		this.id = id;
		this.name = name;
		this.esal = esal;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", esal=" + esal + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getEsal() {
		return esal;
	}
	public void setEsal(Double esal) {
		this.esal = esal;
	}
	
}

public class A_11 {

	public static void main(String[] args) {
		List<Employee>emps=List.of(
				new Employee(23, "UmaMahesh", 45000.34),
				new Employee(43, "Mahesh", 35000.34),
				new Employee(35, "Vinay", 5000.34),
				new Employee(66, "Mohan", 70000.34),
				new Employee(90, "Raju", 25000.34)
				
				);
		emps.stream().filter(emp->emp.getEsal()>25000).map(emp->emp.getEsal()+1000).forEach(emp->System.out.println(emp));

	}

}
