package com.mainapp;

public class Pattern7 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
               if(i==j){
                 System.out.print(i);
                
               }
               if(i==j+1){
                System.out.print(i+4-1);
               }
            }
            System.out.println();
        }
}
}
