package ch19_StringBuilder;

public class C02_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb1=new StringBuilder();
        System.out.println("sb1.length() = " + sb1.length());
        System.out.println("sb1.capacity() = " + sb1.capacity());


        sb1.append("javAslan");
        System.out.println("sb1 = " + sb1);
        System.out.println("sb1.capacity() = " + sb1.capacity());

        sb1.append(" selam ").append(" nasilsin ").append(" maaşlara zam işi noldu ").append(63).append(" ").append(true);
        System.out.println("sb1 = " + sb1);
        System.out.println("sb1.capacity() = " + sb1.capacity());

        StringBuilder sb2=new StringBuilder("Tommy Lee Jones");
        System.out.println("sb2.length() = " + sb2.length());
        System.out.println("sb2.capacity() = " + sb2.capacity());
        sb2.append(" aytekin aslında tommy lee jones");
        System.out.println("sb2.length() = " + sb2.length());
        System.out.println("sb2.capacity() = " + sb2.capacity());

        sb2.trimToSize();
        System.out.println("sb2.length() = " + sb2.length());
        System.out.println("sb2.capacity() = " + sb2.capacity());

        StringBuilder sb3=new StringBuilder(11);
        System.out.println("sb3.length() = " + sb3.length());
        System.out.println("sb3.capacity() = " + sb3.capacity());
        sb3.append("Rumeysa  hanim QA");
        System.out.println("sb3.length() = " + sb3.length());
        System.out.println("sb3.capacity() = " + sb3.capacity());

        System.out.println("sb3.charAt(4) = " + sb3.charAt(4));

        System.out.println("sb1.subSequence(3,10) = " + sb1.subSequence(3, 10));
        System.out.println("sb1.substring(3,10) = " + sb1.substring(3, 10));

        System.out.println("sb1.delete(3,10) = " + sb1.delete(3, 10));
        System.out.println("sb1.deleteCharAt(6) = " + sb1.deleteCharAt(6));

        System.out.println("sb3.insert(0,\"hi\",3,5) = " + sb1.insert(0, "hello", 1, 3));

        sb3.setCharAt(5,'S');
        System.out.println("sb3 = " + sb3);

        System.out.println("sb3.replace(7,9,\"mesgul\") = " + sb3.replace(7, 9, "mesgul"));

    }
}
