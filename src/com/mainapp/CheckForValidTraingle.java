package com.mainapp;

public class CheckForValidTraingle {

    public static void main(String[] args) {
        
        int a=5,b=7,c=11;
        if(a+b>c && b+c>a && c+a>b){
            System.out.println("yes");
        }else
        System.out.println("no");
    }
}
