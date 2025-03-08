package aarav.dsa.com;

public class ReverseStringWithCond {

	public static void main(String[] args) {
		String str="ab,cd$e";
		
		reversed(str);
		System.out.println(reversed(str));

	}
	
	public static String reversed(String str) {
		char[] charArray=str.toCharArray();
		
		int left=0;
		int right=charArray.length-1;
		
		while(left<right) {
			if(!Character.isLetterOrDigit(charArray[left])) {
				left++;
			}else if(!Character.isLetterOrDigit(charArray[right])) {
				right--;
			}
			char temp=charArray[left];
			charArray[left]=charArray[right];
			charArray[right]=temp;
			left++;
			right--;
		}
		
		return new String(charArray);
	}

}
