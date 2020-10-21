/*
Maximum occured integer :
-------------------------
Given N integer ranges, the task is to find the maximum occurring integer in these ranges.
If more than one such integer exits, find the smallest one. The ranges are given as two arrays L[] and R[].  
L[i] consists of starting point of range and R[i] consists of corresponding end point of the range.

For example consider the following ranges.
L[] = {2, 1, 3}, R[] = {5, 3, 9)
Ranges represented by above arrays are.
[2, 5] = {2, 3, 4, 5}
[1, 3] = {1, 2, 3}
[3, 9] = {3, 4, 5, 6, 7, 8, 9}
The maximum occurred integer in these ranges is 3.

Example 1:

Input:
N = 4
L[] = {1,4,3,1}
R[] = {15,8,5,4}

Output: 4

Explanation: The given ranges are [1,15]
 [4, 8] [3, 5] [1, 4]. The number that 
is most common or appears most times in 
the ranges is 4.
*/
import java.io.*;
import java.util.*;
import java.lang.*;

class MaxOccur{    
    public static int maxOccured(int L[], int R[], int n, int maxx){
        
        int arr[]=new int[1000000];
        int maxi=0;
        for(int i=0;i<n;i++){
            arr[L[i]]++;
            arr[R[i]+1]--;
            if(R[i]>maxi)
                maxi=R[i];
        }
        int max=arr[0];
        maxx=0;
        for(int i=1;i<maxi;i++){
            arr[i]+=arr[i-1];
            if(arr[i]>max){
                max=arr[i];
                maxx=i;
            }
        }
        return maxx;
    }
    
}
class ArrayOccur {

    	public static void main (String[] args) throws IOException{
    	    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    
		    int n = Integer.parseInt(br.readLine().trim());
		    int L[] = new int[n];
		    int R[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		  
		    for(int i=0; i<n; i++){
		        L[i]=Integer.parseInt(inputLine[i]);
		    }
		    inputLine = br.readLine().trim().split(" ");
		    int maxx = Integer.MIN_VALUE;
		   
		    for(int i=0; i<n; i++){
		        R[i]=Integer.parseInt(inputLine[i]);
		        if(R[i] > maxx){
		            maxx=R[i];
		        }
		    }
		    
		    MaxOccur obj = new MaxOccur();
		    System.out.println(obj.maxOccured(L, R, n, maxx));
		}
	}
	
}
// } Driver Code Ends
