// Day 9 & 10: Linked List
// Insertion / Deletion From Head / Tail / Middle
// Find cycle, length of loop
// Middle element
// Kth Node from end
// Reverse a linked list


// linked list 
// - linear data structure 
// - nodes and pointers
// - node structure -> data , ptr 
// - head start the ll 
// - broadly 2 types of ll are used 
//     - singly ll 
//     - doubly ll 


public class ll {
    
}

/*
// Definition for a Node.
class ListNode {
    public int data;
    public ListNode prev;
    public ListNode next;
    public ListNode();
    public ListNode(int data);
    public ListNode(int data, ListNode prev, ListNode next);
};
*/

// class Solution {
//     public ListNode insertBeforeHead(ListNode head, int data) {
//         // Your code goes here
//         ListNode newnode=new ListNode(data);
//         newnode.next=head;
//         head.prev=newnode;
//         head=newnode;
//         return head;
//     }
// }

/*
// Definition for a Node.
class ListNode {
    public int data;
    public ListNode prev;
    public ListNode next;
    public ListNode();
    public ListNode(int data);
    public ListNode(int data, ListNode prev, ListNode next);
};
*/

// class Solution {
//     public ListNode deleteHead(ListNode head) {
//         // Your code goes here
//         if(head==null||head.next==null)return null;
//         head.next.prev=null;
//         head=head.next;
//         return head;
//     }
// }


/*
class ListNode {
    int data;
    ListNode prev, next;
    ListNode(int val) {
        this.data = val;
        this.prev = null;
        this.next = null;
    }
}
*/

// class Solution {
//     public ListNode reverseDLL(ListNode head) {
//         // Your code goes here
//         ListNode temp=head;
//         ListNode prevnode=null;
//         ListNode nextnode =null;

//         while(temp!=null){
//             nextnode=temp.next;
//             temp.next=prevnode;
//             temp.prev = nextnode;
//             prevnode=temp;
//             temp=nextnode;
//         }
//         return prevnode;

//     }
// }

