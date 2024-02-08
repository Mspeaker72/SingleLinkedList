package org.example;

public class Main {


    public static void main(String[] args) {

        Node head = new Node(5);
        Node tail = new Node(28);
        Node nodeA = new Node(36);

        SingleLinkedList singleLinklyList = new SingleLinkedList(head,tail);
        singleLinklyList.insert(nodeA);
        singleLinklyList.printList();
        singleLinklyList.search(36);
        singleLinklyList.delete(36);
        singleLinklyList.printList();

    }
}
