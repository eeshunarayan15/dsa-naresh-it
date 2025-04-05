package com.mainapp;

import java.util.ArrayList;


public class Dublicate {
    public static void main(String[] args) {
  
        int arr[] = { 1000, 2000, 5000, 2000, 6, 1000, 7 ,1000,5000};
    int    n = arr.length;
        ArrayList<Integer> al = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            int key = arr[i];
            int c = 0;
            for (int j = i+1; j < n; j++) {
                if (arr[j] == key) {
                    c++;
                    
                }
                
            }
            if (c > 0) {
                boolean flag = true;
                for (int k = 0; k < al.size(); k++) {
                    //==compare oject
                    //-128 to 127 there is integer pooling -> for 1 its true 
                    // but for 1000 its yiels false
                    if (al.get(k) == key) {
                        flag = false;
                        break;

                    }
                }
                if (flag) 
                System.out.println(key);
                al.add(key);
            }
        }

       
        
    }
}