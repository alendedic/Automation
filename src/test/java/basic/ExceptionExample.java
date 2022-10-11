package basic;

public class ExceptionExample {
    public static void main(String[] args) {
        arithmeticsException();
        nullException();
        arrayException();
        try {
            String n = null;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static void arithmeticsException() {
    try{
        int data = 100/0;
    }catch(ArithmeticException e){
        System.out.println(e);
    }
}
    public static void nullException() {
        try{
            String s = null;
            System.out.println(s.length());
        }catch (NullPointerException d){
            System.out.println(d);
        }
}
    public static void arrayException() {
        try{
            int[] a = new int[5];
            a[10] = 15;
        } catch (IndexOutOfBoundsException t){
        System.out.println(t);
    }
}
}