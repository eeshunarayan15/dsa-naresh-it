package com.mainapp;

public class LCM {
    public static void main(String[] args) {
        int result = myLCM(14, 12);
      System.out.println(result);
            }
        
            private static int myLCM(int i, int j) {
                int lcm=(i<j)?(i):(j);
                while (true) {
                    if (lcm % i == 0 && lcm % j == 0) {

                        break;
                    }
                    lcm++;

                }
                return lcm;
            }

}
