package Esercizio3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static sun.tools.jstat.Alignment.keySet;


public class RubricaTelefonica {
    private Map<String, Integer> rubrica;

    public RubricaTelefonica() {
        rubrica = new HashMap<>();
    }

    public void inserisciContatto(String nome, int telefono) {
        rubrica.put(nome, telefono);
    }
    public void cercaPersona( int telefono) {
        rubrica.get(telefono);
    }
    public void stampaRubrica() {
        Set<String> chiavi = keySet();
        for (String chiave : chiavi) {
            System.out.println("Nome: " + chiave);
            System.out.println("Telefono: " + get(chiave));
        }
    }


    public void cancellaContatto(String nome) {
        rubrica.remove(nome);
    }





}
