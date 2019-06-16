package com.itheima.ssm;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TypeUtils {
    public static String date2String(Date date, String format) throws Exception{
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        String dateStr = simpleDateFormat.format(date);
        return dateStr;
    }

    public static Date String2Date(String dateStr, String fromat) throws Exception {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(fromat);
        Date date = simpleDateFormat.parse(dateStr);
        return date;
    }
}
