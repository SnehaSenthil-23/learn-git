package examly;
import java.util.*;

class Node {
	int data;
	Node next;
	public Node(int data, Node next) {
		this.data = data;
		this.next = next;
	}
}

public class LL {
	static Node head = null;
	static Node head2 = null;
	static void create(Node newNode) {
		head = newNode;
	}
	
	static void append(Node newNode) {
		Node temp = head;
		while(temp.next != null) {
//			if(temp.data == newNode.data) {
//				System.out.println("The element is already present in the LL");
//				return;
//			}
			temp = temp.next;
		}
		temp.next = newNode;
	}
	
	static void print() {
		Node temp = head;
		if(head == null) {
			System.out.println("No element exists");
		} else {
			while(temp!=null) {
				System.out.print(temp.data + " ");
				temp = temp.next;
			}
			System.out.println();
		}
	}
//   P  C  N
//<- 1<-2<-3->4->5
	
//	static void reverse() {
//		Node previous = null;
//        Node current = head;
//        Node next = null;
//        while (current != null) {
//            next = current.next;
//            current.next = previous;
//            previous = current;
//            current = next;
//        }
//        head = previous;
//	}
	
	static void push(int data) {
		Node newNode = new Node(data, null);
		Node temp = head;
		if(head == null) {
			head = newNode;
		} else {
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}
	
	static void pop() {
		Node temp = head;
		if(temp == null) {
			System.out.println("No element exists");
			return;
		} else {
			if(head.next == null) {
				head = null;
			} else {
				while(temp.next.next != null) {   
					temp = temp.next;
				}
				temp.next = null;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = 0;
		System.out.print("Enter the size:");
		int N = in.nextInt();
		while(count < N) {
			System.out.print("Enter the value:");
			int number = in.nextInt();
			Node newNode = new Node(number,null);
			if(count == 0) {
				create(newNode);
			} else {
				append(newNode);
			}
			count++;
		}
		System.out.println("LL:");
		print();
		int choice = 0;
		do {
			System.out.println("0.exit 1.push 2.pop 3.display");
			choice = in.nextInt();
			switch(choice) {
				case 0: System.out.println("Execution ends here..");
						break;
				case 1:	System.out.println("Enter the data to be pushed:");
						int data = in.nextInt();
						push(data);
						break;
				case 2:	pop();
						break;
				case 3:	print();
						break;
			}
		} while(choice!=0);
//		System.out.println("\nAfter Reversal:");
//		reverse();
//		print();
	}
}