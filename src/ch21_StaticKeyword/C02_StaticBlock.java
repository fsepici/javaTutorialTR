package ch21_StaticKeyword;

public class C02_StaticBlock {

    static String isim="safak hanım";

    static {

        System.out.println("static blok çalıştı");
    }

    public static void main(String[] args) {

        System.out.println("main method başladı");

        isim="ali bey";

        System.out.println("isim = " + isim);


    }
}
