/*
Array insert at index :
-----------------------
Insertion is a basic but frequently used operation. 
Arrays in most languages cannnot be dynamically shrinked or expanded.
Here, we will work with such arrays and try to insert an element at some index.

Example 1:
Input:
sizeOfArray = 6
arr[] = {1, 2, 3, 4, 5}
index = 5, element = 90

Output: 1 2 3 4 5 90

Explanation: 90 is inserted at index
5(0-based indexing). After inserting,
array elements are like
1, 2, 3, 4, 5, 90.
*/
import java.io.*;
import java.util.*;

class Insert
{
    public void insertAtIndex(int arr[],int sizeOfArray,int index,int element)
    {
           for(int i=sizeOfArray-1;i>=0;i--)
           {
               if(i==index){
                   arr[i]=element;
                   break;
               }
               arr[i]=arr[i-1];
           }
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
		    
		    int index=sc.nextInt();
		    int element=sc.nextInt();
		    
		    Insert obj=new Insert();
		 
		    obj.insertAtIndex(arr,sizeOfArray,index,element);
		    
		    for(int i=0;i<sizeOfArray;i++)
		    {
		        System.out.print(arr[i]+" ");
		        
		    }
		    
		    System.out.println();
		}
	}
}
// } Driver Code Ends

