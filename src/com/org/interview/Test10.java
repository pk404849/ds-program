package com.org.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

class Student{
	private String name;
	private Integer marks;
	
	
	public Student(String name, Integer marks) {
		this.name = name;
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getMarks() {
		return marks;
	}
	public void setMarks(Integer marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + "]";
	}
	
	
}
public class Test10 {

	public static void listOfNameMinMarks(List<Student> list) {
		Map<Integer, List<Student>> map = new HashMap<>();
		for(Student s : list) {
			List<Student> tempList = new ArrayList<>();
			if(map.containsKey(s.getMarks())) {
				tempList = map.get(s.getMarks());
				tempList.add(s);
				map.put(s.getMarks(), tempList);
			}else {
				tempList.add(s);
				map.put(s.getMarks(),tempList );
			}
		}
		System.out.println(map);
		//{70=[Student [name=A, marks=70]], 40=[Student [name=B, marks=40], Student [name=C, marks=40]]}
		
		Map<Integer, List<Student>> collect = list.stream().collect(Collectors.groupingBy(l->l.getMarks()));
		List<String> nameList = collect.entrySet().stream().min(Comparator.comparing(Map.Entry::getKey)).get()
				.getValue().stream().map(m->m.getName()).collect(Collectors.toList());
		System.out.println(collect);
		System.out.println(nameList);
	}
	public static void main(String[] args) {

		ArrayList<Student> list1 = new  ArrayList<>();
		list1.add(new Student("A",70));
		list1.add(new Student("B",40));
		list1.add(new Student("C",40));
		
		//list1.stream().
		System.out.println("===========map object prining=============");
		listOfNameMinMarks(list1);
		String string = list1.stream().min(Comparator.comparing(Student::getMarks)).map(m->m.getName()).get();
		System.out.println(string);
		
			Map<Integer, Long> collect = list1.stream().collect(Collectors.groupingBy(c->c.getMarks(), Collectors.counting()));
			System.out.println("collect : "+collect);
			
			 Map<Integer, List<Student>> collect2 = list1.stream().collect(Collectors.groupingBy(k->k.getMarks()));
			System.out.println("collect2 : "+collect2);
			List<String> collect3 = collect2.entrySet().stream().min(Comparator.comparing(Map.Entry::getKey)).get().getValue()
					.stream().map(m2->m2.getName() +" : " +m2.getMarks()).collect(Collectors.toList());
			System.out.println("collect3 : "+collect3);
		
		String str = "abcxdcyab";

		List<String> list = Arrays.asList(str.split(""));

		String firstNoneRepeated = list.stream()
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(f -> f.getValue() == 1L).map(m -> m.getKey()).findFirst().get();
		System.out.println(firstNoneRepeated);

		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}

		for(Map.Entry<Character, Integer> entry:map.entrySet()){
			if(entry.getValue() == 1) {
				System.out.println(entry.getKey()+"  :  "+entry.getValue());
				break;
			}
		}
	}

}
