/*
Minimum adjacent difference in a circular array :
-------------------------------------------------
Given an array Arr of N integers arranged in a circular fashion. 
Your task is to find the minimum absolute difference between adjacent elements.

Example 1:

Input:
N = 7
Arr[] = {8,-8,9,-9,10,-11,12}

Output: 4

Explanation: The absolute difference 
between adjacent elements in the given 
array are as such: 16 17 18  19 21 23 4
(first and last). Among the calculated 
absolute difference the minimum is 4.
*/
import java.io.*;
import java.util.*;
import java.lang.*;

class Difference{
    
    public static int minAdjDiff(int arr[], int n) {
        
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            
            int j=i+1;
            if(i==n-1) j=0;
            if(Math.abs(arr[i]-arr[j])<min){
                min=Math.abs(arr[i]-arr[j]);
            }
        }
        return min;
    }
}

// { Driver Code Starts.
class GFG {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); 
		
		while(t-->0)
		{
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    
		    String inputLine[] = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        arr[i]=Integer.parseInt(inputLine[i]);
		    }
		    
		    Difference obj = new Difference();
		    
		    System.out.println(obj.minAdjDiff(arr, n));
		}
	}
}
// } Driver Code Ends