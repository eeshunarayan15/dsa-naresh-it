package com.mainapp.doublyLL;

public class Main {
    public static void main(String[] args) {
        DLL dll = new DLL();
        dll.insertFirst(11);
        dll.insertFirst(112);
        dll.insertFirst(118978);
        dll.insertFirst(1165565);

        dll.display();
        dll.displayReverse();
      
        dll.insertLast(99);
        dll.display();
        dll.insert(112, 113);
        dll.display();

    }

}
