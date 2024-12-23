package com.mainapp;

public class CheckForValidTriangleFromGivenArray {

    public static void main(String[] args) {
        // Input array diya gaya
        int[] arr = {2, 11, 5, 0, 0, 0, 4, -3, 0};
        
        // Function call to check for valid triangles
        boolean isTriangleFound = findValidTriangles(arr);
        
        // Final result based on the flag
        if (isTriangleFound) {
            System.out.println("At least one valid triangle exists!");
        } else {
            System.out.println("No valid triangle found!");
        }
    }

    private static boolean findValidTriangles(int[] arr) {
        int n = arr.length; // Array ka size
    

        // Sab possible combinations ke liye loops
        for (int i = 0; i < n - 2; i++) {
            // Pehla element uthaya
            if (arr[i] <= 0) continue; // Agar negative ya zero hai toh skip

            for (int j = i + 1; j < n - 1; j++) {
                // Dusra element uthaya
                if (arr[j] <= 0) continue; // Negative ya zero skip

                for (int k = j + 1; k < n; k++) {
                    // Teesra element uthaya
                    if (arr[k] <= 0) continue; // Negative ya zero skip

                    // Elements ka combination liya
                    int a = arr[i], b = arr[j], c = arr[k];

                    // Triangle condition check ki
                    if (a + b > c && b + c > a && c + a > b) {
                        System.out.println("Valid triangle: " + a + ", " + b + ", " + c);
                        return true; // Ek valid triangle mila
                    }
                }
            }
        }

        return false; // Koi triangle valid nahi mila
    }
}
