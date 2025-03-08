package aarav.dsa.com;

public class TestCase {

	public  void m1(int a) {
		System.out.println(a);
	}
	public  int m1(int a,long b) {
		System.out.println(a +" "+ b);
		return 1;
	}
	
	public long m1(long a,int b) {
		System.out.println(a +" "+ b);
		return 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestCase c1=new TestCase();
		c1.m1(5);
		c1.m1(2,3);

	}

}
