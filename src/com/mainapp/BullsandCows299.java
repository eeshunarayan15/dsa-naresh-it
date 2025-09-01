package com.mainapp;
public class BullsandCows299 {
    public static void main(String[] args) {
        String secret = "1807", guess = "7810";
        String hint = getHint(secret, guess);
        System.out.println(hint);
    }

    public static String getHint(String secret, String guess) {


        int B = 0;
        int A = 0;

        int secretCount[]=new int[10];
        int guessCount[]=new int[10];


        for (int i = 0; i < secret.length(); i++) {
            char s=secret.charAt(i);
            char g=guess.charAt(i);
            if (s==g) {

                B++;
            } else {
               secretCount[s-'0']++;
              guessCount[g-'0']++;

            }

        }
        for (int i = 0; i < secretCount.length; i++) {
           A+=Math.min(secretCount[i], guessCount[i]);

        }
        return B + "A" + A + "B";
    }
}
