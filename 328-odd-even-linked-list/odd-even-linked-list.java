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
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode Odd = head;
        ListNode Even = head.next;
        ListNode EvenH = Even;
        while(Even != null && Even.next != null) {
                Odd.next = Even.next;
                Odd = Odd.next;
                Even.next = Odd.next;
                Even = Even.next;
        }
        Odd.next = EvenH;
        return head;
    }
}