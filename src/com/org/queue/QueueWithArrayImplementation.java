package com.org.queue;

public class QueueWithArrayImplementation {

	int front, rear, size, capacity;
	int queue[];// capactity = 10

	public QueueWithArrayImplementation(int capacity) {
		this.front = this.rear = this.size = 0;
		this.capacity = capacity;
		this.queue = new int[this.capacity];
	}

	public void enqueue(int data) {
		if (capacity == size) {
			System.out.println("queue is overflow.....");
			return;
		}
		queue[rear] = data;
		rear++;
		size++;
	}

	public void dequeue() {
		if (this.rear == this.front) {
			System.out.println("queue is underflow.....");
			return;
		}
		int dequeueData = queue[front];
		front++;
		size--;
		System.out.println("dequeue data : " + dequeueData);
	}
	
	public void printQueue() {
		if (rear == front) {
			System.out.println("queue is underflow.....");
			return;
		}
		
		for(int i=this.front;i<rear;i++) {
			System.out.print(queue[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		QueueWithArrayImplementation queue = new QueueWithArrayImplementation(10);
		for(int i=0;i<5;i++) {
			queue.enqueue(i+1);
		}
		System.out.println("queue element is ");
		queue.printQueue();
		queue.dequeue();
		queue.printQueue();
		queue.enqueue(10);
		queue.printQueue();
		queue.dequeue();
		queue.printQueue();
	}

}
