/*
Rearrange Array Alternately :
-----------------------------
Given a sorted array of positive integers. Your task is to rearrange  the array elements alternatively 
i.e first element should be max value, second should be min value, third should be second max, 
fourth should be second min and so on.

Example 1:

Input:
N = 6
arr[] = {1,2,3,4,5,6}

Output: 6 1 5 2 4 3

Explanation: Max element = 6, min = 1, 
second max = 5, second min = 2, and 
so on... Modified array is : 6 1 5 2 4 3.
*/
import java.util.*;
import java.lang.*;
import java.io.*;
class RearrangeAlternate{
  
    public static void rearrange(int arr[], int n){
            int temp[] = new int[n];
            int l=0;
            int r=n-1;
            boolean flag=true;
            for(int i=0;i<n;i++){
                if(flag)
                    temp[i]=arr[r--];
                else
                    temp[i]=arr[l++];
                    
                flag=!flag;
            }
            for(int i=0;i<n;i++){
                arr[i]=temp[i];
            }
            
    }
    
}
// { Driver Code Starts
class Rearrange {
	public static void main (String[] args)throws IOException
	{

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        
        int t = Integer.parseInt(read.readLine());
		
		while(t-- >0)
		{
		    int n = Integer.parseInt(read.readLine());
		    int[] temp= new int[n];
		    
		    String str[] = read.readLine().trim().split(" ");
		   
		    for(int i=0;i<n;i++)
		        temp[i] = Integer.parseInt(str[i]);
		    
		    RearrangeAlternate obj = new RearrangeAlternate();
		  
		    obj.rearrange(temp, n);
		    StringBuffer sb = new StringBuffer();
		
		    for(int i =0; i < n; i++)
		     sb.append(temp[i] + " ");
		    System.out.println(sb);
		}
	}
}
// } Driver Code Ends
