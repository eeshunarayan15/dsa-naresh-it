package com.mainapp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Subset {
    // 5 numbers are given in an array and we have to find the number of subsets
    //arr[] 1,2,3,4,5
    // k=8
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of elements in the array: ");
        int n=Integer.parseInt(br.readLine());
        String s1[]=br.readLine().split(" ");
        int arr[]= new int [n];
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(s1[i]);
        }
        int k=Integer.parseInt(br.readLine());
        boolean flag=subSet(arr,n,k);
        System.out.println("Subset found: "+flag);


    }

    private static boolean subSet(int[] arr, int n, int k) {
           for(int i=1;i<(1<<n);i++){
            //i have to check which bit are set
            // i wil check only n bits
            int sum=0;
            for(int j=0;j<n;j++){
                if(checkBit(i,j)==true){

                    //list
                    sum=sum+arr[j];
                    
                }
            }
            if(sum==k){
                System.out.println("Subset found with sum "+k);
                return true;
            }
            //iterate and find the sum of all elements in the list


           }


              return false;
    }

    private static boolean checkBit(int n, int i) {
      return ((n>>i)&1)==1;
    }



  

}
