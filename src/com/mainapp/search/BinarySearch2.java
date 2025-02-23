package com.mainapp.search;

public class BinarySearch2 {
    public static void main(String[] args) {
            binarySearch();
        }
        
        private static void binarySearch() {
            int[] arr = { -11, -4, 10, 15, 17, 20, 25, 30, 35 };
            int left = 0;
            int key = -115;
            int right = arr.length - 1;
            
            while (left <= right) {
                int mid = left + (right - left) / 2;
                
                if (arr[mid] == key) {
                    System.err.println("element found");
                    System.out.println(arr[mid]);
                    return;
                } else if (arr[mid] > key) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            
            System.err.println("element not found");
        }

}
