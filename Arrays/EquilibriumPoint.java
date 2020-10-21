/*
Equilibrium Point :
-------------------
Given an array A of N positive numbers. The task is to find the first Equilibium Point in the array. 
Equilibrium Point in an array is a position such that the sum of elements before it is equal to the sum of elements after it.

Example 1:

Input:
N = 1
A[] = {1}

Output: 1

Explanation: Since its the only 
element hence its the only equilibrium 
point. 
*/
import java.io.*;
import java.util.*;

class EquilibriumPoint {

    public static int equilibriumPoint(long a[], int n) {

    long l_sum=0,sum=0;
    
    for(int i=0;i<n;i++)
        sum+=a[i];
        
    for(int i=0;i<n;i++){
        
        sum=sum-a[i];
        
        if(l_sum==sum)
            return i+1;
        
        l_sum+=a[i];
        
    }
    return -1;
    }
}
// { Driver Code Starts
class Equilibrium {

    public static void main(String[] args) throws IOException {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        int t =Integer.parseInt(br.readLine().trim()); 
        while (t-- > 0) {
            
            int n = Integer.parseInt(br.readLine().trim());
            long arr[] = new long[n];
            String inputLine[] = br.readLine().trim().split(" ");
            
            for (int i = 0; i < n; i++) {
                arr[i] = Long.parseLong(inputLine[i]);
            }

            EquilibriumPoint obj = new EquilibriumPoint();
            
            System.out.println(obj.equilibriumPoint(arr, n));
        }
    }
}
// } Driver Code Ends

