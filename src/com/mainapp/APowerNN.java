package com.mainapp;

public class APowerNN {
    //Day 31
    public static void main(String[] args) {
  
        
    }
    public static int power(int a ,int n){
        int x=a;
        int ans=1;
        @SuppressWarnings("unused")
        int m=1_000_000_000+7;
        //modulo arithmatic
        for(int i=0;i<31;i++){
            if(checkBit(a,n)==true){
                ans=ans*x;

            }
            x=x*x;
        }
        return ans;
    }
    private static boolean checkBit(int a, int n) {
    
        throw new UnsupportedOperationException("Unimplemented method 'checkBit'");
    }

}
