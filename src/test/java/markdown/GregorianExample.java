package markdown;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class GregorianExample {
    public static void main(String[] args) {
        GregorianCalendar gc = new GregorianCalendar();
        System.out.println("Just object " + gc);
        GregorianCalendar ymd = new GregorianCalendar(2023,9,30);
        System.out.println("Future " + ymd);
        GregorianCalendar yMd = new GregorianCalendar(2030, Calendar.SEPTEMBER,30);
        System.out.println("Month " + yMd);
        GregorianCalendar wholeDate = new GregorianCalendar(2011,2,31,15,30,45);
        System.out.println("All date " + wholeDate);
        int month = wholeDate.get(Calendar.MONTH);
        int year = wholeDate.get(Calendar.YEAR);
        int day = wholeDate.get(Calendar.DAY_OF_MONTH);
        int hour = wholeDate.get(Calendar.HOUR);
        int minute = wholeDate.get(Calendar.MINUTE);
        int second = wholeDate.get(Calendar.SECOND);
        System.out.println("This date is " +day +"." +month+ "." +year + " " +hour +":" +minute +":" +second);
        GregorianCalendar deadline = new GregorianCalendar();
        deadline.set(2022,5,5);
        System.out.println(deadline);
        System.out.println("Only time "+ deadline.getTime());
        deadline.add(Calendar.DATE,5);
        System.out.println(deadline.getTime());
        deadline.add(Calendar.DATE, -10);
        System.out.println(deadline.getTime());
        // pogledati file current.java
    }
}
