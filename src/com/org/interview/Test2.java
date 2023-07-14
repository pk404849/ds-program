package com.org.interview;

//@FunctionalInterface
interface FunTest1{
	public void method2();
	default void method1() {
		System.out.println("fun test 1");
	}
}
//@FunctionalInterface
interface FunTest2{
	public void method2();
	default void method1() {
		System.out.println("fun test 2");
	}
}
public class Test2 implements FunTest1, FunTest2 {

	public static void main(String[] args) {
		
		Test2 t2= new Test2();
		t2.method1();

	}

	@Override
	public void method1() {
		FunTest2.super.method1();
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}


	
	
	
}
