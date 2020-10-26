/*
Max SubArray Sum (Kadane's Algorithm) :
---------------------------------------
Given an array arr of N integers. Find the contiguous sub-array with maximum sum.

Example 1:

Input:
N = 5
arr[] = {1,2,3,-2,5}

Output: 9

Explanation: Max subarray sum is 9
of elements (1, 2, 3, -2, 5) which 
is a contiguous subarray.
*/
import java.io.*;
class Kadane{
    
    int maxSubarraySum(int arr[], int n){
        
        int max=0;
        int tmp_max=0;
        for(int i=0;i<n;i++){
            tmp_max+=arr[i];
            if(tmp_max>max)
                max=tmp_max;
            if(tmp_max<0)
                tmp_max=0;
        }
        return max;
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
		    
		    Kadane obj = new Kadane();
		   
		    System.out.println(obj.maxSubarraySum(arr, n));
		}
	}
}

// } Driver Code Ends
