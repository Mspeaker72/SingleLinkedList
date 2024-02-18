package org.example;

import java.util.ArrayList;

public class SingleLinkedList {
    private Node head;
    private Node tail;

    public SingleLinkedList() {
        this.head = null;
    }

    /**
     * Constructs a SingleLinkedList with a specified head node.
     *
     * @param head The head node of the linked list.
     */
    public SingleLinkedList(Node head) {
        this.head = head;
    }

    /**
     * Constructs a SingleLinkedList with specified head and tail nodes.
     *
     * @param head The head node of the linked list.
     * @param tail The tail node of the linked list.
     */
    public SingleLinkedList(Node head, Node tail) {
        this.head = head;
        this.tail = tail;
        head.next = tail;
    }

    /**
     * Prints the elements of the linked list.
     */
    public void printList() {
        ArrayList<Integer> visual = new ArrayList<>();
        Node start = head;

        while (start != null) {
            visual.add(start.data);
            start = start.next;
        }
        System.out.println("Linked List: " + visual);
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public int size() {
        Node start = head;
        int index = 0;
        while (start != null) {
            index++;
            start = start.next;
        }
        return index;
    }

    /**
     * Traverses the linked list to find the index of a specified target value.
     *
     * @param target The target value to search for in the linked list.
     * @return The index of the target value if found, otherwise -1.
     */
    private int traverse(int target) {
        Node start = head;
        int index = 0;

        while (start != null) {
            if (start.data == target) {
                return index;
            }
            index += 1;
            start = start.next;
        }
        return -1;
    }

    /**
     * Searches for a target value in the linked list and prints its index if found.
     *
     * @param target The target value to search for in the linked list.
     */
    public void search(int target) {
        int result = traverse(target);

        if (result == -1) {
            System.out.println("Target " + target + " is not present in the linked list.");
        } else {
            System.out.println("Target " + target + " is present at index " + result + " in the linked list.");
        }
    }

    /**
     * Inserts a node at the end of the linked list.
     *
     * @param node The node to be inserted.
     */
    public void append(Node node) {
        if (this.head == null) {
            this.head = node;
        } else {
            tail.next = node;
        }
        this.tail = node;
        System.out.println("Node with value " + node.data + " inserted at the end of the linked list.");
    }

    public void insert(Node node, int index) {
        if (head == null && index != 0) {
            System.out.println("invalid index for linked list");
        } else {
            int count = 0;
            Node start = this.head;

            if (index == 0) {
                this.head = node;
                return;
            }

            while (count < index - 1) {
                count++;
                start = start.next;
            }
            Node temp = start.next;
            start.next = node;
            node.next = temp;

            if (index == size() - 1) {
                this.tail = node;
            }
        }
    }

    /**
     * Deletes a node with the specified target value from the linked list.
     *
     * @param target The target value to delete from the linked list.
     */
    public void delete(int target) {
        if (head == null) {
            System.out.println("List is empty. Nothing to delete.");
            return;
        }

        if (head.data == target) {
            head = head.next;
            if (head == null) {
                tail = null;
            }
            System.out.println("Node with value " + target + " deleted from the linked list.");
            return;
        }

        Node prev = null;
        Node current = head;
        while (current != null && current.data != target) {
            prev = current;
            current = current.next;
        }

        if (current == null) {
            System.out.println("Node with value " + target + " not found. Nothing to delete.");
            return;
        }

        prev.next = current.next;
        if (current == tail) {
            tail = prev;
        }

        System.out.println("Node with value " + target + " deleted from the linked list.");
    }

    public void peakLast() {
        if (tail != null) {
            System.out.println(this.tail.data);
        } else {
            System.out.println("List is empty.");
        }
    }
}
