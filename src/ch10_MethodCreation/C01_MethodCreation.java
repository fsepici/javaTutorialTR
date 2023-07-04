package ch10_MethodCreation;

public class C01_MethodCreation {
    public static void main(String[] args) {


/*
    code okunabilirliği ve sadeliği için sürekli kullanılan aksiyonlar için method create edip
    main method'a call edip run etmek uygulamanın test edilmesi maintanance ve reusable açısından tercih edilir
    1) Java method'larin sadece name  değil  name + parametre'lere göre run eder
    parametre sayisi, parametre'lerin data tiplerin ve parametrelerin sırası methodu belirler.

    str.endsWith("el");   Bu method'un gorevi gidip kelimenin son kismini kontrol etmek
                          bu method'u kullanmak icin bu method'un kontrol ettikten sonra
                          bana rapor olarak ne getirdigini bilmem lazim (true/false)

    2) Bir method create edildiğinde  method'un aksiyonuna ve aksiyon çıktısı da method içinde create edilir

    3) Bir method olusturulurken  " str.indexOf(String str, int fromIndex) "
       de oldugu gibi
       disaridan kabul edecegi parametreleri ve bu parametrelerin data tiplerini
       deklare edilmeli

       method call edildiğinde  Parametre olarak
       declare edilen data tiplerine uygun value'ler (ARGUMENT)  girilmeli.
*/

        System.out.println("method creation başlıyor");
        topla();
        System.out.println("toplama(100,200) = " + toplama(100, 200));

        topla2();
    }

    private static void topla2() {


    }

    public static int toplama(int a, int b) {
        int toplam = a + b;

        return toplam;
    }

    private static void topla() {
        System.out.println("ilk creat ettiğimiz method");
        int a = 55;
        int b = 44;
        System.out.println(a + b);
        System.out.println("topla methodu çalıştı");
    }
}
