/*
Leaders in an array :
---------------------
Given an array A of positive integers. Your task is to find the leaders in the array.

Note: An element of array is leader if it is greater than or equal to all the elements to its right side.Also, the rightmost element is always a leader. 

Example 1:

Input:
N = 6
A[] = {16,17,4,3,5,2}

Output: 17 5 2

Explanation: The first leader is 17 
as it is greater than all the elements 
to its right.  Similarly, the next 
leader is 5. The right most element 
is always a leader so it is also 
included.
*/
import java.io.*;
import java.util.*;

class Leader{
    
    static ArrayList<Integer> leaders(int arr[], int n){
        
     ArrayList<Integer> l=new ArrayList<Integer>();
     int max=arr[n-1];
     l.add(arr[n-1]);
     for(int i=n-2;i>=0;i--){
         if(arr[i]>=max){
            l.add(arr[i]);
            max=arr[i];
         }
     }
     Collections.reverse(l);
     return l;
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
		    
		    Leader obj = new Leader();
		    
		    StringBuffer str = new StringBuffer();
		    ArrayList<Integer> res = new ArrayList<Integer>();
		  
		    res = obj.leaders(arr, n);
		    
		    for(int i=0; i<res.size(); i++){
		        str.append(res.get(i)+" ");
		    }
		    
		    System.out.println(str);
		}
		
	}
}
// } Driver Code Ends

