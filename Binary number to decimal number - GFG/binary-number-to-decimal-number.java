//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String str = br.readLine().trim();
            Solution ob = new Solution();
            int ans = ob.binary_to_decimal(str);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int binary_to_decimal(String B) {
        
        int decimal = 0;
        int power = 0;

        
        for (int i = B.length() - 1; i >= 0; i--) {
            
            if (B.charAt(i) == '1') {
              
                decimal += Math.pow(2, power);
            }
            power++;
        }

        return decimal;
    }
}