//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.largestPrimeFactor(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static long largestPrimeFactor(int n) {
        // code here
        int r=1;
        for(int i=2;i<=(n);i++){
            if(n%i==0){
            if(isPrime(i)==1){
                r=Math.max(r,i);
            }}
        }
            
         return r;    }
        
    
        
    
   static int isPrime(int num){
         if (num <= 1) {
        return 0; 
    }
    
    for (int i = 2; i <= Math.sqrt(num); i++) {
        if (num % i == 0) {
            return 0; 
        }
    }
    
    return 1;
    }
}