//{ Driver Code Starts
import java.util.*;

class Fraction_Addition
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0)
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
			
			GfG g = new GfG();
			g.addFraction(a,b,c,d);
		T--;
		}
	}
}
// } Driver Code Ends


/*You are required to complete this function*/
class GfG
{ 	
    void addFraction(int a, int b, int c, int d)
    {
         int lcm = b * d / gcd(b, d);

        int num1 = a * (lcm / b);
        int num2 = c * (lcm / d);

       
        int sum = num1 + num2;

        
        int denominator = lcm;

       
        int gcd = gcd(sum, denominator);

       
        sum /= gcd;
        denominator /= gcd;

        
    
      
    System.out.println( sum + "/" + denominator);
    }
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}