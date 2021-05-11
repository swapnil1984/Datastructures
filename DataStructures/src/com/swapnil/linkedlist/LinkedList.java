package com.swapnil.linkedlist;

public class LinkedList {
	Node head;
	
	static class Node{
		int data;
		Node next = null;
		
		public Node(int data) {
			this.data = data;
		}
	}
	
	// function to insert a new node in linked list	
	public LinkedList insertNode(LinkedList list, int data) {
		Node newNode = new Node(data);
		newNode.next = null;
		
		Node lastNode = list.head;
		
		// check if the list is empty
		if (lastNode == null) {
			list.head = newNode;
		}
		else {
			while(lastNode.next != null) {
				lastNode = lastNode.next;
			}
			lastNode.next = newNode;
		}
		return list;
	}
	
	// function to Display the data inside linked list	
	public void displayList(LinkedList list) {
		Node currentNode = list.head;
		
		// if list is not empty
		if (currentNode != null) {
			// start traversing from left to right
			while(currentNode.next != null) {
				System.out.print(currentNode.data + " ");
				currentNode = currentNode.next;
			}
			System.out.print(currentNode.data + " ");
		}
		else {
			System.out.println("List is empty");
		}
		
	}
	
	// Reverse the linked list	
	public Node reverse(Node head) {
		Node prev = null;
		Node current = head;
		Node next = null;
		
		while(current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		current = prev;
		
		return current;
	}
}