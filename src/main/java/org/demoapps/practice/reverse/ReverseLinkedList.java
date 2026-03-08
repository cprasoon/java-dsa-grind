package org.demoapps.practice.reverse;

public class ReverseLinkedList {

    void reverseLinkedList(SimpleLinkedList linkedList) {
        if (linkedList != null && linkedList.size() > 1) {
            Node back = linkedList.getHeadNode();
            Node current = back.next;

            //Tail points to none
            back.next = null;
            while (current != null) {
                Node forward = current.next;
                current.next = back;
                back = current;
                current = forward;
            }
            linkedList.setHeadNode(back);
        }
    }
}
