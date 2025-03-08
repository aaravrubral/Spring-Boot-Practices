package aarav.dsa.com;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListDemo {

	public static void main(String[] args) {
		
		//Creating a list of integers
		
		List<Integer> list=new ArrayList<>();
		list.add(11);
		list.add(2);
		list.add(2);
		list.add(4);
		list.add(5);
		list.add(2);
		list.add(5);
		list.add(11);
		list.add(69);
		list.add(76);
		Set<Integer> set=new HashSet<>(list);
		
		
		System.out.println(list);
		System.out.println(set);

	}

}
