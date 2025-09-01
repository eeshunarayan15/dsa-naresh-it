package com.mainapp;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix54 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

//        // Debug: Print original matrix
//        System.out.println("=== ORIGINAL MATRIX ===");
//        printMatrix(matrix);

        List<Integer> result = spiralOrder(matrix);
        System.out.println(result);
//
//        // Debug: Print final result
//        System.out.println("\n=== FINAL RESULT ===");
//        System.out.println("Spiral Order: " + result);
//        System.out.println("Expected:     [1, 2, 3, 6, 9, 8, 7, 4, 5]");
//        System.out.println("Match: " + result.equals(List.of(1, 2, 3, 6, 9, 8, 7, 4, 5)));

    }

    @SuppressWarnings("unused")
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        // Debug: Matrix dimensions
//        System.out.println("\n=== MATRIX INFO ===");
//        System.out.println("Rows: " + matrix.length + ", Cols: " + matrix[0].length);

        // Initialize boundaries
        int top = 0;
        int bot = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        // Debug: Initial boundaries
//        System.out.println("Initial boundaries -> Top:" + top + ", Bot:" + bot + ", Left:" + left + ", Right:" + right);

        int iteration = 1;

        while (left <= right && top <= bot) {
            System.out.println(left <= right && top <= bot);
//            System.out.println("\n--- ITERATION " + iteration + " ---");
//            System.out.println("Current boundaries -> Top:" + top + ", Bot:" + bot +", Left:" + left + ", Right:" + right);

            // Direction 1: LEFT to RIGHT (top row)
//            System.out.println("\n🔄 Direction 1: LEFT→RIGHT (Row " + top + ")");
            System.out.println("Processing: left to right");
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
                System.out.println(matrix[top][i] + " left to right");
            }
            System.out.println(top+ "top");
            top++;
            System.out.println("increasing the top " +top);
//            System.out.println("\n✅ Updated top to: " + top);

            // Direction 2: TOP to BOTTOM (right column)
            if (top <= bot) {  // Add safety check
                System.out.print(top <= bot);
                System.out.println("  top is less than qual to bot");
//                System.out.println("\n🔄 Direction 2: TOP→BOTTOM (Col " + right + ")");
//                System.out.print("Processing: ");
                for (int i = top; i <= bot; i++) {
                    result.add(matrix[i][right]);
                    System.out.println(matrix[i][right] + " top to bottom ");
                }
                right--;
//                System.out.println("\n✅ Updated right to: " + right);
            }

            // Direction 3: RIGHT to LEFT (bottom row) - with boundary check
            if (top <= bot) {
//                System.out.println("\n🔄 Direction 3: RIGHT→LEFT (Row " + bot + ")");
//                System.out.print("Processing: ");
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bot][i]);
//                    System.out.print(matrix[bot][i] + " ");
                }
                System.out.println(bot+ " top");
                bot--;

                System.out.println(bot+ "  top");
//                System.out.println("\n✅ Updated bot to: " + bot);
            } else {
//                System.out.println("\n❌ Direction 3 SKIPPED: top > bot (" + top + " > " + bot + ")");
            }

            // Direction 4: BOTTOM to TOP (left column) - with boundary check
            if (left <= right) {
                System.out.print(left <= right);
                System.out.println("  left is less than qual to right");
//                System.out.println("\n🔄 Direction 4: BOTTOM→TOP (Col " + left + ")");
//                System.out.print("Processing: ");
                for (int i = bot; i >= top; i--) {
                    result.add(matrix[i][left]);
                    System.out.print(matrix[i][left] + " bottom to  top");
                }
                left++;
//                System.out.println("\n✅ Updated left to: " + left);
            } else {
//                System.out.println("\n❌ Direction 4 SKIPPED: left > right (" + left + " > " + right + ")");
            }

            // Debug: Current result and loop condition
//            System.out.println("\n📊 After iteration " + iteration + ":");
//            System.out.println("Current result: " + result);
//            System.out.println("Loop condition: (left <= right && top <= bot) = " +"(" + left + " <= " + right + " && " + top + " <= " + bot + ") = " + (left <= right && top <= bot));

            iteration++;
        }

//        System.out.println("\n🏁 LOOP ENDED - Final boundaries:");
//        System.out.println("Top:" + top + ", Bot:" + bot + ", Left:" + left + ", Right:" + right);

        return result;
    }

    // Helper method to print matrix in readable format
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
//                System.out.printf("%3d ", matrix[i][j]);
            }
            System.out.println();
        }
    }
}