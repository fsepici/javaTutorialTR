package j100_CodeChallange.project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MarketProject {
    /* TASK :
     * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
     * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
     * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
     * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
     *
     * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
     * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
     * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
     * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
     * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
     * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
     * 			 ortalama kazançtan yüksekse o günleri return yap.
     * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
     * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
     * 			 ortalama kazançtan aşağıysa o günleri return yap.
     * */

    static ArrayList<String> gunler = new ArrayList<>(Arrays.asList(" p.tesi", " salı", " çarşamba", " perşembe", " cuma", " c.tesi", " pazar"));
    static ArrayList<Double> gunlukKazanclar = new ArrayList<>();
    static double haftaninToplamKazanci = 0;

    static Scanner scan = new Scanner(System.in);


    public static void main(String[] args) {
        int gun = 0;
        while (gun < 7) {
            System.out.println(gunler.get(gun) + " günü hasılatını giriniz = ");
            double gununKazancı = scan.nextInt();
            gunlukKazanclar.add(gununKazancı);
            haftaninToplamKazanci += gununKazancı;
            gun++;
        }
        System.out.println("Haftanın Ortalaması = " + getOrtalamaKazanc());
        System.out.println("ortalamanınUstundeKazancGunleri() = " + ortalamanınUstundeKazancGunleri());
        System.out.println("ortalamanınAltındaKazancGunleri() = " + ortalamanınAltındaKazancGunleri());

    }// main sonu

    private static ArrayList<String> ortalamanınAltındaKazancGunleri() {
        ArrayList<String> ortalamanAltıGun = new ArrayList<>();
        for (int i = 0; i < gunlukKazanclar.size(); i++) {
            if (gunlukKazanclar.get(i) < getOrtalamaKazanc()) {
                ortalamanAltıGun.add(gunler.get(i));

            }

        }
        return ortalamanAltıGun;

    }

    private static ArrayList<String> ortalamanınUstundeKazancGunleri() {
        ArrayList<String> ortalamanUstuGun =new ArrayList<>();
        for (int i = 0; i < gunlukKazanclar.size(); i++) {
            if (gunlukKazanclar.get(i) > getOrtalamaKazanc()) {
                ortalamanUstuGun.add(gunler.get(i));

            }

        }
        return ortalamanUstuGun;
    }

    public static double getOrtalamaKazanc() {

        return haftaninToplamKazanci / 7;
    }
}
