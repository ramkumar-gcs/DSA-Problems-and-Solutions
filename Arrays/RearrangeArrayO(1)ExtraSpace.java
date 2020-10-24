/*
Rearrange an array with O(1) extra space :
------------------------------------------
Given an array arr[] of size N where every element is in the range from 0 to n-1. Rearrange the given array so that arr[i] becomes arr[arr[i]].

Example 1:

Input:
N = 2
arr[] = {1,0}

Output: 0 1

Explanation: arr[0] = 1 and arr[arr[0]]
= 0.Also, arr[1] = 0 and arr[arr[1]] = 1.
So, rearranging elements, we get array 
as, 0 1.
*/
import java.util.*;
import java.io.*;
import java.lang.*;

class rearrange
{
    static void arrange(long arr[], int n)
    {
        HashMap<Long,Long> map=new HashMap<>();
        
        for(int i=0;i<n;i++)
            map.put(arr[i],arr[(int)arr[i]]);
        
        for(int i=0;i<n;i++)
            arr[i]=map.get(arr[i]);
        
    }
}
// { Driver Code Starts
class Solution
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t =Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine());
            String st[] = read.readLine().trim().split("\\s+");
            long arr[] = new long[(int)n];
            
            for(int i = 0; i < n; i++)
                arr[(int)i]  =Integer.parseInt(st[(int)i]);
        
           new rearrange().arrange(arr, n);
          
           for(int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
            System.out.println();
        }
    }
}// } Driver Code Ends
