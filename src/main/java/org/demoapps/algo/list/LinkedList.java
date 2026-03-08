package org.demoapps.algo.list;

public class LinkedList {
    Node head;
    Node tail;

    public LinkedList() {
        head = null;
        tail = null;
    }

    public Node addNode(int data) {
        return addAtStart(data);
    }

    public Node addAtStart(int data) {
        Node node = new Node();
        node.setValue(data);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            node.next = head;
            head = node;
        }
        return node;
    }

    public Node addAtEnd(int data) {
        Node node = new Node();
        node.setValue(data);
        if (tail == null) {
            tail = node;
            head = node;
        } else {
            tail.next = node;
            tail = node;
        }
        return node;
    }

    public int size() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public boolean contains(int data) {
        Node current = head;
        while (current != null) {
            if (current.value == data) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public int get(int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("Index cannot be negative");
        }
        Node current = head;
        int count = 0;
        while (current != null) {
            if (count == index) {
                return current.value;
            }
            count++;
            current = current.next;
        }
        throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + count);
    }

    public void insertAt(int index, int data) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("Index cannot be negative");
        }
        
        if (index == 0) {
            addAtStart(data);
            return;
        }

        Node node = new Node();
        node.setValue(data);
        
        Node current = head;
        int count = 0;
        while (current != null && count < index - 1) {
            current = current.next;
            count++;
        }

        if (current == null) {
             throw new IndexOutOfBoundsException("Index: " + index + " out of bounds");
        }

        node.next = current.next;
        current.next = node;
        
        if (node.next == null) {
            tail = node;
        }
    }

    public void deleteAt(int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("Index cannot be negative");
        }
        if (head == null) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: 0");
        }

        if (index == 0) {
            head = head.next;
            if (head == null) {
                tail = null;
            }
            return;
        }

        Node current = head;
        int count = 0;
        while (current != null && count < index - 1) {
            current = current.next;
            count++;
        }

        if (current == null || current.next == null) {
            throw new IndexOutOfBoundsException("Index: " + index + " out of bounds");
        }
        
        if (current.next == tail) {
            tail = current;
        }
        current.next = current.next.next;
    }

    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;
        
        if (head != null) {
            tail = head;
        }
        
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    @Override
    public String toString() {
        return "{H-->" + head + "<--tail" + "}";
    }
}
