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
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //Tricky 2 Pointers
        //O(N),O(1)
        ListNode temp = new ListNode(0);
        temp.next = head;
        ListNode s = temp, f = temp;
        while (n > 0) {
            f = f.next;
            n--;
        }
        while(f.next!=null){
            s=s.next;
            f=f.next;
        }
        s.next=s.next.next;
        return temp.next;
    }
}