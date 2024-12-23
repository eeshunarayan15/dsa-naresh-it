package com.mainapp;
public class LinearSearch {

public static void main(String[] args) {
   
    int[] arr={5,-1,7,8,2,3};
    int[] arr1={-1,2,3,5,7,8};
    @SuppressWarnings("unused")
    boolean result=linearSearch(arr,6,78);
    // System.out.println(result);




    boolean result1=ls1(arr1,6,3);
    System.out.println(result1);
            }
        
        private static boolean ls1(int[] arr1, int n, int key1) {
          for(int s=0;s<arr1.length;s++){
           
              // if(arr1[s]<=key1){
              //   // System.out.print(arr1[s]+" ");
              //   if(arr1[s]==key1)
              //   return true;
              // }
              if(arr1[s]==key1){
                return true;
              }
              if (arr1[s]>key1){
                return false; 
              }
          
            
            
          }
          System.out.println("key not found");
            return false;
        }
        

  
        private static boolean linearSearch(int[] arr, int n, int key) {
      for(int i=0;i<arr.length;i++){
  
        if(arr[i]==key)
            return true;
        
      }
      // System.out.println("key not found");
        return false;
    }
    
  
}
