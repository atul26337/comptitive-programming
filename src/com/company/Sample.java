package com.company;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Sample {
    public static void main(String args[]){
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
        Date now = new Date();
        String date1=df.format(now);
        System.out.println(date1);
    }
}
