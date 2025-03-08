package aarav.dsa.com;

import java.util.HashSet;

public class FindDuplicates {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 2, 7, 8, 4};
		
		HashSet<Integer> list = new HashSet<>();
		
		for(int i=0;i<arr.length;i++) {
			if(! list.add(arr[i])) {
				System.out.println(arr[i]);
			}
		}
	}

}
