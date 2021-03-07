package drugi_tydzien.zadaniadomowe2;

import java.util.Random;

public class zadanie_4 {
    public static void main(String[] args) {
        String[] jedzenie = {"Placki","Frytki","Bigos","Makaron","Jajecznica","Tosty","Zupa"};
        Random x = new Random();
        int śniadanie = x.nextInt(jedzenie.length);
        int obiad = x.nextInt(jedzenie.length);
        int kolacja = x.nextInt(jedzenie.length);

        System.out.println("Na śniadanie zjem: "+jedzenie[śniadanie]+", na obiad: "+jedzenie[obiad]+", a na kolację: "+jedzenie[kolacja]);
    }
}
