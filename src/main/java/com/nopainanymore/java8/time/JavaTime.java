package com.nopainanymore.java8.time;

import java.time.*;
import java.time.temporal.TemporalAdjusters;

/**
 * java8: JavaTime
 *
 * @author nopainanymore
 * @version 2020-03-10 22:39
 */
public class JavaTime {


    public static void main(String[] args) {

        ZoneId.of("America/New_York");
        LocalDate localDate = LocalDate.now();
        LocalDate with = localDate.with(TemporalAdjusters.dayOfWeekInMonth(2, DayOfWeek.FRIDAY));
        System.out.println(with);
        Duration daylightSavings = ZoneId.of(ZoneId.SHORT_IDS.get("EST")).getRules().getDaylightSavings(Instant.now());
        System.out.println(daylightSavings);
    }
}
