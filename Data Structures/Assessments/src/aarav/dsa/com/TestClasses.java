package aarav.dsa.com;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class TestClasses {

	public static void main(String[] args) {
		Integer[] arr1= {1,2,4,7,8};
		Integer[] arr2= {1,8,2,6};
		
		Set<Integer> set=Arrays.stream(arr2).collect(Collectors.toSet());
		List<Integer> intersection=Arrays.stream(arr1).filter(set:: contains)
				                                     .collect(Collectors.toList());
		
		Integer[] interArray=intersection.toArray(new Integer[0]);
		
		System.out.println(Arrays.toString(interArray));
		
				                                      
		

	}

}
