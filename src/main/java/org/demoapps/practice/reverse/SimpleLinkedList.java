package org.demoapps.practice.reverse;

import java.util.ArrayList;
import java.util.List;

public class SimpleLinkedList {
    private Node head; // Pointer to the first node in the list
    private int size;   // Keeps track of the number of nodes

    // Node class (inner class) to represent a node in the linked list


    // Constructor to initialize an empty linked list
    public SimpleLinkedList() {
        this.head = null;
        this.size = 0;
    }

    public Node getHeadNode() {
        return this.head;
    }

    public void setHeadNode(Node node) {
        this.head = node;
    }

    // Helper function to get the size of the linked list
    public int size() {
        return this.size;
    }

    // Insertion at the beginning of the list
    public void insertFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    // Insertion at the end of the list
    public void insertLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    // Deletion of the first node
    public void deleteFirst() {
        if (head == null) {
            return; // Nothing to delete
        }
        head = head.next;
        size--;
    }

    // Traversal:  Prints the elements of the linked list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public List<Integer> toList() {
        List<Integer> list = new ArrayList<>();
        Node current = head;
        while (current != null) {
            list.add(current.data);
            current = current.next;
        }
        return list;
    }

    public boolean equals(SimpleLinkedList start) {
        boolean result = true;
        if (start == null) {
            //Input arg is null but current list is initialized
            result = false;
        } else if (start == this) {
            // if both point to same object
            result = true;
        } else if (start.size != this.size) {
            // if both have different size
            result = false;
        } else {
            // both this and start are initialized and have same size

            Node first = start.head;
            Node second = this.head;

            while (true) {
                if ((first == null & second != null) || (first != null & second == null)) {
                    result = false;
                    break;
                }

                if (first == null & second == null) {
                    break;
                }

                if (first.data != second.data) {
                    result = false;
                    break;
                }

                first = first.next;
                second = second.next;
            }
        }
        return result;
    }

}
