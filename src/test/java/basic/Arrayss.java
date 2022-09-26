package basic;

import java.util.Arrays;

public class Arrayss {
    /*
   BOLJI     int[] name = {1,2,3};
        int name [] = {1,2,3};
        int name [] = [6];
   BOLJI    int [] name = [6];
            int[] = {1,2,3};
            name[2] =3   -- uzika 3 član-a
            // 1 clan da bude 6
            // 2 clan-u da dodijelimo 7
            // 3 clan da bude 8
            // 4 clan da bude 15
            // 5 clan da bude 28
            // 6 clan da bude 43
            STAMPA NIZOVA -
            1. for petlja
            for(int i=0 ; i < lottoTicket.lenght; i++) {
            sout (lottoTicket[i]);
            2. enhancer for;
            for(element:array) statement
            for(lt : lottoTicket)
            sout (lt);
            3. sout(Arrays.toString(array);
            test test

     */
    public static void main(String[] args) {
        int [] lottoTicket = new int [6];
       lottoTicket[0] = 7;
       lottoTicket[1] = 6;
       lottoTicket[2] = 8;
       lottoTicket[3] = 15;
       lottoTicket[4] = 43;
       lottoTicket[5] = 28;
        for (int j : lottoTicket) {
            System.out.println(j);
        }
        System.out.println(Arrays.toString(lottoTicket));
        //SORTIRANJE - .sort() ; Arrays.sort(arrayToSort);
        Arrays.sort(lottoTicket);
        for (int j : lottoTicket) {
            System.out.println(j);
        }
        // { 100.550,12,17,1,19}
        // Ako u nizu ima broj > 100 ; print "Imam brojeva vecih od 100")
        // Ako nema ; print "Svi brojevi su manji od 100")
        int[] number = {88,15,12,17,1,19};
        for (int j : number){

            if ( j > 100) {
                System.out.println("Ima brojeva vecih od 100");
            }
            }
        }

    }

