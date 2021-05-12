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
	
	// function to return total number of nodes in a linked list
	public int listCount(LinkedList list) {
		Node currentNode = list.head;
		int count = 0;
		
		if (currentNode == null) {
			count = 0;
		}
		else {
			count++;
			
			while(currentNode.next != null) {
				currentNode = currentNode.next;
				count++;
			}
		}
		return count;
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
	
	// Rotate the linked list in counter clock wise by k nodes
	public void rotate(int k) {
		
		// Example: 10->20->30->40->50->60
		
		Node kthNode = null;
		Node currentNode = head;
		
		// currentNode will point to Node 40 at the end of this loop
		while(k != 1 && currentNode != null) {
			currentNode = currentNode.next;
			k--;
		}
		
		if (currentNode == null) {
			return;
		}
		
		// Save the node in kthnode
		kthNode = currentNode;
					
		// currentNode will point to Node 60 at the end of this loop
		while(currentNode.next != null) {
			currentNode = currentNode.next;
		}
		currentNode.next = head;
		head = kthNode.next;
		
		kthNode.next = null;
	}
	
	// Delete nth node
	
	public void deleteNode(int k) {
		// we need to move only upto previous node 
		k = k - 1;
		
		Node currentNode = head;
		Node kMinusOnethNode = null;
		
		// if we are deleting first node
		
		if (k == 0) {
			head = null;
			head = currentNode.next;
		}
		
		// At the end of this loop, either currentNode will reach kth node
		// or will be null
		while(k != 1 && currentNode != null) {
			currentNode = currentNode.next;
			k--;
		}
		
		if (currentNode == null)
			return;
		
		kMinusOnethNode = currentNode;
		currentNode = currentNode.next;
		kMinusOnethNode.next = currentNode.next;
		currentNode = null;
	}
}