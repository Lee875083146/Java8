package com.nopainanymore.java8.time;

import java.time.LocalDate;
import java.time.Period;
import java.time.Year;
import java.time.temporal.ChronoField;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

/**
 * java8: MyTemporalAdjusters
 *
 * @author nopainanymore
 * @version 2020-03-10 22:44
 */
public class MyTemporalAdjusters {

    static TemporalAdjuster nextDayOfMonth = TemporalAdjusters.ofDateAdjuster(
            temporal -> {
                int dayOfMonth = temporal.get(ChronoField.DAY_OF_MONTH);
                Temporal finalTemporal = temporal.plus(Period.ofMonths(1));
                if (dayOfMonth > 28 &&
                        !(finalTemporal.get(ChronoField.MONTH_OF_YEAR) == 2 && dayOfMonth == 29 && Year.isLeap(finalTemporal.get(ChronoField.YEAR)))) {
                    finalTemporal = finalTemporal.plus(Period.ofMonths(1)).with(ChronoField.DAY_OF_MONTH, dayOfMonth);
                }
                return LocalDate.from(finalTemporal);
            });

    // 返回正确的下个月的几号
    public static TemporalAdjuster nextDayOfMonth() {
        return temporal -> {
            int dayOfMonth = temporal.get(ChronoField.DAY_OF_MONTH);
            Temporal nextMoth = temporal.plus(Period.ofMonths(1));
            if (dayOfMonth <= 28) {
                return nextMoth;
            }
            if (nextMoth.get(ChronoField.MONTH_OF_YEAR) == 2 && dayOfMonth == 29 && Year.isLeap(nextMoth.get(ChronoField.YEAR))) {
                return nextMoth;
            }
            return nextMoth.plus(Period.ofMonths(1)).with(ChronoField.DAY_OF_MONTH, dayOfMonth);
        };
    }

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2019, 1, 29);
        LocalDate with = localDate.with(MyTemporalAdjusters.nextDayOfMonth());
        LocalDate staticMethod = localDate.with(nextDayOfMonth);
        System.out.println(with);
        System.out.println(staticMethod);
    }


}
