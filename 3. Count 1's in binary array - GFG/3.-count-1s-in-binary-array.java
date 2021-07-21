// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class Main {
    
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t-- > 0){
		   
		    int n = sc.nextInt();
		    int arr[] = new int[n];
		    for(int i = 0;i<n;i++){
		        arr[i] = sc.nextInt();
		    }
		    
		    Solution obj = new Solution();
		    System.out.println(obj.countOnes(arr, n));
		    
		}
		
	}
}// } Driver Code Ends


//User function Template for Java

class Solution{
    // Function to count number of ones in the binary array
    // N: size of array
    // arr[]: input array
    public static int countOnes(int a[], int N){
        
        // Your code here
        Arrays.sort(a);
        int low = 0, high = N-1;
        int count = 0;
        while(low <= high){
            int mid = low  + (high-low)/2;
            if(a[mid] == 0) low = mid + 1;
            else {
                if(mid == 0 || a[mid] != a[mid-1]) {
                    count = N - mid;
                    return count;
            }
                else high = mid-1;
            }
           
        }
        return count;
        
    }
}

