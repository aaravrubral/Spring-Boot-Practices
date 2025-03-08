package aarav.dsa.com;

public class ReverseString {

	public static void main(String[] args) {
		/*
		 * Using StringBuffer
		 * 
		StringBuilder str=new StringBuilder("abcdef");
		str=str.reverse();
		String rev=new String(str);

		System.out.println(rev);
		*/
		
		/*Using char Arrays
		 * 
		 * String str="abcdef";
		char[] charArray=str.toCharArray();
		int left=0;
		int right=charArray.length-1;
		while(left<right) {
			char temp=charArray[left];
			charArray[left]=charArray[right];
			charArray[right]=temp;
			left++;
			right--;
		}
		String rev=new String(charArray);
		System.out.println(rev);
		*/
		
		/* Using Recursion 
		String str = "Hello, World!";
        String reversed = reverseString(str);
        System.out.println("Using recursion: " + reversed);
    }
    
    public static String reverseString(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return reverseString(str.substring(1)) + str.charAt(0);
    
    */
	}
		
}
