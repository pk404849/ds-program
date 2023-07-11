package com.org.interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee {
	int id;
	String name;
	int salary;

	public Employee(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}

public class Test {

	public static void main(String[] args) {

		Employee e1 = new Employee(101,"pk",1000);
		Employee e2 = new Employee(102,"ak",2000);
		Employee e3 = new Employee(103,"pk",3000);
		Employee e4 = new Employee(104,"ak",4000);
		Employee e5 = new Employee(105,"lk",5000);
		
		List<Employee> list = new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		
	
		
		 int oddSum = list.stream().filter(f->f.getId() % 2 !=0).mapToInt(m->m.getSalary()).sum();
		int evenSum = list.stream().filter(f->f.getId() % 2 ==0).mapToInt(m->m.getSalary()).sum();
		
		System.out.println("oddsum : "+oddSum);
		System.out.println("evenSum : "+evenSum); 
		
		Map<String, Long> map = list.stream().collect(Collectors.groupingBy(e10->e10.getName(),Collectors.counting()));
		System.out.println(map);
		
		String str="rambalk";
		
		Map<Character, Integer> occuranceMap = new HashMap<>();

		for(int i=0;i<str.length();i++) {
			if(occuranceMap.containsKey(str.charAt(i))) {
				occuranceMap.put(str.charAt(i), occuranceMap.get(str.charAt(i))+1);
			}else {
				occuranceMap.put(str.charAt(i), 1);
			}
		}
		System.out.println("occuranceMap : "+occuranceMap);
		
	
	}

}