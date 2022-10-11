package basic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(7);
        al.add(13);
        al.add(3);
        al.add(9);
        al.add(15);
        System.out.println(al);
        for (Integer i : al) {
            System.out.println(i);
        }
        al.add(20);
        System.out.println("Size is " + al.size());
        System.out.println("Third element is " + al.get(2));
        System.out.println("Delete is " + al.remove(2));
        System.out.println("Print new " + al);
        Collections.sort(al);
        System.out.println("My list " + al);
    }
}
