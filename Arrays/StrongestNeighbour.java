/*
Strongest Neighbour: 
-------------------
Given an array arr[] of N positive integers.
The task is to find the maximum for every adjacent pairs in the array.

Example 1:

Input:
N = 6
arr[] = {1,2,2,3,4,5}

Output: 2 2 3 4 5
Explanation: Maximum of arr[0] and arr[1]
is 2, that of arr[1] and arr[2] is 2, ...
and so on. For last two elements, maximum 
is 5.
*/
import java.io.*;
import java.util.*;

class StrongestNeighbour{
    
    static void maximumAdjacent(int sizeOfArray, int arr[]){
        
       
         for(int i=0;i<sizeOfArray-1;i++){
             
             if(arr[i]>arr[i+1]){
                 System.out.print(arr[i]+" ");
             }
             else{
                 System.out.print(arr[i+1]+" ");
             }
         }
        
    }
}

// { Driver Code Starts.

// Driver class
class Array {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		while(testcases-- > 0){
		    int sizeOfArray = Integer.parseInt(br.readLine());
		    
		    int arr[] = new int[sizeOfArray];
		    
		    String line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    
		    for(int index = 0;index < sizeOfArray; index++){
		        arr[index] = Integer.parseInt(elements[index]);
		    }
		    
		    StrongestNeighbour obj = new StrongestNeighbour();
		    obj.maximumAdjacent(sizeOfArray, arr);
		    
		    System.out.println();
		}
	}
}
// } Driver Code Ends