package j100_CodeChallange.Challange01;

public class Task03_PrimitiveDataType {
    public static void main(String[] args) {

        /*
  * Primitive data type
         byte: only takes whole numbers
    short: only takes whole numbers
    int(used more often): only takes whole numbers
    long: only takes whole numbers

    float: can take decimals (MUST have F or f at the end)
    double( used more often): can take decimals

    boolean: true or false boolean expressions
    char: character within single quote ''
          also takes number
  * Range: double > float >long > int >short > byte
  * !!! soutv degeri ile yazdirma
  */

//byte, short, integer,long, double, float veri tiplerinin max ve min degerlerini yazdiralim.


        //Her veri turuyle bir tane olmak uzere 4 degisken olusturun (float, double, char, boolean)
        //Degiskenler icin anlamli isimler kullanip, yazdiralim
        byte byteMinValue=Byte.MIN_VALUE;
        System.out.println("byteMinValue = " + byteMinValue);
        byte byteMaxValue=Byte.MAX_VALUE;
        System.out.println("byteMaxValue = " + byteMaxValue);
        short shortMinValue=Short.MIN_VALUE;
        System.out.println("shortMinValue = " + shortMinValue);
        short shortMaxValue=Short.MAX_VALUE;
        System.out.println("shortMaxValue = " + shortMaxValue);

        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);
        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
        System.out.println("Long.MIN_VALUE = " + Long.MIN_VALUE);
        System.out.println("Long.MIN_VALUE = " + Long.MIN_VALUE);
        System.out.println("Float.MIN_VALUE = " + Float.MIN_VALUE);
        System.out.println("Float.MAX_VALUE = " + Float.MAX_VALUE);
        System.out.println("Double.MIN_VALUE = " + Double.MIN_VALUE);
        System.out.println("Double.MAX_VALUE = " + Double.MAX_VALUE);

      float zeynepHanimId=1453.571F;
      double fitnatSena=1905.1907;
      char sampiyon='G';
      boolean cimbomIsChampion=true;
        System.out.println("zeynepHanimId = " + zeynepHanimId);
        System.out.println("fitnatSena = " + fitnatSena);
        System.out.println("sampiyon = " + sampiyon);
        System.out.println("cimbomIsChampion = " + cimbomIsChampion);

    }
}
