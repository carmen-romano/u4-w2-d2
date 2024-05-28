package Esercizio2;

import java.util.*;

public class Es2 {
    public static void main(String[] args) {

        ///1
        List<Integer> randomNumber = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci il numero di elementi da generare: ");
        int numElementi = scanner.nextInt();

        Random random = new Random();

        for (int i = 0; i < numElementi; i++) {
            int numeroCasuale = random.nextInt(100);
            randomNumber.add(numeroCasuale);
        }
        Collections.sort(randomNumber);
        System.out.println("Lista ordinata:");
        for (int numero : randomNumber) {
            System.out.println(numero);
        }

        System.out.println("--------------------------");
        ///2

        List<Integer> nuovaLista = new ArrayList<>(randomNumber);
        Collections.reverse(nuovaLista);

        System.out.println("Lista inversa:");
        for (int numero : nuovaLista) {
            System.out.println(numero);
        }

        System.out.println("--------------------------");

    ///3
        pariOdispari(nuovaLista, false);
    }
    ///3
    public static void pariOdispari(List<Integer> lista, boolean trueOrfalse) {
       int numPariDispari =  trueOrfalse ? 0 : 1;
       String pariDispari = trueOrfalse ? "pari: ":"dispari: ";
        System.out.print("Lista numeri " + pariDispari );
            for (int numero : lista) {
                if (numero % 2 == numPariDispari ) {
                    System.out.print("-" + numero);
                }
            }
        }
}
