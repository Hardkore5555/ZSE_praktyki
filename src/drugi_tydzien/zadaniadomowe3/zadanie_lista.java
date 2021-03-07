package drugi_tydzien.zadaniadomowe3;

import java.util.ArrayList;
import java.util.Collections;

public class zadanie_lista {
    public static void main(String[] args) {
        ArrayList<String> lista_owocow2 = new ArrayList<>();
        //Dodanie nowego obiektu do listy
        lista_owocow2.add("Marchew");
        lista_owocow2.add("Pomidor");
        lista_owocow2.add("Ogórek");
        lista_owocow2.add("Por");
        System.out.println(lista_owocow2);
        //Dodanie nowego obiektu do listy na indeks
        lista_owocow2.add(1,"Seler");
        System.out.println(lista_owocow2);
        //Usuwanie obiektu z listy
        lista_owocow2.remove("Ziemniak");
        lista_owocow2.remove(2);
        System.out.println(lista_owocow2);
        //Nadpisywanie obiektów w liście
        lista_owocow2.set(0,"Papryka");
        System.out.println(lista_owocow2);
        //Sortowanie listy
        Collections.sort(lista_owocow2);
        System.out.println(lista_owocow2);
        //Czyszczenie listy
        lista_owocow2.clear();
        System.out.println(lista_owocow2);



    }
}
