package org.demoapps.lc.listadd;

public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return sum(l1, l2, 0);
    }

    ListNode sum(ListNode l1, ListNode l2, int carry) {
        ListNode returnVal = null;

        if (l1 == null && l2 == null) {
            if (carry > 0) {
                returnVal = new ListNode(carry);
            }
        }

        if (l1 == null && l2 != null) {
            int sum = carry + l2.getVal();
            int localCarry = sum / 10;
            int rem = sum % 10;
            returnVal = new ListNode(rem, sum(null, l2.getNext(), localCarry));
        }

        if (l1 != null && l2 == null) {
            int sum = carry + l1.getVal();
            int localCarry = sum / 10;
            int rem = sum % 10;
            returnVal = new ListNode(rem, sum(l1.getNext(), null, localCarry));
        }

        if (l1 != null && l2 != null) {
            int sum = l1.getVal() + l2.getVal() + carry;
            int localCarry = sum / 10;
            int rem = sum % 10;
            returnVal = new ListNode(rem, sum(l1.getNext(), l2.getNext(), localCarry));
        }

        return returnVal;
    }
}
