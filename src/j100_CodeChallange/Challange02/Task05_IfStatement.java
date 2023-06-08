package j100_CodeChallange.Challange02;

import java.util.Scanner;

public class Task05_IfStatement {
    public static void main(String[] args) {

/* Task->
        Girilen jobTitle data için : Eger jobTitle
        qa ise print "is unvaniniz Quality Analyst."
        dev ise print "is unvaniniz Developer."
        ba ise print "is unvaniniz Business Analyst."
        pm ise print "is unvaniniz Project Manager."
        code create ediniz...
       */
        Scanner scan = new Scanner(System.in);
        System.out.print("Ünvan kısaltmanızı giriniz = ");
        String input = scan.nextLine().toLowerCase();


        if (input.equals("qa")) {
            System.out.println("İş ünvanınız Quality Analyst");
        }
        else if (input.equals("dev")) {
            System.out.println("İş ünvanınız Developer");
        }
        else if (input.equals("ba")) {
            System.out.println("İş ünvanınız Business Analyst");
        }
        else if (input.equals("pm")) {
            System.out.println("İş ünvanınız Project Manager");
        } else {
            System.out.println("Girilen ünvan kayıtlarımızda yoktur");
        }

    }
}
