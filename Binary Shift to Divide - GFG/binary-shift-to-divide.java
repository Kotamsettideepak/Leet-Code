//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;
import java.lang.*;

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
            System.out.println(ob.half(N));
        }
    }
}

// } Driver Code Ends

//User function Template for Java

class Solution{
    static int half(int n){
        if (n==1) return n;
        return (int)Math.floor(n>>1);
    }
}