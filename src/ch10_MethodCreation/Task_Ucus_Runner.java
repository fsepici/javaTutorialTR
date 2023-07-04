package ch10_MethodCreation;

import static ch10_MethodCreation.Task_Ucus_SwitchMethod.*;

public class Task_Ucus_Runner {
    public static void main(String[] args) {

        rota();
        yasSecim();
        yon();

        System.out.println(yonBelirt+" bilet fiyatınız =" + (yol * yas * yon * 0.1) + " $");

    }
}
