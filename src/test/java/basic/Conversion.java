package basic;

public class Conversion {
    public static void main(String[] args) {
        stringToInt();
        IntToString();
    }
    public static void stringToInt(){
        String s = "100";
        System.out.println(s + 100);
        int i = Integer.parseInt(s);
        System.out.println(i + 100);
        String st = "200";
        Integer in = Integer.valueOf(st);
        System.out.println(in + 200);
        String name = "Alen";
        //Integer intt = Integer.parseInt(name);
    }

    public static void IntToString(){
        int i = 300;
        String s = String.format("%d",i);
        System.out.println(s + 100);
        // .toString
        // .valueOff
        String st = String.valueOf(i);
        System.out.println(st + 100);
        String str = Integer.toString(i);
        System.out.println(st + 100);
    }
}
