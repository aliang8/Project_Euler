import java.util.*; 
import java.io.*;
import java.math.BigInteger;

class largeSum{  
  
    public static void main (String[] args) { 
	try (BufferedReader br = new BufferedReader(new FileReader("number.txt")))
		{
		    String line;
		    BigInteger sum = new BigInteger("0");
		    while((line = br.readLine()) != null){
			BigInteger number = new BigInteger(line);
			sum = sum.add(number);
		    }
		    String ret = sum.toString(); 
		    System.out.println(ret.substring(0,10));
		} catch (IOException e) {
	    e.printStackTrace();
	} 
    }   
}

