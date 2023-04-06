#User function Template for python3


class Solution:
    def xorGate (self,l, N):
        #code here
        if len(l)==1:
            return l[0]
        x=l[0]^l[1]
        for i in range(2,len(l)):
            x=x^l[i]
        return x

#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__': 
    t = int (input ())
    for _ in range (t):
        N = int(input())
        arr = [int(i) for i in input().split()]
       

        ob = Solution()
        print(ob.xorGate(arr,N))
# } Driver Code Ends