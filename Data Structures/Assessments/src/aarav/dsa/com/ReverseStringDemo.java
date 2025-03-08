package aarav.dsa.com;

import java.util.ArrayList;
import java.util.List;

public class ReverseStringDemo {

	public static void main(String[] args) {
		List<String> fruits = new ArrayList<>();
		fruits.add("mango");
		fruits.add("apple");
		fruits.add("Pomegranate");
		fruits.add("Banana");
		
		System.out.println(fruits);
		/* Method -1
		 * 
		 
		int left=0;
		int right=fruits.size()-1;
		
		while(left<right) {
			String temp=fruits.get(right);
			fruits.set(right, fruits.get(left));
			fruits.set(left, temp);
			left++;
			right--;
		} 
		*/
		
		/* Method-2
		 * 
		 * */
		
		List<String> revFruits=new ArrayList<>(fruits.size());
		for(int i=fruits.size()-1;i>=0;i--) {
			revFruits.add(fruits.get(i));
		}
		System.out.println(revFruits);
	}

}
