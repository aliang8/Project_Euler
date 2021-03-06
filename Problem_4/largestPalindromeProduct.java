import java.util.*; 
import java.io.*;

class largestPalindromeProduct{  
    public static int largPalindromeProduct() { 
	int ans = 0;
	for (int i = 100; i < 1000; i++){
	    for (int j = 100; j < 1000; j++){
		if (isPalindrome(i*j) && i*j > ans){
		    ans = i * j;
		}
	    }
	}
	return ans;
    }
    public static boolean isPalindrome(int num){
	String palindrome = Integer.toString(num);
	boolean isPalindrome = true;
	for(int i = 0; i < palindrome.length()/2; i++){
	    if (!(palindrome.charAt(i) == palindrome.charAt(palindrome.length()-1-i))){
		return false;
	    }
	}
	return isPalindrome;
    }
  
    public static void main (String[] args) { 
	System.out.println(largPalindromeProduct());
    }   
}

