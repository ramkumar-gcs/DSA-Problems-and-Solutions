/*
Wave Array :
------------
Given a sorted array arr[] of distinct integers. 
Sort the array into a wave-like array and return it. 
In other words, arrange the elements into a sequence such that a1 >= a2 <= a3 >= a4 <= a5.....
(considering the increasing lexicographical order).

Example 1:

Input:
N = 5
arr[] = {1,2,3,4,5}

Output: 2 1 4 3 5
Explanation: Array elements after 
sorting it in wave form are 
2 1 4 3 5.
*/
import java.io.*;
import java.util.*;
class Wave{
	
	public static void convertToWave(int arr[], int n){
         for(int i=0;i<n;i+=2){
            
            if(i==n-1)  break;
            
            int t=arr[i+1];
            arr[i+1]=arr[i];
            arr[i]=t;
            
        }   
    }
}

// { Driver Code Starts
class ArrayWave {
    
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
		    
		    Wave obj = new Wave();
		    
		    
		    obj.convertToWave(arr, n);
		    
		    StringBuffer sb = new StringBuffer(); 
            for (int i = 0; i < n; i++) 
                sb.append(arr[i] + " "); 
                
		    System.out.println(sb); 
		}
	}
}
// } Driver Code Ends

