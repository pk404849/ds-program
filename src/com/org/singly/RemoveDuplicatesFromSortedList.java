package com.org.singly;

public class RemoveDuplicatesFromSortedList {

	ListNode head;
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int val) {
			this.val = val;
			this.next = null;
		}
	}
	
	public void createList(int val) {
		ListNode newNode = new ListNode(val);
		if (head == null) {
			head = newNode;
		} else {
			ListNode current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
		}
	}

	public void displayList() {
		ListNode current = head;
		while (current != null) {
			System.out.print(current.val + " ");
			current = current.next;
		}
		System.out.println();
	}
//1 1 2 2 2 3 4 5 6
	public void removeDuplicateElement() {
		if(head != null) {
			ListNode current = head;
			//ListNode temp = current;
			while(current != null) {
				if(current.val == current.next.val) {
					current = current.next;
					
				}else {
					current.next = current.next;
				}
				//temp.next=current;
			}
			//head = current;
		}
	}
	public static void main(String[] args) {
		RemoveDuplicatesFromSortedList list = new RemoveDuplicatesFromSortedList();
		list.createList(1);
		list.createList(1);
		list.createList(2);
		list.createList(2);
		list.createList(2);
		list.createList(3);
		list.createList(4);
		list.createList(5);
		list.displayList();
		System.out.println("remove duplicate element");
		list.removeDuplicateElement();
		list.displayList();
	}
	

}
