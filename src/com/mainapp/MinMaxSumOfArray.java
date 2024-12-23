package com.mainapp;

public class MinMaxSumOfArray {
    public static void main(String[] args) {
        int []arr={-5,-4,-9,-1,-2};
        sum(arr);
             }
         
             private static void sum(int[] arr) {
 
                 int MaxElement=Integer.MIN_VALUE;
                 int MinElement=Integer.MAX_VALUE;
                 System.out.println("Max Element"+MaxElement);
                 System.out.println("Min Element"+MinElement);
 
                 int  totalsum=0;
                 for (int i=0;i<arr.length;i++){
                    
                   
                    totalsum=totalsum+arr[i];
                    
                    
                 }
                 System.out.println(totalsum);
                 System.out.println("**************");
 
               
               for (int i=0;i<arr.length;i++){
                 if(arr[i]<MinElement){
 
                     MinElement=arr[i];
                 }
                 if(arr[i]>MaxElement){
 
                     MaxElement=arr[i];
                 }
 
 
               }
 
 
               int maxsum=totalsum-MinElement;
               int minsum=totalsum-MaxElement;
               System.out.println(maxsum);
               System.out.println(minsum);
                 
        
    }

}
