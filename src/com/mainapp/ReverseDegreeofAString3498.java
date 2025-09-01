package com.mainapp;
public class ReverseDegreeofAString3498 {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
//        Input: s = "abc"
//
//        Output: 148
       String s2= "zaza";
        int i = reverseDegree(s2);
    }
    public static int reverseDegree(String s) {
//        int a =26;
//        int z=1;

//        char [] arr=s.toCharArray();
//        Arrays.sort(arr);

//        System.out.println(Arrays.toString(arr));
//        [a, a, z, z]
    int reverseDegree=0;
for(int j=0;j<s.length();j++){
    char c = s.charAt(j);
 
    int reversevalue= 26-(c-'a');
    int power =j+1;
  reverseDegree+=reversevalue*power;


}

        System.out.println(reverseDegree);
  return  reverseDegree;
    }
}
