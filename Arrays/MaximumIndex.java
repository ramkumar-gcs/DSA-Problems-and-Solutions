/*
Maximum Index :
---------------
Given an array A[] of N positive integers. The task is to find the maximum of j - i subjected to the constraint of A[i] <= A[j].

Example 1:

Input:
N = 9
A[] = {34,8,10,3,2,80,30,33,1}

Output: 6

Explanation: In the given array 
A[1] < A[7] satisfying the required 
condition(A[i] <= A[j]) thus giving 
the maximum difference of j - i 
which is 6(7-1).
*/
import java.io.*;
import java.util.*;
class MaxDifference{
    
    static int maxIndexDiff(int arr[], int n) { 
    
        int L[]=new int[n];
        int R[]=new int[n];
        L[0]=arr[0];
        R[n-1]=arr[n-1];
        
        for(int i=1;i<n;i++){
            L[i]=Math.min(arr[i],L[i-1]);
        }
        for(int i=n-2;i>=0;i--){
            R[i]=Math.max(arr[i],R[i+1]);
        }
        
        int i=0,j=0,max_ind=-1;
        while(j<n && i<n){
            if(L[i]<=R[j]){
                max_ind=Math.max(max_ind,j-i);
                j++;
            }
            else{
                i++;
            }
        }
        return max_ind;
    }
}
// { Driver Code Starts
class Difference {
    
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
		    
		    MaxDifference obj = new MaxDifference();
		    
		    System.out.println(obj.maxIndexDiff(arr, n));
		}
	}
}
// } Driver Code Ends
