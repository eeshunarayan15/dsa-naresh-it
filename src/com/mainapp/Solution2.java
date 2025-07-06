package com.mainapp;

class Solution2 {
    public static void main(String[] args) {

         isPalindrome(121);
        System.out.println("hello");
    }
    public static void isPalindrome(int x) {

            // if (x < 0) return false;
 
    // if (x >= 0 && x < 10) return true;
    //    if (x % 10 == 0 && x != 0) return false; 
         int rev=0;
         int temp=x;



        while(temp>0){
            int lastdigit=temp%10;
            System.out.println(lastdigit+"lastdigit");
            rev=rev*10+lastdigit;
            System.out.println(rev+"rev");
            temp/=10;
            System.out.println(temp+"temp");

        }

        if(rev==x){
            System.out.println("palindrome");
        }else
            System.out.println("not a palindrome");
        
//    return x == rev || x == rev / 10;
    }
}