package com.mainapp.circularLL;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CLL list = new CLL();
        list.insert(11);
        list.insert(12);

        list.insert(13);
        list.insert(14);
        list.insert(15);
        list.insert(16);
        list.display();
        list.delete(16);
        list.display();
    }

}
