package com.mainapp;

public class BitwiseOperator {
    public static void main(String[] args) {
        byte a =26 ;
        byte b=37;
        byte c=(byte) (a|b);
        System.out.println("or "+c);
        byte d=(byte) (a&b);
        System.out.println("& "+d);
        byte e=(byte) (a^b);
        System.out.println("^ "+e);
        int f=a|a;
        System.out.println(f+" f");
    }

}
