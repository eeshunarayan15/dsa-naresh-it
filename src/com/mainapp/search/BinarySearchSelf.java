package com.mainapp.search;

public class BinarySearchSelf {
    public static void main(String[] args) {
                   // 0   1  2  3  4  5   6   7   8
        int ar[] = { -4, -1, 0, 3, 7, 15, 20, 23, 30 };
        int key = 7;
        search(ar, ar.length-1, key);
    }

    private static void search(int[] ar, int length, int key) {
        int low = 0;
        int high = length;
        while (low<=high) {
            int mid = (low + high) / 2;
            if (ar[mid] ==key) {
        System.out.println(ar[mid]);
        System.out.println(mid);
        return;

        } else if (ar[mid] > key) {
            high= mid-1;
            System.out.println(mid);

        } else {
           low=low+1;
           System.out.println();
        }
            
        }
        System.out.println("Element NOt Found");
    }

}
