package com.org.leetcode;

public class RemoveLinkedListElements {
	ListNode head;

	class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public void createCycleList(int val) {
		ListNode node = new ListNode(val);
		if (head == null) {
			head = node;
		} else {
			ListNode current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = node;
		}
	}

	public void displayList(ListNode head) {
		if (head != null) {
			ListNode current = head;
			while (current != null) {
				System.out.print(current.val + " ");
				current = current.next;
			}
			System.out.println();
		}
	}

	public ListNode removeElements(ListNode head, int val) {
		if (head != null) {
			ListNode current = head;
			while (current != null && current.val == val) {
				head = current.next;
				current = head;
			}
			while (current.next != null) {
				if (current.next.val == val) {
					current.next = current.next.next;
				} else {

					current = current.next;
				}
			}
			return head;
		}
		return null;
	}

	public static void main(String[] args) {

		RemoveLinkedListElements list = new RemoveLinkedListElements();

		list.createCycleList(1);
		list.createCycleList(3);
		list.createCycleList(2);
		list.createCycleList(1);
		list.createCycleList(4);
		list.createCycleList(1);
		list.createCycleList(3);
		list.createCycleList(2);
		list.createCycleList(1);
		list.displayList(list.head);
		System.out.println("remove element");
		ListNode removeElements = list.removeElements(list.head, 1);
		list.displayList(removeElements);
	}

}
