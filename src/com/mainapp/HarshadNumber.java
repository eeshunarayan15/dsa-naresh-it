package com.mainapp;

public class HarshadNumber {
    public static void main(String[] args) {
        int m=18;
        boolean flag=harshadNumber(m);
        if (flag) {
            System.out.println("Yes, it is a Harshad Number.");
        } else {
            System.out.println("No, it is not a Harshad Number.");
        }
    }
            private static boolean harshadNumber(int m) {


                int sum=0;
                int temp=m;
               while (m>0) {
                int r=m%10;
                m=m/10;
                    // System.out.println("remainer"+r);
                    // System.out.println("number"+m);
                    sum=r+sum;
                    // System.out.println("sum"+sum);
                  
               }
            //    System.out.println("temp"+temp);
            //    System.out.println("sumgdg"+sum);
               if(temp%sum==0){
                return true ;
               }
               else {
                return false;
               }
            }

}
