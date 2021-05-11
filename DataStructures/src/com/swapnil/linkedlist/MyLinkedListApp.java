package com.swapnil.linkedlist;

public class MyLinkedListApp {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list = list.insertNode(list, 10);
		list = list.insertNode(list, 20);
		list = list.insertNode(list, 30);
		list = list.insertNode(list, 40);
		list = list.insertNode(list, 50);

		list.head = list.reverse(list.head);
		
		list.displayList(list);
		
	}
}
