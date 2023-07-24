package com.org.interview;

class MyThreadOne extends Thread{
	
	public void run() {
		for(int i=1;i<=10;i++) {
			if(i%2 == 0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}
}
class MyThreadTwo extends Thread{
	
	public void run() {
		for(int i=1;i<=10;i++) {
			if(i%2 != 0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}
}
public class PrintEvenOddNumberUsingTwoThread {

	public static void main(String[] args) throws InterruptedException {
		
		MyThreadOne t1 = new MyThreadOne();
		MyThreadTwo t2 = new MyThreadTwo();
		t1.start();
		t2.start();
		//t1.join();
		//t2.join();
	}

}
