package com.java.ds;

import org.w3c.dom.Node;

public class LinkedListDS {
	
	Node head;
	
	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	//Traverse the link list
	public void printLinkList() {
		Node n = head;
		while(n!=null) {
			System.out.println(n.data +" ");
			n = n.next;
		}
	}
	//Add node at the first
	
	public void push(int data) {
		Node n = new Node(data);
		n.next = head;
		head = n;
	}
	//insert the new node after the given node
	public void insertNextNode(Node preNode, int data) {
		Node newNode = new Node(data);
		newNode.next = preNode.next;
		preNode.next = newNode;
		
	}
	
	//Add new node at the end of the node
	public void addNodeAtLast(int lastData) {
		Node last = new Node(lastData);
		if(head==null) {
			head = last;
		}
		last.next = null;
		
		Node lastElement = head;
		while(lastElement.next!=null) {
			lastElement = lastElement.next;
		}
		lastElement.next = last;
		
		
		
		
	}

	public static void main(String[] args) {
		LinkedListDS lList = new LinkedListDS();
		lList.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		
		lList.head.next = second;
		second.next = third;
		lList.push(5);
		lList.insertNextNode(second, 7);
		lList.addNodeAtLast(8);
		
		lList.printLinkList();

	}

}
