package ch07_StringManipulations;

import java.util.Scanner;

public class C10_isEmpty {
    public static void main(String[] args) {


        //Task->  2: Girilen  isim mutlaka space'den farkli en az 1 character icermediğini kontrol eden code
// create ediniz

        Scanner scan=new Scanner(System.in);
        System.out.println("İsminizi giriniz : ");
        String isim=scan.nextLine();


        if (isim.isEmpty()){
            System.out.println("isim boş geçilemez");
        } else {
            System.out.println("isim kaydı başarılı devam ediniz");
        }

        if (isim.isBlank()){
            System.out.println("isim boş geçilemez");
        } else {
            System.out.println("blank ile boşluk kabul etmez");
        }
/*
          StringIsEmpty
           String tamamen boş mu değil mi onu kontrol ediyor, sonuç true false return eder
          isEmpty Methodundan true aliyorsaniz o String'in icinde hic bir character yok demektir.
          Yani o String'in length() 0 demektir.
          length()==0 demek isEmpty() true verir demektir.
          Bir String'in bos olup olmadigini anlamak icin "length()==0" kullanmayin, "isEmpty()" kullanin

         */
        /*

        String hi = "hello";
        System.out.println(hi.isEmpty());//false

        //Task->  2 : kullanici isim girsin. siz kullancinin isim girip girmedigi kontrol edin
        //isim girdiyse devam etsin girmediyse yeniden denesin

        Scanner input =new Scanner(System.in);
        System.out.println("ismini gir");
        String name = input.nextLine();

        if (name.isEmpty()){//bosluk kabul ediyor
            System.out.println("isminizi girmeden ilerleyemezsiniz");
        }else System.out.println("hosgeldin "+name);

        if (name.isBlank()){//bosluk kabul etmez
            System.out.println("isminizi girmeden ilerleyemezsiniz blank ile");
        }else System.out.println("hosgeldin blank ile"+name);

*/
    }
}
