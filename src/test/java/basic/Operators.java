package basic;


public class Operators {
    /*
Aritimetički operatori
+
-
*
/
%
^
Unarni operatori
+
-
++
--
! - za boolean se koristi -> kontra

    */
    public static void main(String[] args) {
        int a=10;
        int b=5;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        int x = 10;
        System.out.println(x++);
        System.out.println(++x);
        System.out.println(x--);
        System.out.println(--x);

        int c = 10;
        int d = 10;
        System.out.println(c++ + ++c);
        System.out.println(d++ + d++);

        boolean isTrue = true;
        boolean isFalse = false;
        System.out.println(!isTrue);
        System.out.println(!isFalse);
    }

}
