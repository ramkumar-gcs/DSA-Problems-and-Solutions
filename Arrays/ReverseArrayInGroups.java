/*
Reverse array in groups :
-------------------------
Given an array arr[] of positive integers of size N. 
Reverse every sub-array of K group elements.

Example 1:

Input:
N = 5, K = 3
arr[] = {1,2,3,4,5}

Output: 3 2 1 5 4
Explanation: Reversing groups in size
k = 3, first group consists of elements
1, 2, 3. Reversing this group, we have
elements in order as 3, 2, 1.
*/
import java.io.*;
import java.util.*;

class Reverse{
  
    public static ArrayList<Integer> reverseInGroups(ArrayList<Integer> mv, int n, int k) {
       
        for(int i=0;i<n;i+=k){
            
            int l=i;
            int r=Math.min(i+k-1,n-1);
            
            while(l<r){
                int t=mv.get(l);
                mv.set(l,mv.get(r));
                mv.set(r,t);
                l++;
                r--;
            }
        }
        return mv;  
    }
    
}

// { Driver Code Starts.
class GFG {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    
		    String inputLine1[] = br.readLine().trim().split(" ");
		    
		    int n = Integer.parseInt(inputLine1[0]);
		   
		    int k = Integer.parseInt(inputLine1[1]);

		    ArrayList<Integer> mv = new ArrayList<>();
		    
		    String inputLine2[] = br.readLine().trim().split(" ");
		  
		    for(int i=0; i<n; i++){
		        mv.add(Integer.parseInt(inputLine2[i]));
		    }
		    
		    Reverse obj = new Reverse();
		    
		    mv = obj.reverseInGroups(mv, n, k);
		    
		    StringBuffer str = new StringBuffer();
		    for(int i=0; i<n; i++){
		        str.append(mv.get(i) + " ");
		    }
		    System.out.println(str);
		}
	}
}
