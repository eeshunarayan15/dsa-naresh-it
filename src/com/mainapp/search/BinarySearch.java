package com.mainapp.search;

public class BinarySearch {
    public static void main(String[] args) {
        // 1 2 3 4 5 6 7 8 9
        int[] arr = { -11, -4, 10, 15, 17, 20, 25, 30, 35 };
        boolean result = binarySearch(arr, 35, 9);
        System.out.println(result);
    }

    private static boolean binarySearch(int[] arr, int key, int n) {

        int lo = 0;
        int hi = n - 1;

        while (lo<=hi) {
            int mid = (lo + hi) / 2;
            // System.out.println(lo+""+hi+" "+arr[mid]);
            if (arr[mid]> key) {
                hi = mid - 1;
            } else if (arr[mid] < key) {
                lo = mid + 1;
                
            } else {
                System.out.println(arr[mid]);
                return true;
            }
            // System.out.println(lo + "" + hi + " " + arr[mid]);
            
        }
        return false;

    }

}
