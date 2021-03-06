package chapter03;

import chapter02.Node;

/* I made a Stack of NODES. Book does a Stack of OBJECTS */
public class Stack {
	private Node top = null;
	
	public void push(int data){
		Node n = new Node(data);
		n.next = top;
		top = n;
	}
	
	public Node pop(){
		if (top == null)
			return null;
		Node n = top;
		top = top.next;
		n.next = null;	// rips off the node from the Stack
		return n;
	}
	
	public Node peek(){
		return top;
	}
}
