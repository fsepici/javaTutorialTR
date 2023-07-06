package ch16_DateTime;

import java.time.LocalDate;
import java.time.Period;

public class C08_Period {
    public static void main(String[] args) {

        LocalDate bugun=LocalDate.now();

        LocalDate birtDay=LocalDate.of(1988,8,29);

        Period fark= Period.between(birtDay,bugun);
        System.out.println("fark = " + fark);

        System.out.println("bugun.compareTo(birtDay) = " + bugun.compareTo(birtDay));

        // task-> 5.9.2022 de (9.ayin 5 i) başlayan kurs 9 ay olduguna göre bitiş tarihini print eden code create ediniz





    }
}
