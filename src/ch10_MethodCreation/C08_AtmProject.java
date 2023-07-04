package ch10_MethodCreation;

import java.util.Scanner;

import static ch10_MethodCreation.C05_CRUD.cikis;

public class C08_AtmProject {  // ******bu class ayrı classlara ayırınız

    static Scanner input = new Scanner(System.in);
    static String password = "1234a.";
    static double bakiye = 1000.25;
    static int count = 3;


    public static void main(String[] args) {
        sifreKontrol();

    }

    private static void sifreKontrol() {

        System.out.println("*********************");
        System.out.println("*****Bankamıza Hoşgeldiniz*****");
        System.out.println("Şifrenizi giriniz");

        String sifre = input.nextLine();

        while (count > 1) {
            if (sifre.equals(password)) {
                anaMenu();//sifre dogru ise ana menuye yonlendir
                break;
            } else {
                System.out.println("sifre eslesmedi tekrar deene");
                sifre = input.nextLine();
                count--;
                if (count == 0) {
                    System.out.println("kart bloke oldu");
                    break;
                }
            }
        }

    }


    private static void anaMenu() {
        System.out.println("bakiye sorgulama icin 1 \npara yatirma icin 2 \npara cekme icin 3\n" +
                " cikis icin 4 e basiniz");

        int secim = input.nextInt();

        switch (secim) {
            case 1:
                bakiyeSorgula();
                anaMenu();
                break;
            case 2:
                paraYatir();
                anaMenu();
                break;
            case 3:
                paraCekme();
                anaMenu();
                break;
            case 4:
                cikis();
                break;

            default:
                System.out.println("hatali secim yaptiniz tekrar deneyin");
                anaMenu();
                break;

        }


    }

    private static void paraCekme() {
        System.out.println("güncel bakiyeniz = " + bakiye);
        System.out.println("nekadar çekmek istersiniz");
        double cekMiktar = input.nextDouble();

        if (cekMiktar > bakiye) {
            System.out.println("bakiyen yetersiz");
        } else {
            System.out.println("çekmek istediğiniz miktar" + cekMiktar);
            System.out.println("bu tutarı onaylıyormusunuz?");
            // ****onay task
            bakiye -= cekMiktar;
            System.out.println("güncel bakiye = " + bakiye);
        }
    }

    private static void paraYatir() {
        System.out.println("güncel bakiyeniz = " + bakiye);
        System.out.println("nekadar yatırmak istersiniz");
        double yatirMiktar = input.nextDouble();
        bakiye += yatirMiktar;
        System.out.println("para yatırma işleminden sonra güncel bakiye = " + bakiye);


    }

    private static void bakiyeSorgula() {

        System.out.println("güncel bakiyeniz = " + bakiye);
    }
}
