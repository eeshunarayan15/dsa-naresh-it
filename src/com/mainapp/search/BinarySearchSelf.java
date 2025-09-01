package com.mainapp.search;
public class BinarySearchSelf {
    public static void main(String[] args) {
                   // 0   1  2  3  4  5   6   7   8
        int ar[] = { -4, -1, 0, 3, 7, 15, 20, 23, 30 };
 
        int key = 7;
      int res=  search(ar, ar.length-1, key);
      System.out.println(res);
    }

    private static int search(int[] ar, int high, int key) {
        int low = 0;
     
        while (low<=high) {
            int mid = (low + high) / 2;
            if (ar[mid] ==key) {

        return mid;

        } else if (ar[mid] > key) {
            high= mid-1;
       

        } else {
           low=mid+1;
     
        }
            
        }
       return -1;
    }

}
