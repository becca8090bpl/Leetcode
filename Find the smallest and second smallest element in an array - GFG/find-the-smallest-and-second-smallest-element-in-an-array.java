//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            long n = Long.parseLong(br.readLine().trim());
            long a[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            
            Compute obj = new Compute();
            long[] product = obj.minAnd2ndMin(a, n); 
            if(product[0]==-1)
                System.out.println(product[0]);
            else
                System.out.println(product[0]+" "+product[1]);
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java


class Compute 
{
    public long[] minAnd2ndMin(long a[], long m)  
    {
          long n[]= new long[2];
        long[]arr=new long[a.length];
       Arrays.sort(a);
     //  System.out.println(a[3]);
        if (m < 2) {
            n[0]=-1;
        n[1]=-1;
            return n ;
        }
        
        n[0]=a[0];
        for(int i=1;i<m;i++){
            
        if(a[0]!=a[i]){
        n[1]=a[i];break;}
          /*else{ a[0]=-1;a[1]=-1;
          }*/
        }
        if (n[1]==0){
        n[1]=-1;
        n[0]=-1;}
        return n;
    }
}
