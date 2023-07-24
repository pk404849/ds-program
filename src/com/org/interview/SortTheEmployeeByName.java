package com.org.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SortTheEmployeeByName {
	
	public static void main(String[] args) {
		
		EmployeeSortByName e1 = new EmployeeSortByName(1, "prince", 98763473);
		EmployeeSortByName e2 = new EmployeeSortByName(2, "akash", 987656573);
		EmployeeSortByName e3 = new EmployeeSortByName(3, "rajesh", 98454573);
		EmployeeSortByName e4 = new EmployeeSortByName(4, "prince", 387645465);
		EmployeeSortByName e5 = new EmployeeSortByName(5, "pankaj", 287630904);
		EmployeeSortByName e6 = new EmployeeSortByName(6, "ankush", 987634790);
		EmployeeSortByName e7 = new EmployeeSortByName(7, "prince", 587610233);
		EmployeeSortByName e8 = new EmployeeSortByName(8, "pankaj", 387619802);
		EmployeeSortByName e9 = new EmployeeSortByName(9, "akash", 987631090);
		EmployeeSortByName e10 = new EmployeeSortByName(10, "prince", 987619083);
		
		List<EmployeeSortByName> list = new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		list.add(e6);
		list.add(e7);
		list.add(e8);
		list.add(e9);
		list.add(e10);
		
		list.forEach(System.out::println);
		
		System.out.println("================= after sorting for employee by name ==================");
		
		List<EmployeeSortByName> sortedByName = list.stream().sorted((o1,o2)->o1.name.equals(o2.name) ?o1.phone.compareTo(o2.phone):o1.name.compareTo(o2.name))
		.collect(Collectors.toList());
		sortedByName.forEach(System.out::println);
		
		System.out.println("================= starts with one into the list ==================");
		
		List<Integer> listInt = Arrays.asList(12,23,14,15,14,23,32,36);
		List<String> startsWithOne = listInt.stream().map(m->m+"").filter(f->f.startsWith("1")).collect(Collectors.toList());
		System.out.println(startsWithOne);
		System.out.println("================= employee phone number starts with 98 ==================");
//		List<String> startsWint98 = list.stream().map(m1->m1.phone+"").filter(f1->f1.startsWith("98")).sorted((o3,o4)->o3.name.compareTo(o4.name)).collect(Collectors.toList());
//		System.out.println(startsWint98);
		
		
		
		
	}

}
class EmployeeSortByName{
	int id;
	String name;
	Integer phone;
	
	public EmployeeSortByName(int id, String name, int phone) {
		this.id = id;
		this.name = name;
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		return "EmployeeSortByName [id=" + id + ", name=" + name + ", phone=" + phone + "]";
	}
}