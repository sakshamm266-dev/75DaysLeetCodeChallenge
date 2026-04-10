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
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slw=head;
        ListNode fst=head;
        while(fst!=null && fst.next!=null){
            slw=slw.next;
            fst=fst.next.next;
            if(slw==fst){
                return true;
            }
        }
        return false;
    }
}