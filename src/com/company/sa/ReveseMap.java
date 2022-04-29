package com.company.sa;

import java.io.*;
import java.util.Calendar;

public class ReveseMap {

}
class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        Calendar c = Calendar.getInstance();
        c.set(Integer.valueOf(year), (Integer.valueOf(month) - 1), Integer.valueOf(day));
        int a=c.get(Calendar.DAY_OF_WEEK);
        String day1 =null;
        switch (a){
            case 0:
                day1="SUNDAY";
            break;
            case 1:
                day1="MONDAY";
                break;
            case 2:
                day1="TUESDAY";
                break;

            case 3:
                day1="WEDNESDAY";
                break;

            case 4:
                day1="THURSDAY";
                break;

            case 5:
                day1="FRIDAY";
                break;

            case 6:
                day1="SATURDAY";
                break;

        }
        return day1;
    }
    public static void main(String[] args) throws IOException {

        System.out.println(Result.findDay(8, 05 ,2015));
    }

}
