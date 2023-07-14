package com.org.interview;

class Parent {
	public static void method1() {
		System.out.println("parent");
	}
}

class Child extends Parent {
	public static void method1() {
		System.out.println("child");
	}
}

public class Test3 {

	public static void main(String[] args) {

		Parent p = new Parent();
		p.method1();// parent
		Parent p1 = new Child();
		p1.method1();//error(X) //Parent
	}

}
