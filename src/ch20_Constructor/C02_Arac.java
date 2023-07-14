package ch20_Constructor;

public class C02_Arac {

    String marka;
    String model;
    int km;
    double motorHacmi;
    boolean vitesAuto;
    boolean ikinciEl;
    int yil;
    String tramer;

    public static void main(String[] args) {

        C02_Arac arac1=new C02_Arac();
        C02_Arac arac2=new C02_Arac();

        arac1.ikinciEl=true;
        arac1.marka="mercedes";
        arac1.km=50000;
        arac1.model="CLA";
        arac1.motorHacmi=2.0;
        arac1.tramer="5 kaza var";
        arac1.yil=2022;

        System.out.println("arac1 = " + arac1);


        arac2.ikinciEl=true;
        arac2.marka="hyundai";
        arac2.km=100000;
        arac2.model="Gets";
        arac2.motorHacmi=1.4;
        arac2.tramer="Allah Korusun...Amin";
        arac2.yil=2007;
        arac2.vitesAuto=true;

        System.out.println("arac2 = " + arac2);
    }

    @Override
    public String toString() {
        return "C02_Arac{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", km=" + km +
                ", motorHacmi=" + motorHacmi +
                ", vitesAuto=" + vitesAuto +
                ", ikinciEl=" + ikinciEl +
                ", yil=" + yil +
                ", tramer='" + tramer + '\'' +
                '}';
    }



}
