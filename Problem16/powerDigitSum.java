import java.util.*; 
import java.io.*;
import java.math.BigInteger;

class powerDigitSum {  
    public static long powerDigitSum() { 
	/*215 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
	  What is the sum of the digits of the number 21000?*/
	long sum = 0;
	BigInteger num = new BigInteger("2");
	num = num.pow(1000);
	String str = num.toString();
	for(int i = 0; i < str.length();i++){
	    sum += Character.getNumericValue(str.charAt(i));
	}
       	return sum;   
    } 
  
    public static void main (String[] args) { 
	System.out.println(powerDigitSum());
    }   
}

