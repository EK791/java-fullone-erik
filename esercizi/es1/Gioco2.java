package esercizi.es1;

import java.util.Scanner;


public class Gioco2 {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        String str = "12345";
        int conteggio = 0;
        boolean corretto = false;


        while (conteggio < 3 && corretto == false) {
            conteggio++;
            System.out.println("Inserisci 5 numeri: ");
            String parola = reader.nextLine();

            int cont = 0;
            int a = 0;

            if (parola.equalsIgnoreCase(str)) {
                System.out.println("Il numero è corretto");
                corretto = true;
                for (int i = 0; i < parola.length(); i++) {
                    a += Integer.parseInt(String.valueOf(parola.charAt(i)));
                }
            } else {
                System.out.println("I numeri in posizione corretta sono: ");
                for (int i = 0; i < parola.length(); i++) {
                    cont++;
                    if (parola.charAt(i) == str.charAt(i)) {

                        a += Integer.parseInt(String.valueOf(parola.charAt(i)));
                        System.out.print(parola.charAt(i));
                        System.out.println(" e si trova in posizione " + cont);
                    }
                }
            }
            System.out.println("La somma dei numeri è: " + a);
            if (conteggio == 3) {
                System.out.println("Hai perso");
            }
        }
    }
}