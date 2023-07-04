package ch10_MethodCreation;

import java.util.Scanner;

import static ch10_MethodCreation.C05_CRUD.createUser;

public class C05_SwitchCaseMethod {

    public static void menu(){

        System.out.println("menü");
        System.out.println("uygulamaya kayıt olmak için 1 \nkullanıcı sorgulamak için 2 " +
                "\nkullanıcı bilgi güncellemek için 3 " +
                "\nkayıt silme için 4 \nçıkış işlemi için 5 e basınız");

        Scanner in=new Scanner(System.in);
        int secim=in.nextInt();

        switch (secim){
            case 1:
                createUser();
                menu();
                break;
            case 2:
                C05_CRUD.getUser();
                menu();
                break;
            case 3:
                C05_CRUD.updateUser();
                menu();
                break;
            case 4:
                C05_CRUD.deleteUser();
                menu();
                break;
            case 5:
                C05_CRUD.cikis();
                break;
            default:
                System.out.println("hatalı bir seçim yaptınız");
                menu();
                break;
        }


    }
}
