package com.mainapp;

public class HappyNumberLeetcode202 {
    // Input:n=19 
    // Output:true 
    // Explanation:12+92=82 
    // 82+22=68 
    // 62+82=100 
    //  12+02+02=1
public static void main(String[] args) {
    boolean res = happyNumber(19);
    System.out.println(res+"  response");
}

  public static boolean happyNumber(int n) {
    int temp = n;
    int sum = 0;
    int counter = 0; // Counter add kiya

    // Counter condition add ki - maximum 1000 iterations
    while (sum != 1 && counter < 1000) {
        counter++; // Har iteration mein counter increase

        // Tumhara existing logic - exactly same!
        while (temp > 0) {
            int rem = temp % 10;

            sum = sum + (rem * rem);

            temp = temp / 10;

        }
        if (sum == 1)
            return true;

        temp = sum; // Next iteration ke liye
        sum = 0; // Reset sum

       
    }

    // Logic-based return
    if (sum == 1) {
      
        return true;
    } else {
       
        return false;
    }
  }

}
