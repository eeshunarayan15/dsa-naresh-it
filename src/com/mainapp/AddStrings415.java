package com.mainapp;

public class AddStrings415 {
    public static void main(String[] args) {
//        Input: num1 = "11", num2 = "123"
//        Output: "134"
        String res = addStrings("11", "123");
        System.out.println(res);

    }
    public static String addStrings(String num1, String num2) {
        int n1=Integer.parseInt(num1);
        int n2=Integer.parseInt(num2);
        int sum=n1+n2;
        String res=""+sum;
return  res;
    }
}
