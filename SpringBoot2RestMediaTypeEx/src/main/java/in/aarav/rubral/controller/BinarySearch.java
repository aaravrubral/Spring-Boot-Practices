package in.aarav.rubral.controller;

public class BinarySearch {

	public static void main(String[] args) {
		int[] array= {2,3,4,10,40};
		int target=10;
		int result=binarySearch(array,target);
		
		if(result==-1) {
			System.out.println("Element not found");
		}else {
			System.out.println("Element found at index: "+ result);
		}

	}
	public static int binarySearch(int[] array, int target) {
		int left=0;
		int right=array.length-1;
		
		while(left<=right) {
			int middle=left+(right-left)/2;
			
			if(array[middle]==target) {
				return middle;
			}
			if(array[middle]<target) {
				left=middle+1;
			}else {
				right=middle-1;
			}
		}
		return -1;
		}

}
