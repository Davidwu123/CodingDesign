package com.study.design.common;

import java.util.Calendar;
import java.util.Date;

/**
 * @author wuwei
 * @title: Utils
 * @projectName CodingDesign
 * @description: TODO
 * @date 2020-02-16 20:49
 */
public class Utils {

    public Date trimTimeFieldsToZeroOfNextDay(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DATE, 1);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTime();
    }
}
