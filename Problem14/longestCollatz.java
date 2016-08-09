import java.util.*; 
import java.io.*;

class longestCollatz {  
    public static long longestCollatz() { 
	/*The following iterative sequence is defined for the set of 
	  positive integers:
	  n → n/2 (n is even)
	  n → 3n + 1 (n is odd)
	  Using the rule above and starting with 13, we generate the
	  following sequence: 13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
	  It can be seen that this sequence (starting at 13 and finishing 
	  at 1) contains 10 terms. Although it has not been proved yet
	  (Collatz Problem), it is thought that all starting numbers finish
	  at 1. Which starting number, under one million, produces the
	  longest chain?
	  NOTE: Once the chain starts the terms are allowed to go above 
	  one million.*/
	long largestChain = 0;
	long startNum = 0;
       	for (int i = 1; i < 1000000; i++){
	    long chain = findChainLength(i);
	    System.out.println(i + " " + chain);
	    if (chain > largestChain){
		largestChain = chain;
		startNum = i;
	    }
	}
	return startNum;
    }
    
    public static long findChainLength(long number){
	long chainLength = 1;
	while(number != 1){
	    if(number % 2 == 0){
		number = number / 2;
		chainLength++;
	    } else{
		number = 3 * number + 1;
		chainLength++;
	    }
	}
	return chainLength;
    }
  
	
    public static void main (String[] args) { 
	System.out.println(longestCollatz());
	System.out.println(findChainLength(837799));
    }   
}

