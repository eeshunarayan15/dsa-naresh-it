package com.mainapp;

public class Trail {
    // // ****
    // // ***
    // // **
    // // *
    // public static void main(String[] args) {
    //     int n = 4;
    //     for (int row = 1; row <= n; row++) {
    //         for (int col = 1; col <= n - row + 1; col++) {
    //             System.out.print(col);
    //         }
    //         System.out.println();

    //     }
    // }
    public static void main(String[] args) {
    
    // ***1
    // **12
    // *123
    // 1234
    int n = 4;
    for (int row = 1; row <= n; row++) {
        for (int wb = 1; wb <= n - row; wb++) {
            System.out.print(" ");
        }
        for(int num=1;num<=row;num++){
            System.out.print(num);
        }
        System.out.println();
    }
}
}
