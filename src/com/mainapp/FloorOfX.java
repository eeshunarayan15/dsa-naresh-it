package com.mainapp;

public class FloorOfX {
    public static void main(String[] args) {
        int arr[]={3,7,-2,15,8,-5,20,10,-13};
        int floor = floor(arr, 12);
        System.out.println(floor);
    }
    public  static int floor(int[] arr, int x){
        int ans=Integer.MIN_VALUE;
        int ans2=Integer.MAX_VALUE;
        @SuppressWarnings("unused")
        int[] clone = arr.clone();
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            @SuppressWarnings("unused")
            int mid=(low+high)/2;

        }
        System.out.println(ans+"  "+ans2);
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=x){
                ans=Math.max(ans,arr[i]);
//                System.out.println(ans);
            }
        }
        return ans;
    }
}
