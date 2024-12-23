package com.mainapp;

public class APowerN {
    public static void main(String[] args) {
        int a = 7777777;
        int n = 3;
        int res = square(a, n);
        System.out.println(res);
    }

    private static int square(int a, int n) {
        int result = 1;
        for (int i = 0; i < n; i++) {
            result = result * a;

        }
        return result;
    }
}
