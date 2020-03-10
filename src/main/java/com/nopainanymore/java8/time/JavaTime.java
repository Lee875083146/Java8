package com.nopainanymore.java8.time;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

/**
 * java8: JavaTime
 *
 * @author nopainanymore
 * @version 2020-03-10 22:39
 */
public class JavaTime {


    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        LocalDate with = localDate.with(TemporalAdjusters.dayOfWeekInMonth(2, DayOfWeek.FRIDAY));
        System.out.println(with);
    }
}
