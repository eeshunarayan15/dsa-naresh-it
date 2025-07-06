package com.mainapp;

public class Launch {public static void main(String[] args) {
        int num = 38;
        int sum = 0;
   
        while (num > 9) {
            sum = 0; // Fresh start
            int temp = num; // Original number backup

            // Digits extract karne ka loop
            while (temp > 0) {
                int rem = temp % 10;
                sum = sum + rem;
                temp = temp / 10;
            }

            num = sum;

            System.out.println(sum);
}
       


}
    }


