import java.util.*; 
import java.io.*;

class numberLetterCounts {  
    public static long numberLetterCounts() { 
	/*If the numbers 1 to 5 are written out in words: one, two, three, 
	  four, five, then there are 3 + 3 + 5 + 4 + 4 = 19 letters used 
	  in total.

	  If all the numbers from 1 to 1000 (one thousand) inclusive were
	  written out in words, how many letters would be used?

	  NOTE: Do not count spaces or hyphens. For example, 342 (three 
	  hundred and forty-two) contains 23 letters and 115 (one hundred 
	  and fifteen) contains 20 letters. The use of "and" when writing 
	  out numbers is in compliance with British usage.*/
       	long sum = 0;
	for(int i = 1; i <= 1000; i++){
	    sum += countLetters(i);
	}
	return sum;
    } 
   
    public static long countLetters(int num){
	long numLetters = 0;
	String input = Integer.toString(num);
	if(num == 1000){
	    numLetters = 11;
	}
	if(input.length() == 3){
	    numLetters += singleDigits(input.substring(0,1));
	    numLetters += 7;
	    if(!(input.substring(1,2).equals("0")) 
	       || !(input.substring(2).equals("0"))){
		numLetters += 3;
	    }
	    if(input.substring(1,2).equals("1")){
		numLetters += tens(input.substring(2));
	    } else {
		numLetters += doubleDigits(input.substring(1,2));
	    }
	    if(!(input.substring(2).equals("0")) 
	       && !(input.substring(1,2).equals("1"))){
		numLetters += singleDigits(input.substring(2));
	    }
	}
	if(input.length() == 2){
	    if(input.substring(0,1).equals("1")){
                numLetters += tens(input.substring(1));
            } else {
                numLetters += doubleDigits(input.substring(0,1));
            }
            if(!(input.substring(1).equals("0"))
               && !(input.substring(0,1).equals("1"))){
                numLetters += singleDigits(input.substring(1));
            }
	}
	if(input.length() == 1){
	    numLetters += singleDigits(input);
	}
	return numLetters;
    }

    public static long singleDigits(String digit){
	String threeLetters = "126";
	String fourLetters = "459";
	String fiveLetters = "378"; 
	if(digit.equals("0")){
	    return 0;
	}else if (threeLetters.contains(digit)){
	    return 3;
	} else if (fourLetters.contains(digit)){
	    return 4;
	} else {
	    return 5;
	}
    }
    
    public static long doubleDigits(String digit){
	String fiveLetters = "569";
	String sixLetters = "2348";
	if(digit.equals("0")){
	    return 0;
	} else if (fiveLetters.contains(digit)){
	    return 5;
	} else if (sixLetters.contains(digit)){
	    return 6;
	} else {
	    return 7;
	}
    }

    public static long tens(String digit){
	String sixLetters = "12";
	String sevenLetters = "569";
	String eightLetters = "38";
	String nineLetters = "47";
	if(digit.equals("0")){
	    return 3;
	} else if(sixLetters.contains(digit)){
	    return 6;
	} else if (sevenLetters.contains(digit)){
	    return 7;
	} else if (eightLetters.contains(digit)){
	    return 8;
	} else {
	    return 9;
	}
    }

    public static void main (String[] args) { 
	System.out.println(numberLetterCounts());
	System.out.println(countLetters(11));
	System.out.println(countLetters(9));
	System.out.println(tens("1"));
	System.out.println(countLetters(100));
	System.out.println(countLetters(200));
	System.out.println(countLetters(101));
    }   
}

