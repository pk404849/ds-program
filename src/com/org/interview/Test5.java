package com.org.interview;

public class Test5 {

	int n=10;
	int i=1;
	boolean flag = true; 
	int j=1;
	public void printFirst() throws InterruptedException {
		synchronized (this) {
		while(i<=n) {
			System.out.println("print first : "+i);
			i++;
			j++;
		}
		
		}
	}
	
	public void printSecond() throws InterruptedException {
		synchronized (this) {
		while(i<=n) {
			System.out.println("print second : "+i);
			i++;
			j++;
		}
		
		}
	}
	public void printThird() throws InterruptedException {
		synchronized (this) {
		while(i<=n) {
			System.out.println("print third : "+i);
			j++;
			i++;
		}
		
		}
	}
	public static void main(String[] args) throws InterruptedException {

		Test5 t = new  Test5();
		Thread t1 = new Thread(new Runnable(){

			@Override
			public void run() {
				try {
					t.printFirst();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		});
		
		Thread t2 = new Thread(new Runnable(){

			@Override
			public void run() {
				try {
					t.printSecond();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		});
		
		Thread t3 = new Thread(new Runnable(){

			@Override
			public void run() {
				try {
					t.printThird();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		});
			t1.start();
			t2.start();
			t2.join();
			t3.start();
			t3.join();
		
		
			//select salary from Employee order by salary desc limit 2,1;
			
	}

}
