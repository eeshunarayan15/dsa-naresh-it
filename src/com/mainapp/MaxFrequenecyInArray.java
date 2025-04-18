package com.mainapp;

public class MaxFrequenecyInArray {
    public static void main(String[] args) {
        int arr[]={3,5,1,3,10,2,3,9,4,3,1,4,};
        int n=arr.length;
        maxFrequency(arr,n);
    }

    private static void maxFrequency(int[] arr, int n) {
       int maxfreq=0;
       int maxnumber=0;
        for (int i = 0; i < n; i++) {
            int x=arr[i];
            int curretfreq=0;
           for (int j = 0; j < n; j++) {
            if(x==arr[j]){
                curretfreq++;
                
            }
            if(curretfreq>maxfreq){
                maxfreq=curretfreq;
                maxnumber=x;
            }   
            
           }

            
        }
        System.out.println(maxfreq);
        System.out.println(maxnumber);
    }

}
