package com.mainapp.Bitwise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SingleNumber2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        String s[]=br.readLine().split(" ");
        int ar[]=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=Integer.parseInt(s[i]);
        }
        //to find the xox
        // all the element of an array
        int x=0;
        for(int i=0;i<n;i++){
            x=x^ar[i]^(i+1);
        }
        int b=0;
        for(int i=1;i<31;i++){
           if(checkBit(x,i)==true){
            b=i;
            break;
           }
        }
        int p=0; 
        int q=0;
        for(int i=0;i<n;i++){
            if(checkBit(ar[i],b)){
                //add it to the A
                p=p^ar[i];
            }else{
                //add it to the b
                q=q^ar[i];
            }
          
            System.out.println(p+" "+q);

        }
    }

    private static boolean checkBit(int n, int i) {
        return ((n>>i)&1)==1;
    }

}
