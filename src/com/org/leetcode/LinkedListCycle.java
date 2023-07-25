package com.org.leetcode;

import java.util.ArrayList;
import java.util.List;

public class LinkedListCycle {

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
			node.next = head;
		} else {
			ListNode current = head;
			while (current.next != head) {
				current = current.next;
			}
			current.next = node;
			node.next = head;
		}
	}

	public void displayList() {
		if (head != null) {
			ListNode current = head;
			do {
				System.out.print(current.val + " ");
				current = current.next;
			} while (current != head);
			System.out.println();
		}
	}

	public boolean hasCycle(ListNode head) {
		List<ListNode> al = new ArrayList<>();
		boolean flag = false;
		if (head != null) {
			ListNode current = head;
			while (current != null) {
				if (al.contains(current)) {
					flag = true;
					break;
				} else {
					al.add(current);
				}
				current = current.next;
			}
		}
		return flag;
	}

	public static void main(String[] args) {

		LinkedListCycle list = new LinkedListCycle();
		for (int i = 1; i <= 10; i++) {
			list.createCycleList(i);
		}
		list.displayList();
		System.out.println(list.hasCycle(list.head));
	}

}
