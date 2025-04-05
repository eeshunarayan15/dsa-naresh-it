package com.mainapp;

public class Power {
    public static void main(String[] args) {
        
        int result=power(2, 3);
            }
        
            private static int power(int base, int exponent) {
            int halfPower = power(base, exponent / 2);
            if (exponent % 2 == 0) {
                return halfPower * halfPower;
            } else {
                return base * halfPower * halfPower;
            }

}
}