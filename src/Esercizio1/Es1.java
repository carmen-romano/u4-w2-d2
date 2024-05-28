package Esercizio1;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Es1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci un numero:");
        int numeroUtente = scanner.nextInt();
        scanner.nextLine();
        Set<String> userChoose = new HashSet<>();

        for (int i = 0; i < numeroUtente; i++) {
            System.out.println("Inserisci la parola n. " + (i + 1) + ":");
            String paroleUtente = scanner.nextLine();
            if (userChoose.contains(paroleUtente))
                System.out.println("parola duplicata: "+paroleUtente);

            userChoose.add(paroleUtente);

        }

        System.out.println("Numero parole distinte: " + userChoose.size());
        System.out.println("Elenco parole distinte: ");
        for (String parola : userChoose) {
            System.out.println(parola);
        }
    }
}



