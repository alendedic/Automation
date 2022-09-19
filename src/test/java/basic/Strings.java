package basic;

import java.util.Locale;

public class Strings {
    /*
    String name = "Nina"
    name1 = name + "Đekić"
    StringBuilder = name.reverse();
    "Java" --> J  a   v   a
    -----------------------
  String city = "Podgorica";
        String cityShort = city.substring(0,3);
        Rješenje P G

     */
    public static void main(String[] args) {
      /*
      String country = "Montenegro";
      String monte = country.substring(0,5);
      String negro = country.substring(5,10);
        System.out.println(monte);
        System.out.println(negro);
        String monteput = monte + "put";
        System.out.println(monteput);
        String bomboneNegro = "bombone" + negro;
        System.out.println(bomboneNegro);
        String name = "Alen";
        String surname = "Dedić";
        String age = "26";
        System.out.println(name +" "+surname + " "+ age);
        String surname1 = "Dedić";
        if(surname.equals(surname1)){
          System.out.println("Nisu");
          else{
            System.out.println("Jesu");
          }
        } (/

       */
      /*
      String e = "";
      String n = null;
      String space = " ";
      if(e.length() == 0 || e.equals(space)){
      else{
        }
} */
      String amp = "Amplitudo";
      char firstLetter = amp.charAt(5);
        System.out.println(firstLetter);
        System.out.println(amp.contains("MPLI"));
        System.out.println(amp.toLowerCase());
        System.out.println(amp.toUpperCase());
        System.out.println(amp.equalsIgnoreCase(amp.toUpperCase()));
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.append(amp).reverse());
        /*
        Split
        .split()
        Ja sam Alen. Radim u Amplitudu skoro 3 godine.
         */
        String recenica = "Ja sam Alen.Radim u Amplitudu skoro tri godine";
        int number = recenica.split(" ").length;
        System.out.println("Broj riječi u rečenici je " + number);
    }
}