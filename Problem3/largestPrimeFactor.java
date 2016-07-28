import java.util.*; 
import java.io.*;

class largestPrimeFactor{  
    public static double largPrimeFactor() { 
	/*The prime factors of 13195 are 5, 7, 13 and 29. What
	  is the largest prime factor of the number 600851475143 ?*/
	double num = 600851475143.0;
	double ans = 0;
	for (int i = 1; i <= (int) Math.sqrt(num); i++){
	    if(num % i ==0 && isPrime(i) == true){
		ans = i;
	    }
	}
	return ans;
    
    } 
    public static boolean isPrime(int num){
	boolean isPrime = true;
	for (int i = 2; i <= (int)Math.sqrt(num); i++){
	    if (num % i == 0){
		isPrime = false;
	    }
	}
	return isPrime;
    }
    public static void main (String[] args) { 
	System.out.println(largPrimeFactor());
    }   
}

