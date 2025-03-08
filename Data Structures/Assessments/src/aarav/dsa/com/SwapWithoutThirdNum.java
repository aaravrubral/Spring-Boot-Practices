package aarav.dsa.com;

import java.util.Scanner;

public class SwapWithoutThirdNum {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int x=scn.nextInt();
		int y=scn.nextInt();
		
		System.out.println("Before Swapping "+ x +" and " +y);
		
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println("After Swapping "+ x +" and " +y);
		System.out.println();
		
		x=x^y;
		y=x^y;
		x=x^y;
		System.out.println("Again After Swapping "+ x +" and " + y);
	}

}
