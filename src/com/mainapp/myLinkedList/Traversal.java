package com.mainapp.myLinkedList;
 class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;

    }}
public class Traversal {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next=new Node(10);
        head.next.next=new Node(15);
        head.next.next.next=new Node(20);
        head.next.next.next.next=new Node(11);
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " → ");
            current = current.next;
        }
        System.out.println("END");
    }

}
