/*
Definition of singly linked list:
class ListNode{
    public int data;
    public ListNode next;
    ListNode() { data = 0; next = null; }
    ListNode(int x) { data = x; next = null; }
    ListNode(int x, ListNode next) { data = x; this.next = next; }
}
*/

// class Solution {
//     public List<Integer> LLTraversal(ListNode head) {
//         //your code goes here
//         ListNode temp=head;
//         List<Integer> list=new ArrayList<>(); // ans store kei liye use kra hai 
//         while(temp!=null){
//             list.add(temp.data);
//             temp=temp.next;
//         }
//         return list;


//     }
// }

/*
/*
Definition of singly linked list:
class ListNode{
    public int data;
    public ListNode next;
    ListNode() { data = 0; next = null; }
    ListNode(int x) { data = x; next = null; }
    ListNode(int x, ListNode next) { data = x; this.next = next; }
}
*/

// class Solution {
//     public ListNode insertAtHead(ListNode head, int X) {
//         //YOUR CODE GOES HERE
//         ListNode newnode =new ListNode(X);
//         newnode.next=head;
//         head=newnode;
//         return head;
//     }
// }


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
// class Solution {
//     public void deleteNode(ListNode node) {
//         node.val=node.next.val;
//         node.next=node.next.next;

//     }
// }

// class Solution {
//     public int getLength(ListNode head) {
//         // Your code goes here
//         // 1 . copy list all the values and then list.size() return o(n) , o(n) 
//         // 2. jb hum traverse kr rhe hai uss time cnt variable ko update krte rhe  o(n) , o(1)

//         int cnt=0;
//         ListNode temp=head;
//         while(temp!=null){
//             cnt++;
//             temp=temp.next;
//         }
//         return cnt;
//     }
// }

/* Defination of ListNoode
class ListNode {
    int val;
    ListNode next;

    ListNode(int value) {
        this.val = value;
        this.next = null;
    }
}
*/


// class Solution {
//     public boolean searchKey(ListNode head, int key) {
//         // Your code goes here
//         ListNode temp=head;
//         while(temp!=null){
//             if(temp.val==key)return true;
//             temp=temp.next;
//         }
//         return false;
//     }
// }