#User function Template for python3
def game_with_number (l,  n) : 
    #Complete the function
    a=int(l[-1])
    r=[]
    for i in range(len(l)-1):
        b=l[i]^l[i+1]
        r.append(b)
    r.append(a)
    return r
    

#{ 
 # Driver Code Starts
#Initial Template for Python 3


for _ in range(0,int(input())):
    
    n = int(input())
    arr = list(map(int,input().strip().split()))
    res = game_with_number(arr, n);
    print(*res)




# } Driver Code Ends