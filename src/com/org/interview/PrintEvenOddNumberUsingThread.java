package com.org.interview;

public class PrintEvenOddNumberUsingThread {

	int n=10;
	int counter = 1;

	public void printEvenNumber() throws InterruptedException {
		synchronized (this) {
			while (counter < n) {
				while (counter % 2 == 0) {
						wait();
				}
				System.out.print(counter+" ");
				counter++;
				notify();
			}
			
		}
	}

	public void printOddNumber() throws InterruptedException {
		synchronized (this) {
			while (counter < n) {
				while (counter % 2 != 0) {
						wait();
				}
				System.out.print(counter+" ");
				counter++;
				notify();
			}
		}
	}

	public static void main(String[] args) {
		
		PrintEvenOddNumberUsingThread obj = new PrintEvenOddNumberUsingThread();

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					obj.printEvenNumber();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					obj.printOddNumber();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		t1.start();
		t2.start();
	}

}
