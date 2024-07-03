package com.sathya.java8;

import java.util.List;

class Product{
	private Integer pid;
	private String pname;
	private Double pcost;
	public Product(Integer pid, String pname, Double pcost) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pcost = pcost;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", pcost=" + pcost + "]";
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Double getPcost() {
		return pcost;
	}
	public void setPcost(Double pcost) {
		this.pcost = pcost;
	}	
}
public class A_5 {

	public static void main(String[] args) {
		List<Product>products=List.of(
				new Product(101,"phone",10000.45),
				new Product(121, "earbuds", 1999.50),
				new Product(19,"laptop",70000.45),
				new Product(11,"fridge",30000.45)
				);
		products.forEach(pro->System.out.println(pro));
        System.out.println("***********");		

		products.stream()
		.sorted((p1,p2)->p1.getPid().compareTo(p2.getPid()))
		.forEach(pro->System.out.println(pro));
		
		System.out.println("**********");
		
		
		products.stream()
				.sorted((p1,p2)->-p1.getPcost().compareTo(p2.getPcost()))
				.forEach(System.out::println);
		
		
	}

}
