package com.org.interview;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeObjectManipulation {

	public static void main(String[] args) {
		
		 List<EmployeeObj> emplist= new ArrayList<EmployeeObj>();
	     emplist.add(new EmployeeObj(107, "sharwan", 30, 18000, "male", 7));
	     emplist.add(new EmployeeObj(102, "balak", 32, 17000, "male", 3));
	     emplist.add(new EmployeeObj(101, "kumar", 20, 28000, "male", 5));
	     emplist.add(new EmployeeObj(111, "prince", 32, 26000, "male", 8));
	     emplist.add(new EmployeeObj(107, "shyam", 33, 15000, "male", 5));
	     emplist.add(new EmployeeObj(110, "aman", 24, 12000, "male", 7));
	     emplist.add(new EmployeeObj(103, "sakshi", 21, 19000, "female", 4));
	     emplist.add(new EmployeeObj(107, "kumar", 33, 16000, "male", 6));
	     emplist.add(new EmployeeObj(109, "kumar", 34, 24000, "male", 3));
	     //print the employee details whose salary is greater than 20000
	     List<EmployeeObj> salaryGreater20k = emplist.stream().filter(e->e.getSalary()>20000).collect(Collectors.toList());
		 System.out.println(salaryGreater20k);
		 System.out.println("-------------------------------------------------------");
	     //print the employee details if the name is same then sort by salary
		emplist.sort(Comparator.comparing(EmployeeObj::getName).thenComparing(EmployeeObj::getSalary));
		emplist.forEach(System.out::println);
		System.out.println("-------------------------------------------------------");
		//print the employee details based on departmentId 
		Map<Integer, List<EmployeeObj>> departmentId = emplist.stream().collect(Collectors.groupingBy(EmployeeObj::getDeptId));
		departmentId.entrySet().forEach(e->{
			System.out.println(e.getKey()+"----- "+e.getValue());
		});
		//System.out.println(departmentId);
		System.out.println("-------------------------------------------------------");
		//print the employee details based on employees working on each departmentId
		Map<Integer, Long> countBasedOnDeptId = emplist.stream().collect(Collectors.groupingBy(EmployeeObj::getDeptId,Collectors.counting()));
		countBasedOnDeptId.entrySet().forEach(d->{
			System.out.println(d.getKey()+"----> "+d.getValue());
		});
		}

}
class EmployeeObj {
	private int id;
	private String name;
	private int age;
	private int salary;
	private String gender;
	private int deptId;
	public EmployeeObj(int id, String name, int age, int salary, String gender, int deptId) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.gender = gender;
		this.deptId = deptId;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + ", gender=" + gender
				+ ", deptId=" + deptId + "]";
	}
	
}
