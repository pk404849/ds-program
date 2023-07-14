package com.org.doubly.leetcode;

public class DeleteNNodesAfterMNodesOfLinkedList {
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

//1 2 3 4 5 6 7 8 9 10 
//	M = 2, N = 2
//			Linked List: 1->2->3->4->5->6->7->8
//			Output:
//			Linked List: 1->2->5->6
	public void deleteNNodeAfterMNode(int m, int n) {
		if (head != null) {
			Node current = head;
			while (current != null) {

				int k = 1;
				while (current != null && k < m) {
					current = current.next;
					k++;
				}
				Node temp = current.next;
				int t = 1;
				while (temp != null && t <= n) {
					temp = temp.next;
					t++;
				}
				current.next = temp;
				current = temp;
			}

		}
	}

	public static void main(String[] args) {

		DeleteNNodesAfterMNodesOfLinkedList list = new DeleteNNodesAfterMNodesOfLinkedList();

		for (int i = 1; i <= 10; i++) {
			list.createList(i);
		}
		list.displayList();
		System.out.println("delete Nth node after M node in the list");
		list.deleteNNodeAfterMNode(2, 2);
		list.displayList();
	}

}
