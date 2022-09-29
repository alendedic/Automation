package basic;
public class Method {
    public static void main(String[] args) {
        printName("Alen");
        String name = printName1("Alen");
        System.out.println(name + " je moje ime");
        calculate(6,3);
        calculate(10,5,2);
        Method method = new Method();
        method.greetMe();
    }
    public static void printName(String n) {
        System.out.println(n);
    }

    public static String printName1(String n) {
        System.out.println(n);
        return n;
    }

    public static void calculate(int a,int b) {
        System.out.println(a + b);
        System.out.println(a - b);
    }

    public static void calculate(int a, int b, int c) {
        System.out.println(a + b + c);
        System.out.println(a - b - c);
    }

    public void greetMe() {
        System.out.println("Hello");
    }
}

