package basic;

public class AssigmentOperators {
    /*
    a += b  == a=a+b
    a+=5 = a+5

     */
    public static void main(String[] args) {
        int e=10;
        int f=20;
        System.out.println(e+=5);
        System.out.println(f-=4);

        int g=3;
        System.out.println(g+=7);
        System.out.println(g-=4);
        System.out.println(g*=2);
        System.out.println(g/=12);
    }

}
