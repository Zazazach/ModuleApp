package com.jjldxz.moduleapp;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class ZachUtil {

    public static String getTime(){
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getTimeZone("GMT+8:00"));
        return  (""+calendar.get(Calendar.YEAR))+(""+(calendar.get(Calendar.MONTH) + 1))+(""+calendar.get(Calendar.DAY_OF_MONTH));
    }
}
