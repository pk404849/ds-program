package com.org;

public class RemoveDuplicatesFromUnsortedLinkedList {

	Node head;
	 
    class Node {
        int data;
        Node next;
 
        Node(int d){
            data = d;
            next = null;
        }
    }
 
    void remove_duplicates() {
        Node ptr1 = null, ptr2 = null;
        ptr1 = head;
        while (ptr1 != null && ptr1.next != null) {
            ptr2 = ptr1;
            while (ptr2.next != null) {
                if (ptr1.data == ptr2.next.data) {
                    ptr2.next = ptr2.next.next;
                   // System.gc();
                }
                else /* This is tricky */ {
                    ptr2 = ptr2.next;
                }
            }
            ptr1 = ptr1.next;
        }
    }
 
    void printList(Node node)
    {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
 
    public static void main(String[] args)
    {
    	RemoveDuplicatesFromUnsortedLinkedList list = new RemoveDuplicatesFromUnsortedLinkedList();
        list.head = list.new Node(10);
        list.head.next = list.new Node(12);
        list.head.next.next = list.new Node(11);
        list.head.next.next.next = list.new Node(11);
        list.head.next.next.next.next = list.new Node(12);
        list.head.next.next.next.next.next = list.new Node(11);
        list.head.next.next.next.next.next.next = list.new Node(10);
 
        System.out.println(
            "Linked List before removing duplicates : ");
        list.printList(list.head);
 
        list.remove_duplicates();
        System.out.println("\n");
        System.out.println(
            "Linked List after removing duplicates : ");
        list.printList(list.head);
    }
}

