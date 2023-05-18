//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.isPerfect(N));
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    int isPerfect(int n) {
        // code here
     // code here
        int temp=n,sum=0;
        while(temp!=0){
            int r=temp%10;
            sum+=fact(r);
            temp=temp/10;
        }
        if(sum==n)
        return 1;
        else
        return 0;
    }
    static int fact(int n){
        if(n<=0)
        return 1;
        else
        return n*fact(n-1);
    }
}