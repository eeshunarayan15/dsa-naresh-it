package com.mainapp;

public class FindSmallestLetterGreaterThanTargetBinary744 {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
char []  letters3 ={'c','f','j'};
char target ='d';  //expected f
        char c = nextGreatestLetter(letters3, target);
//
//        Use Testcase
//        Output
//        "c"
       char [] letters = {'c','f','j'};
        char target2 = 'c';
//        Output: "f"
       char [] arr={'c', 'f', 'j'};

//        char target = 'a';
//        char c = nextGreatestLetter(arr, target);
//        char c = nextGreatestLetter(letters, target2);

        System.out.println(c);
    }
    public static char nextGreatestLetter(char[] letters, char target) {

//        for(int i=0;i<letters.length;i++){
//         if(letters[i]==target){
//             return letters[i+1];
//         }
//        }
        int lo = 0;
        int hi = letters.length - 1;
        char result =letters[lo];

        while (lo<=hi) {
            int mid = (lo + hi) / 2;
            // System.out.println(lo+""+hi+" "+arr[mid]);
            if (letters[mid]> target) {
                result = letters[mid];
                hi = mid - 1;
            } else if (letters[mid] < target) {

                lo = mid + 1;

            } else {
//                System.out.println(arr[mid]);
//                return true;
                return letters[mid+1];
            }
            // System.out.println(lo + "" + hi + " " + arr[mid]);

        }


       return result;
    }
}
