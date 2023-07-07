package ch18_ImmutableClass;

public class C03_OCA_equals {
    public static void main(String[] args) {

        String a="";

        String c="2cfalse";
        a+=2;
        a+='c';
        a+=false;

        System.out.println("a = " + a);
        String b="2cfalse";
        String z=new String("2cfalse");
        System.out.println("b = " + b);

        if (a==b){
            System.out.println("a== calışır mı");
        }
        if (a=="2cfalse"){
            System.out.println("a== calışır mı");
        }
        if (c==b){
            System.out.println("a== calışır mı");
        }
        if (c==z){
            System.out.println("a== calışır mı");
        }
        if (a.equals("2cfalse")){
            System.out.println("eguals   a== calışır mı");
        }

    }
}
