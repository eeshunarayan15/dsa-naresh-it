package com.mainapp.LL;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;

    }
}

public class SinglyLinkedList {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(10);
        head.next.next = new Node(15);
        head.next.next.next = new Node(20);
        head.next.next.next.next = new Node(25);
        print(head);
    }

    public void insert(int val) {
        Node node = new Node(val);
        
    }

    public static void print(Node head) {
        if (head == null) {
            throw new IllegalArgumentException("Head of the linked list is null!");
        }
        while (head != null) {

            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println();
    }

}
