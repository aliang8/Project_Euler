import java.util.*; 
import java.io.*;

class evenFib{  
    public static long evenFib() { 
	/*Each new term in the Fibonacci sequence is generated
	  by adding the previous two terms. By starting with 1
	  and 2, the first 10 terms will be: 1, 2, 3, 5, 8, 13,
	  21, 34, 55, 89, ... By considering the terms in the
	  Fibonacci sequence whose values do not exceed four million,
	  find the sum of the even-valued terms.*/
       	long ans = 0;
	int[] fibs = new int[34];
	fibs[0] = 0;
	fibs[1] = 1;
	for(int i = 2; i < fibs.length; i++){
	    fibs[i] = fibs[i-1] + fibs[i-2];
	}
	for(int i = 0; i < fibs.length; i++){
	    if(fibs[i] % 2 == 0){
		ans += fibs[i];
	    }
	}
	return ans;
    } 
  
    public static void main (String[] args) { 
	System.out.println(evenFib());
    }   
}

