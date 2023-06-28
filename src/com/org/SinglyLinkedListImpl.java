package com.org;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

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
	
	public void deleteBeginningOfTheList() {
		if(head != null) {
			head = head.next;
		}
	}
	
 //1 2 3 4 5 6  
// 1 2 3 4 5	
	
	public void delteLastOfTheList() {
		if(head != null) {
			Node current = head;
			while(current.next.next != null) {
				current = current.next;
			}
			current.next = null;
		}
	}

	public void removeDuplicate() {
		int arr[]= {1,3,2,3,1,5,4,3};
		
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		List<Integer> uniqueList = list.stream().distinct().collect(Collectors.toList());
		System.out.println(uniqueList);
		
		Map<Integer, Long> map = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		//find first non repeated element
		Integer integer = map.entrySet().stream().filter(f->f.getValue()==1L).map(m->m.getKey()).findFirst().get();
		System.out.println("first non repeated : "+integer);
		System.out.println(map);
		System.out.println(map.keySet());
		
		String str="princepri";
		List<String> l2 = Arrays.asList(str.split(""));
		Map<String, Long> stringMap = l2.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("string map : "+stringMap);
		String string = stringMap.entrySet().stream().filter(f->f.getValue()==1L).map(m->m.getKey()).findFirst().get();
		System.out.println("string : "+string);
	}
	// 1 2 3 4 c1
	// 1 2 5 4 c2 
	
	public void identicalList(SinglyLinkedListImpl list1, SinglyLinkedListImpl list2) {
		if(list1.head != null && list2.head != null) {
			Node c1 = list1.head;
			Node c2 = list2.head;
			
			while(c1 != null && c2 != null) {
				if(c1.data != c2.data) {
					break;
				}
				c1= c1.next;
				c2=c2.next;
			}
			
			if(c1 == null && c2 == null) {
				System.out.println("both list is identical");
			}else {
				System.out.println("both list is not identical");
			}
		}
	}
	public static void main(String[] args) {

		SinglyLinkedListImpl list = new SinglyLinkedListImpl();
		SinglyLinkedListImpl list1 = new SinglyLinkedListImpl();
		for (int i = 1; i <= 10; i++) {
			if(i==5) {
				list.createList(100);
			}else {
				list.createList(i);
			}
			list1.createList(i);
		}
		list.displayList();
		list1.displayList();
		list1.identicalList(list, list1);;
		System.out.println("insert beginning of the list");
		list.insertBeginning(11);
		list.displayList();
		System.out.println("insert end of the list");
		list.insertEnd(12);
		list.displayList();
		System.out.println("insert between of the list");
		list.insertBetweenInTheList(13, 1);
		list.displayList();
		System.out.println("reverse of the list");
		list.reverseList();
		System.out.println("delete beginning of the list");
		list.deleteBeginningOfTheList();
		list.displayList();
		System.out.println("delete last of the list");
		list.delteLastOfTheList();
		list.displayList();
		System.out.println("=========================");
		list.removeDuplicate();
	}

}
