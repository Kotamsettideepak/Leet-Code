//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    long n = sc.nextLong();
                    Solution ob = new Solution();
                    System.out.println(ob.onlyFirstAndLastAreSet(n));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution
{
    int onlyFirstAndLastAreSet(long n)
    {
        long temp=n;
        int c=0,r=0;
        while(temp!=0){
            if((temp&1)==1){
                c++;
            }
            temp=temp>>1;
            r++;
        }
        if(c==2 && ((n ^ (1<<(r-1)))==1)){
            return 1;
        }
        return 0;
    }
}
