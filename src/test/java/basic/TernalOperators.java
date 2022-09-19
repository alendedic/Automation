package basic;

import org.w3c.dom.ls.LSOutput;

public class TernalOperators {
    public static final int B = 10;

    /*
        condition ? ifTrue : ifFalse
        ako je uslov ispunjen pisi TRUE ako nije onda FALSE
         */
    public static void main(String[] args) {
        int m=5;
        int n= 10;
        String trueMessage = "true";
        String falseMessage = "false";

        System.out.println(m > n ? trueMessage : falseMessage);
        System.out.println(m > n ? m : n);
    }
}
