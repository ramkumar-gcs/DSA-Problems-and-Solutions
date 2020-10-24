/*
Trapping Rain Water :
---------------------
Given an array arr[] of N non-negative integers representing the height of blocks at
index i as Ai where the width of each block is 1. Compute how much water can be trapped
in between blocks after raining.

Example 1:

Input:
N = 4
arr[] = {7,4,0,9}

Output: 10

Explanation: Water trapped by the 
block of height 4 is 3 units, block 
of height 0 is 7 units. So, the 
total unit of water trapped is 
10 units.
*/
import java.io.*;
import java.util.*;
import java.lang.*;

class Trap{
   
    static int trappingWater(int arr[], int n) { 
        
    int result = 0; 
 
    int left_max = 0, right_max = 0; 
  
    int lo = 0, hi = n - 1; 
  
    while (lo <= hi) { 
        if (arr[lo] < arr[hi]) { 
            if (arr[lo] > left_max) 
                left_max = arr[lo]; 
            else
                result += left_max - arr[lo]; 
            lo++; 
        } 
        else { 
            if (arr[hi] > right_max) 
                right_max = arr[hi]; 
            else
                result += right_max - arr[hi]; 
            hi--; 
        } 
    } 
  
    return result;
        
    } 
}
// { Driver Code Starts
class Array {

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); 
        while(t-->0){
          
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            
            Trap obj = new Trap();
            
            System.out.println(obj.trappingWater(arr, n));
        }
    }
}
// } Driver Code Ends

