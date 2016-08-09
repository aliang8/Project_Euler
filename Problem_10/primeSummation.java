import java.util.*; 
import java.io.*;

class primeSummation{  
    public static long primeSummation() { 
	/*The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17. Find the sum of
	  all the primes below two million.*/
	//  	return ans;
	long ans = 0;
	for (long i = 1; i <= 2000000; i++){
	    if (isPrime(i)){
		ans += i;
	    }
	}
	return ans;
    } 
    public static boolean isPrime(long num){
	boolean isPrime = true;
	if (num == 1){
	    return false;
	}
	for(long i = 2; i <= Math.sqrt(num); i++){
	    if (num % i == 0){
		isPrime = false;
	    }
	}
	return isPrime;
    }
  
    public static void main (String[] args) { 
	System.out.println(primeSummation());
    }   
}

