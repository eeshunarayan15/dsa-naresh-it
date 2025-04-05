package com.mainapp.recursion;

public class Fibonacci {
    public static void main(String[] args) {
        int result = fibonacci(10);
        System.out.println(result);
    }

    private static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);

    }
}
