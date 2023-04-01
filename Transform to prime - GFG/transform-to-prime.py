#User function Template for python3
def isPrime(n):
    a=int(pow(n,0.5))
    c=0
    for i in range(1,a+1):
        if n%i==0:
            c+=1
    if c==1:
        return True
    return False

def minNumber(l,N):
    # code here
    s=sum(l)
    i=0
    if isPrime(s)==False:
        temp=s
        x=True
        while x:
            s=s+i
            if isPrime(s)==True:
                return i
            i+=1
            s=temp
    return i
    



#{ 
 # Driver Code Starts
#Initial Template for Python 3


t=int(input())
for _ in range(0,t):
    n=int(input())
 #    l=list(map(int,input().split()))
 #    n=l[0]
 #    m=l[1]
    a=list(map(int,input().split()))
   # k = int(input())
  #  b = list(map(int, input().split()))
    ans=minNumber(a,n)
    print(ans)

# } Driver Code Ends