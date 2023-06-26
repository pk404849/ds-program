package com.org;

public class SinglyLinkedListImpl {

	Node head;

	class Node {
		int data;
		Node next = null;

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

	public void insertBeginning(int data) {
		if (head != null) {
			Node newNode = new Node(data);
			newNode.next = head;
			head = newNode;
		}
	}

	public void insertEnd(int data) {
		if (head != null) {
			Node newNode = new Node(data);
			Node current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
		}
	}

	public void insertBetweenInTheList(int data, int position) {
		Node newNode = new Node(data);
		if (head != null) {
			if (position == 1) {
				newNode.next = head;
				head = newNode;
			} else {
				int ctr = 1;
				Node current = head;
				while (current.next != null) {
					ctr++;
					if (ctr == position) {
						break;
					}
					current = current.next;
				}
				newNode.next = current.next;
				current.next = newNode;
			}
		}
	}

	/**
	 * 
	 * delete beginning delete end delete between reverse list
	 * 
	 */
	
	public void reverseList() {
		 Node prev = null;
	        Node current = head;
	        Node next = null;
	        while (current != null) {
	            next = current.next;
	            current.next = prev;
	            prev = current;
	            current = next;
	        }
	        if(prev != null) {
	        	
	        }
	        head = prev;
	        
	        displayList();
	}

	public static void main(String[] args) {

		SinglyLinkedListImpl list = new SinglyLinkedListImpl();
		for (int i = 1; i <= 10; i++) {
			list.createList(i);
		}
		list.displayList();
		System.out.println("insert beginning of the list");
		list.insertBeginning(1 );
		list.displayList();
		System.out.println("insert end of the list");
		list.insertEnd(12);
		list.displayList();
		System.out.println("insert between of the list");
		list.insertBetweenInTheList(13, 1);
		list.displayList();
		System.out.println("reverse of the list");
		list.reverseList();
	}

}
