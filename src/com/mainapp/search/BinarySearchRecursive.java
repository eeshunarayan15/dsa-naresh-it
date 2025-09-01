package com.mainapp.search;
public class BinarySearchRecursive {
    public static void main(String[] args) {
        // 0 1 2 3 4 5 6 7 8
        int ar[] = { -4, -1, 0, 3, 7, 15, 20, 23, 30 };

        int low = 0;
        int high = ar.length - 1;
        int key = -4;
      boolean res=  search(ar, low, high, key);
      System.out.println(res);
    }

    private static boolean search(int[] ar, int low, int high, int key) {
        if(low>high)
        return false;
        int mid = (low + high) / 2;
        if (ar[mid] == key) {

            return true;

        } else if (ar[mid] > key) {
            return search(ar, low, mid - 1, key);

        } else {
            return search(ar,mid+1,high,key);
           
        }
      
    }

}
