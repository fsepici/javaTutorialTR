package ch16_DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class C03_LocalDateTime {

    public static void main(String[] args) {

        LocalDateTime ldt=LocalDateTime.now();
        System.out.println("ldt = " + ldt);

        LocalDate date=LocalDate.now();
        System.out.println("date = " + date);
        LocalTime time=LocalTime.now();
        System.out.println("time = " + time);

        LocalDateTime dt=LocalDateTime.of(date,time);
        System.out.println("dt = " + dt);


    }
}
