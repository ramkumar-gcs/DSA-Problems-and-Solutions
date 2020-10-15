/*
ArrayInsetion at End:
--------------------
Insertion is a basic but frequently used operation.
Arrays in most languages can not be dynamically shrinked or expanded. 
Here, we will work with such arrays and try to insert an element at the end of the array.

You are given an array arr. The size of the array is given by sizeOfArray. You need to insert an element at the end.

Example 1:

Input:
sizeOfArray = 6
arr[] = {1, 2, 3, 4, 5}
element = 90

Output: 1 2 3 4 5 90

Explanation: After inserting 90 at the
end, we have array elements as 
1 2 3 4 5 90.
*/
import java.io.*;
import java.util.*;

class Insert
{
    public void insertAtEnd(int arr[],int sizeOfArray,int element)
    {
         arr[sizeOfArray-1]=element;
    }
}

// { Driver Code Starts
class Array {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int testcases=sc.nextInt();
		while(testcases-->0)
		{
		    int sizeOfArray=sc.nextInt();
		    int arr[]=new int[sizeOfArray];

		    for(int i=0;i<sizeOfArray-1;i++)
		    {
		        int x;
		        x=sc.nextInt();
		        arr[i]=x;
		    }
		    int element=sc.nextInt();
		    
		    Insert obj=new Insert();
		    obj.insertAtEnd(arr,sizeOfArray,element);
		 
		    for(int i=0;i<sizeOfArray;i++)
		    {
		        System.out.print(arr[i]+" ");
		        
		    }
		    System.out.println();
		}
	}
}
// } Driver Code Ends
