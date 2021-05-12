package com.swapnil.linkedlist;

public class MyLinkedListApp {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list = list.insertNode(list, 10);
		list = list.insertNode(list, 20);
		list = list.insertNode(list, 30);
		list = list.insertNode(list, 40);
		list = list.insertNode(list, 50);
		list = list.insertNode(list, 60);

		//list.rotate(10);
		
		//list.head = list.reverse(list.head);
		
		list.deleteNode(2);
		
		// Write a function to search for an element and delete the node
		
		list.displayList(list);		
	}
}
