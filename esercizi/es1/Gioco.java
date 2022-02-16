package esercizi.es1;

import java.util.Scanner;

public class Gioco{
    public static void main(String[] args){


            Scanner reader = new Scanner(System.in);
            int numeri[] = {3, 4, 5, 6, 7};
            int numInseriti[] = new int[5];

            System.out.println("Inserisci 5 numeri: ");

            int cont = 1;
            for (int i = 0; i < numInseriti.length; i++) {
                System.out.println("Inserisci il numero " + cont + ": ");
                numInseriti[i] = reader.nextInt();
                cont++;
            }

            cont = 0;
            for (int i = 0; i < numInseriti.length; i++) {
                if (numInseriti[i] == numeri[i]) {
                    cont++;
                }
            }

            int numeriUguali[] = new int[cont];
            int contatore = 0;
            for (int i = 0; i < numInseriti.length; i++) {
                if (numInseriti[i] == numeri[i]) {
                    numeriUguali[contatore] = numeri[i];
                    contatore++;

                }
            }

            if (cont == 0) {
                System.out.println("Non ci sono numeri uguali");
            } else {
                System.out.println("I numeri uguali sono i seguenti: ");
                for (int i = 0; i < numeriUguali.length; i++) {
                    System.out.println(numeriUguali[i]);
                }
            }
        }
    }
    //il gioco è stato eseguito senza l'utilizzo di substring oppure charAt. Sicuramente si può migliorare, nel caso
    //riuscissi a ritargli un attimo per riguardarlo farò un commit con la nuova versione.