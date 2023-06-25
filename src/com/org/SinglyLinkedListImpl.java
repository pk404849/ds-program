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

	public void createList(int data, SinglyLinkedListImpl list) {

		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			Node current = list.head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
		}
	}
	
	public void displayList(SinglyLinkedListImpl list) {
		if(list.head != null) {
			Node current = list.head;
			
			while(current != null) {
				System.out.print(current.data+" ");
				current = current.next;
			}
			System.out.println();
		}
	}
	
	public void insertBeginning(int data, SinglyLinkedListImpl list) {
		if(list.head != null) {
			
			Node newNode = new Node(data);
			newNode.next = head;
			head = newNode;
		}
	}
	
	public void insertEnd(int data, SinglyLinkedListImpl list) {
		if(list.head != null) {
			Node newNode = new Node(data);
			Node current = list.head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
		}
	}

	public void insertBetweenInTheList(int data, int position, SinglyLinkedListImpl list) {
		Node newNode = new Node(data);
		if(list.head != null) {
			int ctr=1;
			Node current = list.head;
			while(current.next != null) {
				ctr++;
				if(ctr == position) {
					break;
				}
				current = current.next;
			}
			newNode.next = current.next;
			current.next = newNode;
			
		}
	}
	/**
	 * 
	 * delete beginning
	 * delete end
	 * delete between
	 * reverse list 
	 * 
	 */
	
	public static void main(String[] args) {

		SinglyLinkedListImpl list = new SinglyLinkedListImpl();
		for(int i=1;i<=10;i++) {
			list.createList(i, list);
		}
		list.displayList(list);
		System.out.println("insert beginning of the list");
		list.insertBeginning(11, list);
		list.displayList(list);
		System.out.println("insert end of the list");
		list.insertEnd(12, list);
		list.displayList(list);
		System.out.println("insert between of the list");
		list.insertBetweenInTheList(13, 3, list);
		list.displayList(list);
	}

}
