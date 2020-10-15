/*
Max and Second Max :
-------------------
Given an array arr[] of size N of positive integers which may have duplicates. 
The task is to find the maximum and second maximum from the array, and both of 
them should be distinct, so If no second max exists, then the second max will be -1.

Example 1:

Input:
N = 3
arr[] = {2,1,2}

Output: 2 1

Explanation: From the given array 
elements, 2 is the largest and 1 
is the second largest.
*/

import java.io.*;
import java.util.*;
class ArrayMax{
    
    public static ArrayList<Integer> largestAndSecondLargest(int sizeOfArray, int arr[])
    {
        int first =arr[0];
        int second = -1;
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=1;i<sizeOfArray;i++){
            if(arr[i] > first){
                second = first;
                first = arr[i];
            }
            else if(arr[i] > second && arr[i] < first){
                second = arr[i];
            }
        }     
        l.add(first);
        l.add(second);
        return l;
    }
}

// { Driver Code Starts.

class Array {
    
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
		    
		    ArrayMax obj = new ArrayMax();
		    ArrayList<Integer> res = new ArrayList<Integer>();
		    res = obj.largestAndSecondLargest(sizeOfArray, arr);
		    System.out.println(res.get(0) + " " + res.get(1) );
		}
	}
} 