package com.org.singly;

public class IntersectionOfTwoLinkedLists {

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

	public void displayList(IntersectionOfTwoLinkedLists list) {
		ListNode current = list.head;
		while (current != null) {
			System.out.print(current.val + " ");
			current = current.next;
		}
		System.out.println();
	}
	
	public void intersectionOfTwoList(IntersectionOfTwoLinkedLists list1, IntersectionOfTwoLinkedLists list2) {
		ListNode c1 = list1.head;
		
	}
	public static void main(String[] args) {
		IntersectionOfTwoLinkedLists list1 = new IntersectionOfTwoLinkedLists();
		list1.createList(5);
		list1.createList(6);
		list1.createList(1);
		list1.createList(8);
		list1.createList(4);
		list1.createList(5);
		System.out.println("first list data");
		list1.displayList(list1);
		IntersectionOfTwoLinkedLists list2 = new IntersectionOfTwoLinkedLists();
		list2.createList(4);
		list2.createList(1);
		list2.createList(8);
		list2.createList(4);
		list2.createList(5);
		System.out.println("second list data");
		list1.displayList(list2);
		
		//listA = [4,1,8,4,5], listB = [5,6,1,8,4,5]

	}

}
