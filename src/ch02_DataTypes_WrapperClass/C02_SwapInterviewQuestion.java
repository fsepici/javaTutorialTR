package ch02_DataTypes_WrapperClass;

class C02_SwapInterviewQuestion2 {
    public static void main(String[] args) {

        int sayi1 = 20;
        int sayi2 = 34;
        sayi1=sayi2+sayi1;
        sayi2 = sayi1-sayi2;
        sayi1 = sayi1-sayi2;
        System.out.println("sayi1 = " + sayi1);
        System.out.println("sayi2 = " + sayi2);


    }
}
