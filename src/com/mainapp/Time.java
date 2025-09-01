package com.mainapp;

public class Time {
    public static void main(String[] args) {
        String time="07:45:55:PM";
       String res= formatTime(time);
        System.out.println(res);
    }

    private static String formatTime(String time) {
      //  String time="07:45:55:PM";


        String hour = time.substring(0, 2);
        String minute =time.substring(3,5);
        String second =time.substring(6,8);
        String ampm=time.substring(9,11);

        int hours=Integer.parseInt(hour);
        if(ampm.equals("AM")){
           if(hours==12)
            hours=  0;
        }else{
           if(hours!=12){
               hours+=12;
           }
        }
        String format = String.format("%02d", hours);

        String convertedtime=format+":"+minute+":"+second;
        return convertedtime;
    }
}
