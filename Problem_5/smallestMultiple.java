import java.util.*; 
import java.io.*;

class smallestMultiple {  
    public static long smallestMultiple() { 
	/*2520 is the smallest number that can be divided by 
	  each of the numbers from 1 to 10 without any remainder. 
	  What is the smallest positive number that is evenly
	  divisible by all of the numbers from 1 to 20?*/
       	long ans = 1;
	int counter = 1;
	while(counter <= 20){
	    ans = lcm(ans,counter);
	    counter++;
	    System.out.println(ans);
	}
	return ans;
    } 
    private static long lcm(long a, long b) {
	long gcd = gcd(a,b);
	return ((long)a*b)/(gcd);
    }
    private static long gcd(long a, long b){
        if (a == 0){
            return b;
        } else if (b == 0){
            return a;
        } else {
            return gcd (b, a % b);
        }
    }
	    
  
    public static void main (String[] args) { 
	System.out.println(smallestMultiple());
    }   
}

