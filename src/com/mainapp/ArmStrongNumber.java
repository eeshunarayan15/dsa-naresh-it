package com.mainapp;

public class ArmStrongNumber {
    public static void main(String[] args) {
        int n=153;
        boolean flag=arm(n);
        if (flag) {
          System.out.println("yes");  
        }else{
            System.out.println("no");
        }
                
            }
        
            private static boolean arm(int n) {
                int sum=0;
                int temp=n;
                while (n!=0) {
                    System.out.println("N before modification"+n);
                    int r=n%10;
                    n=n/10;
                   sum=sum+(r*r*r);
                   System.out.println("last digit"+r);
                   System.out.println("number"+n);
                   System.out.println("sum"+sum);
                   System.out.println("*************************");
                    
                }

                if(sum==temp){
                    return true;
                }else{
                    return false;
                }
            }

}
