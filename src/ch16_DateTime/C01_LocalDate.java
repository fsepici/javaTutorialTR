package ch16_DateTime;

import java.time.LocalDate;

public class C01_LocalDate {
    public static void main(String[] args) {

        LocalDate bugun=LocalDate.now();
        System.out.println("bugun = " + bugun);
        System.out.println("bugun.isLeapYear() = " + bugun.isLeapYear());
        System.out.println("bugun.getEra() = " + bugun.getEra());
        System.out.println("bugun.getYear() = " + bugun.getYear());
        System.out.println("bugun.getDayOfYear() = " + bugun.getDayOfYear());

        LocalDate date1=LocalDate.of(1985,6,24);
        LocalDate date2=LocalDate.of(1988,8,29);

        System.out.println("date1 = " + date1);

        System.out.println("date1.plusDays(300) = " + date1.plusDays(300));
        System.out.println("date2.minusDays(300) = " + date2.minusDays(300));
        System.out.println("date1.minusMonths(3).plusWeeks(25) = " + date1.minusMonths(3).plusWeeks(25));

    }
}
