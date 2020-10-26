/*
Longest Subarray Of Evens And Odds :
------------------------------------
You are given an array of size n. Find the maximum possible length of a subarray such 
that its elements are arranged alternately either as even and odd or odd and even .

Example 1:

Input:
n = 5
a[] = {10,12,14,7,8}

Output: 3

Explanation: The max length of subarray
is 3 and the subarray is {14 7 8}. Here 
the array starts as an even element and 
has odd and even elements alternately.
*/
import java.util.*;
import java.io.*;
import java.lang.*;

class LongSubOfEvenOdd
{
    public static int maxEvenOdd(int arr[], int n)
    {
        int max=1;
        int tmax=1;
        
        for(int i=1;i<n;i++)
        {
            if(arr[i]%2==0 && arr[i-1]%2!=0 || arr[i]%2!=0 && arr[i-1]%2==0)
            {
                tmax++;
                max=Math.max(tmax,max);
            }
            else
                tmax=1;
            
        }
    return max;

   }
}
// { Driver Code Starts
class Driver
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine());
            String str[] = read.readLine().trim().split(" ");
            int arr[] = new int[n];
            for(int i = 0; i < n; i++)
                arr[i] = Integer.parseInt(str[i]);
           System.out.println(new LongSubOfEvenOdd().maxEvenOdd(arr, n));
            
        }
    }
}
// } Driver Code Ends
