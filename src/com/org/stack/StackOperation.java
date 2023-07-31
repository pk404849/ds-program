package com.org.stack;

public class StackOperation {

	int max=6;
	int top=-1;
	int stack[] = new int[max];
	
	public void push(int data) {
		if(top >=max-1) {
			System.out.println("stack is overflow....");
		}else {
			stack[++top]= data;
			System.out.println("TOP = "+top);
		}
	}
	
	public void printStack() {
		if(top<0) {
			System.out.println("stack is empty.......");
		}else {
			for(int i=0;i<=top;i++) {
				System.out.print(stack[i]+" ");
			}
		}
	}
	public static void main(String[] args) {

		StackOperation s = new StackOperation();
		s.push(10);
		s.push(30);
		s.push(20);
		s.push(50);
		s.push(10);
		s.push(40);
		//s.push(60);
		s.printStack();
		
	}

}
