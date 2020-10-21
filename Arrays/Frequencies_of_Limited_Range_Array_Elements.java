/*
Frequencies of Limited Range Array Elements :
---------------------------------------------
Easy Accuracy: 47.5% Submissions: 12546 Points: 2
Given an array A[] of N positive integers which can contain integers from 1 to N where elements 
can be repeated or can be absent from the array. Your task is to count the frequency of all elements 
from 1 to N.

Example 1:

Input:
N = 5
A[] = {2,3,2,3,5}

Output: 0 2 2 0 1

Explanation: 
Counting frequencies of each array element
We have:
1 occurring 0 times.
2 occurring 2 times.
3 occurring 2 times.
4 occurring 0 times.
5 occurring 1 time.
*/

import java.io.*;
import java.util.*;
class Frequency{
    public static void frequencycount(int arr[], int n)
    {
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++){
            
            if(map.containsKey(arr[i]))
                map.put(arr[i],map.get(arr[i])+1);
            else    
                map.put(arr[i],1);
        }
        for(int i=1;i<=n;i++){
            
            if(map.containsKey(i))
                arr[i-1]=map.get(i);
            else
                arr[i-1]=0;
        }
    }
}
// { Driver Code Starts
class GFG {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = Integer.parseInt(br.readLine().trim()); 
        while(t-->0){
            
            int n = Integer.parseInt(br.readLine().trim()); 
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");

            for(int i=0; i<n; i++){
                arr[i]=Integer.parseInt(inputLine[i]); 
            }
            
            Frequency obj = new Frequency();
            obj.frequencycount(arr, n); 
            
            for(int i=0; i<n; i++)
                System.out.print(arr[i] + " " );
            System.out.println();
        }
    }
}
// } Driver Code Ends

