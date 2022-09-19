package basic;

public class LogicalOperators {
    /*
    && (logicno i)
    II (logicno or)
    !  (logicno NOT)
    vraća boolean!
     */
    public static void main(String[] args) {
        int j=10;
        int k=5;
        int l=20;

        System.out.println(j==k && k<l);
        System.out.println(j!=k || k==5);
        System.out.println(k<j && k<l);
        System.out.println(k>j && l++<j);
        System.out.println(l);

    }
}
