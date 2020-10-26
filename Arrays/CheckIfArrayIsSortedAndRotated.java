// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;


 // } Driver Code Ends


class SortedRotated{    
    
    public static boolean arrInc(int arr[],int n){
        int min=Integer.MAX_VALUE;
        int min_ind=-1;
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
                min_ind=i;
            }
        }
        for(int i=1;i<n;i++){
            if(i==min_ind) continue;
            if(arr[i]<arr[i-1])
                return false;
        }
        if(arr[n-1]>arr[0])
            return false;
        return true;
        
    }
    public static boolean arrDec(int arr[],int n){
        int min=Integer.MAX_VALUE;
        int min_ind=-1;
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
                min_ind=i;
            }
        }
        for(int i=1;i<n;i++){
            if(i==min_ind+1) continue;
            if(arr[i]>arr[i-1])
                return false;
        }
        if(arr[n-1]<arr[0])
            return false;
        return true;
        
    }
    public static boolean checkRotatedAndSorted(int arr[], int num){
    
        if(arrDec(arr,num))
            return true;
        if(arrInc(arr,num))
            return true;
        return false;
    }
}




// { Driver Code Starts.

class Rotate {
    
    public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    int n = Integer.parseInt(br.readLine()); // input size of array
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split("\\s+");
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]); // input elements of array
		    }
		   
		 SortedRotated obj = new SortedRotated();
        
        if(!(obj.checkRotatedAndSorted(arr, n)))
            System.out.println("No"); // print the result
        else
            System.out.println("Yes");
		}
	}
}
  // } Driver Code Ends