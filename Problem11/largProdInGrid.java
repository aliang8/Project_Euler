import java.util.*; 
import java.io.*;

class largProdInGrid{  
    public static long largProdInGrid(int[][] grid) { 
	/*The product of these numbers is 26 × 63 × 78 × 14 = 1788696.
	  What is the greatest product of four adjacent numbers in the
	  same direction (up, down, left, right, or diagonally) in the
	  20×20 grid? */
       	long maxProd = 1;
	//MaxProd horizontally
	for(int[] row : grid){
	    for(int i = 0; i < 17; i++){
		long prod = row[i] * row[i+1] * row[i+2] * row[i+3];
		if(prod > maxProd){
		    maxProd = prod;
		}
	    }
	}
	//MaxProd vertically
	for(int i = 0; i < grid[0].length-3; i++){
	    for(int j = 0; j < grid.length; j++){
		long prod = grid[i][j] * grid[i+1][j] * grid[i+2][j] * grid[i+3][j];
		if(prod > maxProd){
		    maxProd = prod;
		}
	    }
	}
	//MaxProd diagonally
	for(int k = 3 ; k < grid.length ; k++ ) {
	    for(int j = 0 ; j <= k ; j++ ) {
		for(int i = k - j; i >= 0; i--){
		    if(i-3 >= 0 && j+3 < 20){
			long prod = grid[i][j] * grid[i-1][j+1] * grid[i-2][j+2] * grid[i-3][j+3];
			if(prod > maxProd){
			    maxProd = prod;
			}
		    }
		}
	    }
	}
	for(int k = grid.length - 2 ; k >= 3 ; k-- ) {
	    for(int j = 0 ; j <= k ; j++ ) {
		for(int i = k - j; i < 20 ; i++){ 
		    if(grid.length - i + 2 < 20 && grid.length - j - 4 >= 0){
			long prod = grid[grid.length - j - 1][grid.length - i - 1] * grid[grid.length - j - 2][grid.length - i] * grid[grid.length - j - 3][grid.length - i + 1] * grid[grid.length - j - 4][grid.length - i + 2];
			if(prod > maxProd){
			    maxProd = prod;
			}
		    }
		}
	    }
	}
	return maxProd;
    } 
  
    public static void main (String[] args) { 
	try (BufferedReader br = new BufferedReader(new FileReader("grid.txt")))
		{
		    String line;
		    int counter = 0;
		    int[][] grid = new int[20][20];
		    while ((line = br.readLine()) != null && counter < 20) {
			String[] splitLine = line.split(" ");
			for(int i = 0; i < 20; i++){
			    grid[counter][i] = Integer.parseInt(splitLine[i]);
			}
			counter++;
		    }
		    System.out.println(largProdInGrid(grid));
		} catch (IOException e) {
	    e.printStackTrace();
	} 
    }   
}

