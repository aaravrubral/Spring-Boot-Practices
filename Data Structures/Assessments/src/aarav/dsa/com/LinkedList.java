package aarav.dsa.com;

public class LinkedList {

	public class Node{
		int element;
		Node next;
		
		public Node(int e, Node n) {
			element=e;
			next=n;
		}
	}
	
	private Node head;
	private Node tail;
	private int size;
	
	public LinkedList() {
		head=null;
		tail=null;
		size=0;
	}
	
	public int length() {
		return size;
	}
	
	public boolean isEmpty() {
		return size==0;
	}
	
	public void addLast(int e) {
		Node newest=new Node(e,null);
		
		if(isEmpty()) {
			head=newest;
		}else {
			tail.next=newest;
		}
		tail=newest;
		size=size+1;
	}
	
	public void addFirst(int e) {
		Node newest=new Node(e,null);
		
		if(isEmpty()) {
			head=newest;
			tail=newest;
		}else {
			newest.next=head;
			head=newest;
		}
		
		size=size+1;
	}
	
	public void addAny(int e, int pos) {
		
		if(pos<=0 || pos >=size) {
			System.out.println("Invalid Position");
			return;
		}
		
		Node newest = new Node(e,null);
		Node p=head;
		int i=1;
		
		while(i<pos-1) {
			p=p.next;
			i=i+1;
		}
		newest.next=p.next;
		p.next=newest;
		
		size=size+1;
	}
	
	public int removeFirst() {
		
		if(isEmpty()) {
			System.out.println("LinkedList is Empty");
			return -1; 
		}
		int temp=head.element;
		head=head.next;
		
		size=size-1;
		
		if(isEmpty())
			tail=null;
		
		return temp;
		
	}
	
	public int removeLast() {
		
		if(isEmpty()) {
			System.out.println("LinkedList Is Empty");
			return -1;
		}
		int temp=tail.element;
		Node p=head;
		int i=1;
		
		while(i < size-1) {
			p=p.next;
			i=i+1;
		}
		
		p.next=null;
		tail=p;
		size=size-1;
		
		return temp;
	}
	
	public int removeAny(int pos) {
		
		if(pos<=0 || pos>=size-1) {
			System.out.println("Invalid Position");
			return -1;
		}
		
		Node p=head;
		int i=1;
		
		while(i< pos-1) {
			p=p.next;
			i=i+1;
		}
		int temp=p.next.element;
		p.next=p.next.next;
		
		size=size-1;
		
		return temp;
	}
	
	public boolean isPalindrome(LinkedList list) {
		
		
		
		
		return false;
	}
	public void display() {
		Node p=head;
		
		while(p!=null) {
			System.out.print(p.element+"-->");
			p=p.next;
		}
	}
	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		
		list.addLast(1);
		list.addLast(2);
		list.addLast(3);
		list.addLast(2);
		list.addLast(1);
		
		
		//list.addFirst(0);
	//	list.addAny(-40, 4);
	//	System.out.println(list.length());
	//	list.removeFirst();
	//	list.removeLast();
		System.out.println(list.removeAny(3));
		
		list.display();
	}

}
