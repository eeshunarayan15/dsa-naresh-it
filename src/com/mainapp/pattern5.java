package com.mainapp;

public class pattern5 {
    // N=4
    // ---1
    // --12
    // -123 row 4 col 4 number of rows are n
    // 1234
    // Pattern Printing
    //
    // N=3
    // --1
    // -12 c=r=3 we have to also print white space
    // 123 now lets figure out relationship between white space and
    public static void main(String[] args) {
        int N = 4;
        for (int r = 1; r <= N; r++) {
            //for white space
            for (int wb = 1; wb <= N - r; wb++) {
                System.out.print("*");
            }
            for (int c = 1; c <= r; c++) {
                System.out.print(c);
            }
            System.out.println(); 
 
        }

    }

}
