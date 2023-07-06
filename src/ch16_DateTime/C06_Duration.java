package ch16_DateTime;

import java.time.Duration;
import java.time.LocalTime;

public class C06_Duration {
    public static void main(String[] args) {

        LocalTime gece=LocalTime.of(0,17);
        LocalTime gunduz=LocalTime.of(17,30);

        Duration fark=Duration.between(gunduz,gece);

        System.out.println("fark = " + fark);


    }
}
