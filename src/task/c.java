package task;

public class c {
    public static void main(String[] args) {
        String str="Ahmet";
       String ksrt=str.toLowerCase();

       String bstr=ksrt.replace("a","");
       String estr=bstr.replace("e","a");
        System.out.println( estr.replace("", "e"));

    }
}
