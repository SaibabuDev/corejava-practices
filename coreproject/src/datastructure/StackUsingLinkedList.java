package datastructure;

public class StackUsingLinkedList {
	// A linked list node
	private class Node {
		int data; // integer data
		Node next; // pointer to the next node
	};

	private Node top;

	public StackUsingLinkedList() {
		this.top = null;
	}

	// Utility function to add an element x in the stack
	public void push(int x) // insert at the beginning
	{
		// Allocate the new node in the heap
		Node node = new Node();

		// check if stack (heap) is full. Then inserting an element would
		// lead to stack overflow
		if (node == null) {
			System.out.print("\nHeap Overflow");
			return;
		}

		System.out.println("Inserting " + x);

		// set the data in allocated node
		node.data = x;

		// Set the .next pointer of the new node to point to the current
		// top node of the list
		node.next = top;

		// update top pointer
		top = node;
	}

	// Utility function to check if the stack is empty or not
	public boolean isEmpty() {
		return top == null;
	}

	// Utility function to return top element in a stack
	public int peek() {
		// check for empty stack
		if (!isEmpty()) {
			return top.data;
		} else {
			System.out.println("Stack is empty");
			return -1;
		}
	}

	// Utility function to pop top element from the stack
	public void pop() // remove at the beginning
	{
		// check for stack underflow
		if (top == null) {
			System.out.print("\nStack Underflow");
			return;
		}

		System.out.println("Removing " + peek());

		// update the top pointer to point to the next node
		top = (top).next;
	}

	


	public static void main(String[] args) {
		StackUsingLinkedList stack = new StackUsingLinkedList();

		stack.push(1);
		stack.push(2);
		stack.push(3);

		System.out.println("Top element is " + stack.peek());

		stack.pop();
		stack.pop();
		stack.pop();

		if (stack.isEmpty()) {
			System.out.print("Stack is empty");
		} else {
			System.out.print("Stack is not empty");
		}
	}
}
