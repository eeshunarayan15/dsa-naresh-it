package com.mainapp;


public class MinAndMaxElementOfArray {
    public static void main(String[] args) {
        int[] arr={-5,-7,-16,-2,-3,2,1-66565};
      int   size=arr.length;
        int max=findMax(arr,size);
        int min=findMin(arr,size);
                System.out.println("MaxElement : "+max);
                System.out.println("MinElement : "+min);
                    }
                
                    private static int findMin(int[] arr, int i) {
                        int min =arr[0];
                        for(int j=0;j<i;j++){
                      
                            if(arr[j]<min){
                               
                                min=arr[j];
                            }
                        }
                            return min;
                
            }
        
                    private static int findMax(int[] arr, int n) {
                int max= arr[0];
                for(int i=0;i<n;i++){
                      
                    if(max<arr[i]){
                       
                        max=arr[i];
                    }

                }


                return max;
            }
          

}
