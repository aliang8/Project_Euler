import java.util.*; 
import java.io.*;

class pythTriplet {  
    public static long pythTriplet() { 
	/*A Pythagorean triplet is a set of three natural numbers, a < b < c, 
	  for which, a2 + b2 = c2 For example, 32 + 42 = 9 + 16 = 25 = 52.There
	  exists exactly one Pythagorean triplet for which a + b + c = 1000.
	  Find the product abc.*/
	//Brute force approach :/
	long ans = 0;
       	for(long a = 1; a < 500; a++){
	    for(long b = 1; b < 500; b++){
		for (long c = 1; c < 500; c++){
		    if ((long)Math.pow(a,2) + (long)Math.pow(b,2) == (long)Math.pow(c,2) && (a + b + c) == 1000){
			ans = a*b*c;
		    }
		}
	    }
	}
	return ans;
    } 
  
    public static void main (String[] args) { 
	System.out.println(pythTriplet());
    }   
}

