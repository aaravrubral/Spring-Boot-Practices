package aarav.dsa.com;

import java.util.Arrays;
import java.util.Stack;

public class Test {

	public static int[] nextGreaterElement(int[] nums) {
		int n=nums.length;
		int[] result=new int[n];
		Arrays.fill(result, -1);
		Stack<Integer> stack =new Stack<>();
		
		for(int i=0;i<2*n;i++) {
			int num= nums[i%n];
			while(!stack.isEmpty() && nums[stack.peek()]<num) {
				result[stack.pop()]=num;
			}
			if(i<n) {
				stack.push(i);
			}
		}
		return result;
	}
	public static void main(String[] args) {
	
		int[] arr= {7,12,1,20};
		int[] result=nextGreaterElement(arr);
		System.out.println(Arrays.toString(result));
     }
	}


