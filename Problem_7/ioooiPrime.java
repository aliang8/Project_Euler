import java.util.*; 
import java.io.*;

class ioooiPrime{  
    public static long ioooiPrime() { 
	/*By listing the first six prime numbers: 2, 3, 5, 7, 11, and
	  13, we can see that the 6th prime is 13. What is the 10001st
	  prime number?*/
	long numPrime = 0;
      	long ioooiPrime = 0;
	if(numPrime <= 10001){
	    for(int i = 1;;i++){
		if(isPrime(i) == true && numPrime <= 10001){
		    numPrime++;
		}
	    }
	} else {
	    return ioooiPrime;
	}
    }
    public static boolean isPrime(long num){
	boolean isPrime = true;
	if(num == 1){
	    isPrime = false;
	}
	for (int i = 2; i <= (long)Math.sqrt(num); i++){
	    if (num % i == 0){
		isPrime = false;
	    }
	}
	return isPrime;
    } 

    public static void main (String[] args) { 
	System.out.println(ioooiPrime());
    }   
}

