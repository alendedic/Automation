package basic;

public class DataTypes {
    /*
    Primitivni
    int -> 0 -> -2^128 -> 2^128
    short
    byte
    double -> 0.0d -> do 16 decimala
    float -> 0.0f -> preko 16 decimala
    char - 1 slovo/1 karakter -> 2bytes(ćčšđ) -> '\u0000' '\uffff'   0 -> 65535
    long - 0l
    boolean - True/False
     */

    /*
    NonPrimitivni
    sring -> Čuva smisao, -> String stringName = "actualStraning"
    array > [ s, o, nj, a  ] ideksi pojedinačno 0.++
    class
    object
     */

    public static void main(String[] args) {
        boolean trueValue = true;
        double payment = 843.50;
        int years = 28;
        char  firstLatter = 'A';
        int debt = -27640 ;
        System.out.println("This is " + trueValue);
        System.out.println("Your payment is " + payment);
        System.out.println("You are " +years + " years old ");
        System.out.println("Your name starts with letter " + firstLatter);
        System.out.println("You are left with " + debt + "$");

        double a=2;
        double b=4;
        double c=4;
        double average = (a+b+c) / 3;
        System.out.println("Average is " + average);


    }
    }


