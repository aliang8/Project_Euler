import java.util.*; 
import java.io.*;

class sumSquareDifference {  
    public static double sumSquareDifference() { 
	/*The sum of the squares of the first ten natural numbers is, 12 + 22
	  + ... + 102 = 385 The square of the sum of the first ten natural 
	  numbers is,(1 + 2 + ... + 10)2 = 552 = 3025 Hence the difference
	  between the sum of the squares of the first ten natural numbers and
	  the square of the sum is 3025 − 385 = 2640. Find the difference
	  between the sum of the squares of the first one hundred natural
	  numbers and the square of the sum.*/
	double sumSquare = 0;
	double sumThenSquare = 0;
	for (int i = 0; i <= 100; i++){
	    sumSquare += Math.pow(i,2);
	    sumThenSquare += i;
	}
	System.out.println(sumSquare);
	System.out.println(Math.pow(sumThenSquare,2));
	return Math.pow(sumThenSquare,2) - sumSquare;
    } 
  
    public static void main (String[] args) { 
	System.out.println(sumSquareDifference());
    }   
}

