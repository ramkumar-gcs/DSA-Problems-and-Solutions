/*
Smallest Positive missing number :
----------------------------------
You are given an array arr[] of N integers including 0. 
The task is to find the smallest positive number missing from the array.

Example 1:

Input:
N = 5
arr[] = {1,2,3,4,5}

Output: 6

Explanation: Smallest positive missing 
number is 6.
*/
import java.util.*;

class Missing{
    static int segregate(int arr[],int size)
    {   int j=0,tmp=0;
        for(int i=0;i<size;i++){
            if(arr[i]<=0){
                tmp=arr[i];
                arr[i]=arr[j];
                arr[j]=tmp;
                j++;
            }
        }
        return j;
    }
    static int smallestNumber(int arr[],int size){
        
        int i; 
        for (i = 0; i < size; i++) { 
            int x = Math.abs(arr[i]); 
            if (x - 1 < size && arr[x - 1] > 0) 
                arr[x - 1] = -arr[x - 1]; 
        } 
        for (i = 0; i < size; i++) 
            if (arr[i] > 0) 
                return i + 1; 
  
        return size + 1; 
        
    }
    static int missingNumber(int arr[], int size)
    {
       int ind=segregate(arr,size);
       int tarr[]=new int[size-ind];
       int j=0;
       for(int i=ind;i<size;i++)
        tarr[j++]=arr[i];
       return smallestNumber(tarr,j);
       
    }
    
}

// { Driver Code Starts.
class Main
{   
    public static void main (String[] args) 
    {

		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		while(t-->0){
		   
			int n=sc.nextInt();
			int[] arr=new int[n];
			
			for(int i=0;i<n;i++)
				arr[i]=sc.nextInt();
				
			Missing obj = new Missing();
			
			int missing = obj.missingNumber(arr,n);
			System.out.println(missing);
		}
    }
}
// } Driver Code Ends