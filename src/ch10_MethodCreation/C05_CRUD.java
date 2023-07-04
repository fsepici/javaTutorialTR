package ch10_MethodCreation;

import java.util.Scanner;

public class C05_CRUD {
    static Scanner input = new Scanner(System.in);
    static String staticUserName = "";

    public static void createUser() {

        System.out.println("user name gir");
        String userName = input.nextLine();

        staticUserName = userName;

        System.out.println("create edilen userName " + userName);
        System.out.println(userName + " isimli kullanıcı sisteme kayıt oldu");
    }

    public static void getUser() {
        System.out.println("sorgulamak istediğin username gir");
        String userName = input.nextLine();
        if (userName.equals(staticUserName)) {
            System.out.println(userName + "isimli kullanıcı sistemde mevcut");
        } else System.out.println(userName + " isimli kullanıcı sistemde mevcut DEĞİL 404 not found");
    }

    public static void updateUser() {
        System.out.println("şuanki mevcut isminiz  " + staticUserName);
        System.out.println("yeni isim gir");
        String yeniIsim = input.nextLine();

        staticUserName = yeniIsim;

        System.out.println("isim güncelleme başarılı 200 ok");
        System.out.println("yeniIsminiz = " + staticUserName);

    }

    public static void deleteUser() {
        System.out.println("silmek istediğin ismi gir =");
        String silinecekIsim = input.nextLine();

        if (silinecekIsim.equals(staticUserName)) {
            System.out.println(staticUserName + " isimli kullanıcı sistemden silindi");
            staticUserName = null;

            System.out.println("silinen isim =" + silinecekIsim);


        } else System.out.println(silinecekIsim + " isimli kullanıcı sistemde mevcut değil 404 not found");

    }

    public static void cikis() {
        System.out.println("sistemden çıkış yaptınız");


    }

}
