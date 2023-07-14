package com.org.doubly.leetcode;

public class ConvertBinaryNumberInLinkedListToInteger {

	Node head;

	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	public void createList(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			Node current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
		}
	}

	public void displayList() {
		if (head != null) {
			Node current = head;
			while (current != null) {
				System.out.print(current.data + " ");
				current = current.next;
			}
			System.out.println();
		}
	}

	public void reverseList() {
		if(head != null) {
			Node current = head;
			Node next = null;
			Node prev = null;
			while(current != null) {
				next = current.next;
				current.next = prev;
				prev = current;
				current = next;
			}
			if(prev != null) {
				head = prev;
			}
		}
	}
	public int convertBinaryListToInteger() {
		if(head != null) {
			reverseList();
			Node current = head;
			int k=0;
			int sum = 0;
			while(current != null) {
				int data = current.data;
				sum = sum + data*(int)Math.pow(2, k++);
				current = current.next;
			}
			//System.out.println("decimal number is : "+sum);
			return sum;
		}
		return 0;
	}
	public static void main(String[] args) {

		ConvertBinaryNumberInLinkedListToInteger list = new ConvertBinaryNumberInLinkedListToInteger();
		
		//list.createList(1);
		list.createList(1);
		list.createList(0);
		list.createList(1);
		//list.createList(1);
		
		list.displayList();
		System.out.println("reverse of the binary list");
		System.out.println(list.convertBinaryListToInteger());
		
	}

}
