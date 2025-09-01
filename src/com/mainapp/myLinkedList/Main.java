package com.mainapp.myLinkedList;
public class Main {
    public static void main(String[] args) {
        LL ll = new LL();
        ll.insertFirst(3);
        ll.insertFirst(2);
        ll.insertFirst(8);
        ll.insertFirst(17);
        ll.insertlast(999);
        ll.insert(1000, 3);
        ;
        ll.display();
        System.out.println(ll.deleteFirst());
        ll.display();
        System.out.println(ll.deleteLast());
        ll.display();
        System.out.println(ll.delete(2));
        ll.display();
        System.out.println(ll.find(3));

    }

}
