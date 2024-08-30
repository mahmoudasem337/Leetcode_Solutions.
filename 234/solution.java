class Solution {
    public boolean isPalindrome(ListNode head) {
        // Fast & Slow + Reversing
        //we can put ll vals in list put it O(N) Memory
        //Algorithm : 1- find mid "Fast & Slow" , 2- reverse second half , 3-compare
//O(N),O(1)
        if (head==null || head.next==null) {
            return true;}

        ListNode slow =head;
        ListNode fast =head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
//when fast reach tail , slow will be in mid
        }

        ListNode  prev =null;
        ListNode  curr =slow;
        ListNode  nnext =null;
        while(curr !=null){
            nnext=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nnext;
        }

        ListNode firstHalf = head;
        ListNode secondHalf = prev;
        while (secondHalf != null) {
            if (firstHalf.val != secondHalf.val) {
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        return true;
    }}
