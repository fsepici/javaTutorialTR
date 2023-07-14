package ch21_StaticKeyword;

public class C01_OgretmenRunner {
    public static void main(String[] args) {

        C01_Ogretmen.okul="tayyar mehmet pasa okulu";
        C01_Ogretmen ogretmen=new C01_Ogretmen("mustafa bey",35);
        System.out.println("ogretmen = " + ogretmen);
        System.out.println("ogretmen.isim = " + ogretmen.isim);
        System.out.println("ogretmen.tecrube = " + ogretmen.tecrube);
        System.out.println("ogretmen.okul = " + ogretmen.okul);

        System.out.println("C01_Ogretmen.okul = " + C01_Ogretmen.okul);

        C01_Ogretmen.maasHesapla();

        ogretmen.evlilikYilDonumu();
    }

}
