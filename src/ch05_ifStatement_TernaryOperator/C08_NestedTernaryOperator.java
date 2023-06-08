package ch05_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C08_NestedTernaryOperator {
    public static void main(String[] args) {

 /*
Kullanıcıdan alacağı ürün miktarını ve ürünün birim fiyatını alın.
 Eğer urun miktarı 100 den fazla ise %33  indirim yapıp
       ödemesi gereken toplam miktarı print eden code create ediniz.
*/


        System.out.print("Ürün miktarını giriniz =");
        Scanner scan = new Scanner(System.in);
        int miktar = scan.nextInt();

        System.out.print("Ürün birim fiyatını giriniz =");
        int birimfiyat = scan.nextInt();

        double fatura = miktar>100 ? (miktar*birimfiyat*0.67) : (miktar*birimfiyat);
        System.out.println("fatura = " + fatura);




    }

}
