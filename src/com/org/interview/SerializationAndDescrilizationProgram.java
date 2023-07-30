package com.org.interview;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationAndDescrilizationProgram {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Person person = new Person(100, "sharwan", 1000, 25, "Male");
		System.out.println("======= serialization of the program ================");
		System.out.println(person);
		FileOutputStream fos = new FileOutputStream("abc.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(person);
		oos.close();
		fos.close();

		System.out.println("======= deserialization of the program ================");
		FileInputStream fis = new FileInputStream("abc.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object readObject = ois.readObject();
		if (readObject instanceof Person) {
			Person person1 = (Person) readObject;
			System.out.println(person1);
		}
		ois.close();
		fos.close();
	}

}

class Person implements Serializable {
	private static final long serialVersionUID = -4639404956163270104L;
	private int id;
	private transient String name;
	private transient float salary;
	private transient int age;
	private String gender;

	public Person(int id, String name, float salary, int age, String gender) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.age = age;
		this.gender = gender;
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

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", salary=" + salary + ", age=" + age + ", gender=" + gender
				+ "]";
	}

}