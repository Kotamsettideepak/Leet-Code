//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

class ReverseInSize
{
    static Node head;
    
    public static void main (String[] args)throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        
        int t = Integer.parseInt(in.readLine().trim());
        
        while(t-- > 0)
        {
            int n = Integer.parseInt(in.readLine().trim());
            String s[]=in.readLine().trim().split(" ");
            int a1 = Integer.parseInt(s[0]);
            Node head = new Node(a1);
            Node tail = head;
            for(int i = 1; i < n; i++)
            {
                int a = Integer.parseInt(s[i]);
                // addToTheLast(new Node(a));
                tail.next = new Node(a);
                tail =tail.next;
            }
            
            int k = Integer.parseInt(in.readLine().trim());
            Solution ob = new Solution();
            Node res = ob.reverse(head, k);
            printList(res,out);
            out.println();
        }
        out.close();
    }
    
    public static void printList(Node node,PrintWriter out)
    {
        while(node != null)
        {
            out.print(node.data + " ");
            node = node.next;
        }
    }
    
}


// } Driver Code Ends


/*node class of the linked list

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

*/
class Solution
{   
    public static Node reverse(Node node, int k)
    {  
        ArrayList<Integer> al = new ArrayList<Integer>();
        while (node != null) {
            al.add(node.data);
            node = node.next;
        }
        //System.out.println(al);
        
        ArrayList<Integer> answer = new ArrayList<Integer>();
        for (int i = 0; i < al.size(); i += k) {
            if (i + k <= al.size()) {
                ArrayList<Integer> dummy = new ArrayList<Integer>(al.subList(i, i + k));
                Collections.reverse(dummy);
                answer.addAll(dummy);
            }
            else if (i<al.size() && i+k >= al.size()){
                ArrayList<Integer> dummy = new ArrayList<Integer>(al.subList(i, al.size())); 
                Collections.reverse(dummy);
                answer.addAll(dummy);
            }
        }
        Node head=new Node(0);
        Node tail=head;
        Node dummy;
        for(int i=0;i<answer.size();i++){
            dummy=new Node(answer.get(i));
            tail.next=dummy;
            tail=tail.next;
        }
        return head.next;

    }
}

