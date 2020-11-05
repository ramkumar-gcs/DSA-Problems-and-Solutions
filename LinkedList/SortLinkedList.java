// Given a linked list of N nodes where nodes can contain values 0s, 1s, and 2s only. The task is to segregate 0s, 1s, and 2s linked list such that all zeros segregate to head side, 2s at the end of the linked list, and 1s in the mid of 0s and 2s.

// Example 1:

// Input:
// N = 8
// value[] = {1,2,2,1,2,0,2,2}
// Output: 0 1 1 2 2 2 2 2
// Explanation: All the 0s are segregated
// to the left end of the linked list,
// 2s to the right end of the list, and
// 1s in between.

// Example 2:

// Input:
// N = 4
// value[] = {2,2,0,1}
// Output: 0 1 2 2
// Explanation: After arranging all the
// 0s,1s and 2s in the given format,
// the output will be 0 1 2 2.


public class Sort012 { 
  

    public static Node sortList(Node head) 
    { 
        if(head==null || head.next==null) 
        { 
            return head; 
        } 

        Node zeroD = new Node(0);  
        Node oneD = new Node(0);  
        Node twoD = new Node(0);  
  
        Node zero = zeroD, one = oneD, two = twoD;  
        Node curr = head;  
        while (curr!=null)  
        {  
            if (curr.data == 0)  
            {  
                zero.next = curr;  
                zero = zero.next;  
                curr = curr.next;  
            } 
            else if (curr.data == 1)  
            {  
                one.next = curr;  
                one = one.next;  
                curr = curr.next;  
            }  
            else 
            {  
                two.next = curr;  
                two = two.next;  
                curr = curr.next;  
            }  
        } 
        zero.next = (oneD.next!=null) ? (oneD.next) : (twoD.next);  
        one.next = twoD.next;  
        two.next = null; 
        head = zeroD.next; 
        return head; 
    } 
  
    public static Node newNode(int data)  
    {  
        Node newNode = new Node(data); 
        newNode.next = null;  
        return newNode; 
    }  
    
    public static void printList(Node node)  
    {  
        while (node != null)  
        {  
            System.out.print(node.data+" "); 
            node = node.next;  
        }  
    } 
  
    public static void main(String args[]) { 
        Node head = new Node(1);  
        head.next = new Node(2);  
        head.next.next = new Node(0);  
        head.next.next.next = new Node(1); 
        System.out.println("Linked List Before Sorting"); 
        printList(head);  
        head = sortList(head);   
        System.out.println("\nLinked List After Sorting"); 
        printList(head);  
    } 
} 
  
class Node 
{ 
    int data; 
    Node next; 
    Node(int data) 
    { 
        this.data=data; 
    } 
} 