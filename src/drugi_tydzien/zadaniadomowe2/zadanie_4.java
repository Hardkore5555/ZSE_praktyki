package drugi_tydzien.zadaniadomowe2;

import java.util.Random;

public class zadanie_4 {
    public static void main(String[] args) {
        String[] jedzenie = {"Placki","Frytki","Bigos","Makaron","Jajecznica","Tosty","Zupa"};
        Random x = new Random();
        int potrawy = x.nextInt(jedzenie.length);

        System.out.println("Na śniadanie zjem: "+potrawy+", na obiad: "+potrawy+", a na kolację: "+potrawy);
    }
}
