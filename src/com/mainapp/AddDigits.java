package com.mainapp;
public class AddDigits {
    public static void main(String[] args) {
        int num = 12;
      
        int res = sum(num);
        System.out.println(res);

    }

    private static int sum(int num) {
if(num<9)
return num;
        int temp = num;
        int sum = 0;
        while (temp > 9) {
            int rem = temp % 10;
            System.out.println(rem);
            int next = temp / 10;
            sum = rem + next;
            System.out.println(sum);
            sum=temp;

        }
        return sum;

    }

}
