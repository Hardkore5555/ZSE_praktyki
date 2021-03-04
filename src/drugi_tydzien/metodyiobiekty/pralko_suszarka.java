package drugi_tydzien.metodyiobiekty;

interface Suszarka {
    void szuszeniePrania();
}
interface Pralka {
    void pranieBawelny();
    void praniePoscieli();
    void pranieUbran();
}


public class pralko_suszarka implements Pralka, Suszarka {

    private int czas;
    private int temperatura;
    private int wirowanie;

    private void wlacz(){
        System.out.println("Wlaczamy pralkoSuszarke "+
                            " ustawiamy temperature na: "+ temperatura
                               +" stopni, wirowanie: "+wirowanie+
                                 " obrotów i czas trwania na: "+ czas+" minut");

    }

    @Override
    public void szuszeniePrania() {
        czas = 135;
        temperatura = 50;
        wirowanie = 1000;
        wlacz();
    }

    @Override
    public void pranieBawelny() {
        czas = 65;
        temperatura = 30;
        wirowanie = 600;
        wlacz();
    }

    @Override
    public void praniePoscieli() {
        czas = 80;
        temperatura = 50;
        wirowanie = 1200;
        wlacz();
    }

    @Override
    public void pranieUbran() {
        czas = 120;
        temperatura = 60;
        wirowanie = 1000;
        wlacz();


    }

    public static void main(String[] args) {
        pralko_suszarka pralkoSuszarka = new pralko_suszarka();

        Suszarka suszarka = pralkoSuszarka;
        Pralka pralka = pralkoSuszarka;

        suszarka.szuszeniePrania();
        pralka.pranieBawelny();
        pralka.praniePoscieli();
        pralka.pranieUbran();
    }
}
