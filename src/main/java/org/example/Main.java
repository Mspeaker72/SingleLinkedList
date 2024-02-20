package org.example;

public class Main {


    public static void main(String[] args) {
        Node node =  new Node(13);
        Node nodeA =  new Node(34);
        Node nodeB =  new Node(10);
        Node nodeC =  new Node(18);
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.insert(nodeB,0);
        singleLinkedList.insert(nodeC,1);
        singleLinkedList.insert(nodeA,0);
        singleLinkedList.delete(0);
        System.out.println(singleLinkedList.size());
        singleLinkedList.printList();
        singleLinkedList.peakLast();
        singleLinkedList.peakFirst();

    }
}
