package com.tsps.util;

import com.tsps.common.Commons;

import java.text.ParseException;
import java.util.Date;

/**
 * @author : YongBiao Liao
 * @date : 2020/4/14 23:11
 * @description:
 * @modified :
 */
public class DateUtil {

    public static Date toDate(int year, int month, int day){
        Date date = null;
        String dateStr = year + "-" + month + "-" + day;
        try {
            date = Commons.simpleDateFormat.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

}
