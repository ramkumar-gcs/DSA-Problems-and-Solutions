/*
Who has the majority? 
---------------------
You are given an array arr[] of size N. You are also given two elements x and y. 
Now, you need to tell which element (x or y) appears most in the array. 
In other words, return the element, x or y, that has higher frequency in the array. 
If both elements have the same frequency, then just return the smaller element.

NOTE :  We need to return the elements, not their counts.

Example 1:

Input:
N = 11
arr[] = {1,1,2,2,3,3,4,4,4,4,5}
x = 4, y = 5

Output: 4

Explanation: n=11; 
elements = {1,1,2,2,3,3,4,4,4,4,5}; 
x=4; y=5
x frequency in arr is = 4 times
y frequency in arr is = 1 times
x has higher frequency, so we print 4.
*/
import java.io.*;
import java.util.*;

class Majority
{
    public int majorityWins(int arr[],int n,int x,int y)
    {
          int count_x=0;
          int count_y=0;
          Arrays.sort(arr);
          for(int i=0;i<n;i++){
              if(arr[i]==x){
                  count_x++;
                  
              }
              if(arr[i]==y){
                  count_y++;
              }
          }
          
         if (count_x > count_y)
            return x;
         else if (count_y > count_x)
            return y;
         else
            return (x<y)?x:y;

    }
}

// { Driver Code Starts
class Array {
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	    
	    int t=sc.nextInt(); 
	    
	    while(t-->0) 
	    {
	        int n=sc.nextInt();
	        int arr[]=new int[n]; 
	        for(int i=0;i<n;i++)
	        {
	            int x=sc.nextInt();
	            arr[i]=x; 
	        }
	        
	        int x=sc.nextInt();
	        int y=sc.nextInt();
	        
	        Majority obj=new Majority();
	        System.out.println(obj.majorityWins(arr,n,x,y)); 
	        
	    }
	}
}

// } Driver Code Ends

