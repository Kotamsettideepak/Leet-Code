#User function Template for python3
import itertools as it
class Solution:
    def permutation(self,s):
        a=list(it.permutations(s))
        r=[]
        for i in a:
            i="".join(i)
            r.append(i)
        r.sort()
        return r

#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__=="__main__":
    T=int(input())
    while(T>0):
        s=input()
        ob=Solution()
        ans=ob.permutation(s)
        for i in ans:
            print(i,end=" ")
        print()
        
        T-=1
# } Driver Code Ends