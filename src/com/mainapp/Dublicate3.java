package com.mainapp;

import java.util.ArrayList;
import java.util.Arrays;

public class Dublicate3 {
    public static void main(String[] args) {
        int array[]={1,2,5,2,6,1,7,1,1,5,6,7};
        // int array[]={1000,1000,1000,1000};
        int n=array.length;
        @SuppressWarnings("unused")
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int i=0;i<n;i++){  
            System.out.println(Arrays.toString(array));
        int key=array[i];
        int c=0;
        for (int j = i+1; j<n; j++) {
           
            if(array[j]==key){

                c++;
                array[j]=-1;
            }
        } 
        if(key!=-1 && c>0){
            System.out.println(key);
            System.out.println(Arrays.toString(array));

           
           
        }

        }
    

       
        
    }

}
