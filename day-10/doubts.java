public class doubts {
    /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
// class Solution {
//     public ListNode middleNode(ListNode head) {
//         //hare and tortise method 
//         //slow-> 1 step fast-> 2 steps 
//         // if fast reached the end then the slow points ti the mid ele 
//         ListNode slow=head;
//         ListNode fast=head;
//         while(fast!=null&&fast.next!=null){
//             slow=slow.next;
//             fast=fast.next.next;
//         }
//         return slow;

//     }
// }
}


/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
// public class Solution {
//     public boolean hasCycle(ListNode head) {
//         if(head==null||head.next==null)return false;
//         ListNode slow=head;
//         ListNode fast=head;
//         while(fast!=null&&fast.next!=null){
//             slow=slow.next;
//             fast=fast.next.next;
//             if(fast==slow)return true;
            
//         }
//         return false;
        
//     }
// }
