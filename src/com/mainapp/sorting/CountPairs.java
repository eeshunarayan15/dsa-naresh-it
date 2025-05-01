package com.mainapp.sorting;

public class CountPairs {
    public static void main(String[] args) {
        int ar[] = { 3, 10, 8, 2, 7, -5, 15, 8, 1, 12 };
        int n = ar.length;
        int c = 0;
        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {
                if (ar[i] > ar[j])
                    c++;

            }
        }
        System.out.println(c);
    }

}
