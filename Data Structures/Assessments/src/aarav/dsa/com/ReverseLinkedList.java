package aarav.dsa.com;

public class ReverseLinkedList {

	public class Node{
		int element;
		Node next;
		
		public Node(int e, Node n) {
			element=e;
			next=n;
		}
		
	}
	
	private Node tail;
	private Node head;
	private int size;
	
	public ReverseLinkedList(){
		tail=null;
		head=null;
		size=0;
	}
	
	public int length() {
		return size;
	}
	
	public boolean isEmpty() {
		return size==0;
	}
	public void addLast(int e) {
		Node newest = new Node(e,null);
		
		if(isEmpty()) {
			head=newest;
		}else 
			tail.next=newest;
			tail=newest;
		
		size=size+1;
	}
	
	public void display() {
		Node p=head;
		
		while(p != null) {
			System.out.print(p.element+"-->");
			p=p.next;
		}
	}
	
	public void reverseLinked() {
		Node p=null;
		Node curr=head;
		Node q=null;
		while(curr != null) {
			q=curr.next;
			curr.next=p;
			p=curr;
			curr=q;
			
		}
		tail=head;
		head=p;
	}
	public static void main(String[] args) {
		ReverseLinkedList  list = new ReverseLinkedList();
		list.addLast(10);
		list.addLast(20);
		list.addLast(30);
		list.addLast(40);
		list.addLast(50);
		
		list.display();
		System.out.println("After Reverse");
		list.reverseLinked();
		list.display();
	}

}
