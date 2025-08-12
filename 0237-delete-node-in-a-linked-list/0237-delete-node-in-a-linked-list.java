/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        // we just have to remove 
        node.val= node.next.val; //put next ka value in current value 
        node.next= node.next.next; //point the next to next next
        
    }
}