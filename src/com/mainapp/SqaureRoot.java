package com.mainapp;

public class SqaureRoot {
    public static void main(String[] args) {
        int x = 10000;
        int res = sqrt(x);
        System.out.println(res);
    }

    private static int sqrt(int x) {
       for (int i = 0; i <=x; i++) {
        if(i*i==x){
            return  i;
        }
    }
    return -1;
    }

}
