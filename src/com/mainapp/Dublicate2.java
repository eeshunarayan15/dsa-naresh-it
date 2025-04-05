package com.mainapp;

import java.util.ArrayList;

public class Dublicate2 {
    public static void main(String[] args) {
        // int array[]={1,2,5,2,6,1,7,1,1};
        int array[]={1000,1000,1000,1000
        };
        int n=array.length;
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int i=0;i<n;i++){  
        Integer key=array[i];
        int c=0;
        for (int j = i+1; j<n; j++) {
           
            if(array[j]==key)
            c++;
        } 
        if(c>0){
            boolean flag=true;
            for (int k = 0; k <al.size(); k++) {
            if(al.get(k).intValue()==key){
                flag=false;
                break;

            }
                
            }
            if(flag){

                System.out.println(key);
                al.add(key);
            }
        }

        }
    

}
}
