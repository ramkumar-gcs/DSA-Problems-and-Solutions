/*
Mean And Median of Array :
--------------------------
Given an array a[ ] of size N.
The task is to find the median and mean of the array elements. 
Mean is average of the numbers and median is the element which is 
If there are odd elements, the median is simply the middle element in the sorted array.
If there are even elements, then the median is floor of average of two middle numbers in the sorted array.
If mean is floating point number, then we need to print floor of it.

Note: To find the median, you might need to sort the array. Since sorting is covered in later tracks, 
we have already provided the sort function to you in the code.

Example 1:

Input:
N = 5
a[] = {1, 2, 19, 28, 5}

Output: 11 5

Explanation: For array of 5 elements,
mean is (1 + 2 + 19  + 28  + 5)/5 = 11.
Median is 5 (middle element after sorting)
*/

import java.io.*;
import java.util.*;
class MeanAndMedian
{
    public int median(int A[],int N)
    {
      
       Arrays.sort(A);
       
       if(N%2==0){
           return (A[(N/2)-1]+A[N/2])/2;
       }
       else{
           return A[N/2];
       }
     
    }
    public int mean(int A[],int N)
    {
       int sum=0;
       for(int i=0;i<N;i++){
           sum+=A[i];
       }
       return sum/N;
       
    }

}

// { Driver Code Starts
class Mathematics {
    
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0)
		{
		    MeanAndMediann obj=new MeanAndMedian();
		    int N;
		    N=sc.nextInt();
		    int a[]=new int [N];
		    for(int i=0;i<N;i++)
		    {
		        int x=sc.nextInt();
		        a[i]=x;
		    }
		    System.out.println(obj.mean(a,N)+" "+obj.median(a,N));
		}
	}
}
// } Driver Code Ends

