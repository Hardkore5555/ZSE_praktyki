package drugi_tydzien.piec;

public class zadanie_piec {

    interface piecPiekacz {
        void pieczenieChleba();

        void pieczenieCiastek();
    }

    interface piecGrill {
        void grillKurczak();
    }

    public static class Piece implements piecPiekacz, piecGrill {
        private int temp;
        private int czas;

        @Override
        public void pieczenieChleba() {
            temp = 377;
            czas = 60;
            wlaczPiec();
        }

        @Override
        public void pieczenieCiastek() {
            temp = 130;
            czas = 400;
            wlaczPiec();
        }

        @Override
        public void grillKurczak() {
            temp = 650;
            czas = 1200;
            wlaczPiec();
        }

        private void wlaczPiec() {
            System.out.println("Włączamy piece i " + "ustawiamy temperature na: " + temp + " stopni, " + "czas na: " + czas + " sekund");
        }

        public static void main(String[] args) {
            Piece Piece = new Piece();
            piecGrill piecGrill = Piece;
            piecPiekacz piecPiekacz = Piece;

            piecPiekacz.pieczenieChleba();
            piecPiekacz.pieczenieCiastek();
            piecGrill.grillKurczak();

        }
    }
}


