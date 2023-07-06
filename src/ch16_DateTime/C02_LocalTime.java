package ch16_DateTime;

import java.time.LocalTime;

public class C02_LocalTime {
    public static void main(String[] args) {

        LocalTime suan=LocalTime.now();
        System.out.println("suan = " + suan);
        LocalTime suan2=LocalTime.of(13,55,55);
        System.out.println("suan2 = " + suan2);

        System.out.println("suan2.plusNanos(12542115) = " + suan2.plusNanos(12542115768L));

        System.out.println("**************Hız Testi*******************");

        LocalTime forLoopBasi=LocalTime.now();
        System.out.println("forLoopBasi.getNano() = " + forLoopBasi.getNano());

        int toplam=0;
        for (int i = 0; i <1000000; i++) {
            toplam+=i;


        }
        System.out.println("toplam = " + toplam);
        LocalTime forLoopSonu=LocalTime.now();

        System.out.println("forLoopSonu = " + forLoopSonu);

        System.out.println("Fark nano="+(forLoopSonu.getNano()-forLoopBasi.getNano()));


    }
}
