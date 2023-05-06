//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            String ans = new Solution().equilibrium(a, n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    String equilibrium(int arr[], int N) {
  int totalSum = 0;
        int leftSum = 0;

        for (int i = 0; i < N; i++) {
            totalSum += arr[i];
        }

        for (int i = 0; i < N; i++) {
            totalSum -= arr[i]; // Subtracting current element from the total sum
            if (leftSum == totalSum) {
                return "YES";
            }
            leftSum += arr[i];
        }

        return "NO";    }
}