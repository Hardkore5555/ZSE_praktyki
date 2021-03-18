package PROjekt;
// Autorzy: Krystian Lewandowski, Adrian Sobierajski
import java.util.Scanner;

public class Projekt {
    public static void main(String[] args) {
        int x = 0;
        Scanner skaner = new Scanner(System.in);
        System.out.println("ODPOWIEDZI PISAC DUZYMI LITERAMI np.A");
        System.out.println("Pytanie 1: Ile złotych medali olimpijskich zdobył Adam Małysz?\n" +
                "A)0\n" +
                "B)1\n" +
                "C)2\n" +
                "D)3");


        char odpowiedzi1 = skaner.next().charAt(0);
        switch (odpowiedzi1) {
            case 'A':
                System.out.println("zła odpowiedź");
                break;
            case 'B':
                System.out.println("dobra odpowiedź");
                x = x + 1;
                break;
            case 'C':
                System.out.println("zła odpowiedź");
                break;
            case 'D':
                System.out.println("zła odpowiedź");
                break;
            default:
                System.out.println("Wprowadzono zły znak");
        }
        System.out.println("Pytanie 2: .Pęd w fizyce oblicza się mnożąc prędkość przez:\n" +
                "A)czas\n" +
                "B)mase\n" +
                "C)prace\n" +
                "D)moc" +
                "                 ");
        char odpowiedzi2 = skaner.next().charAt(0);
        switch (odpowiedzi2) {
            case 'A':
                System.out.println("dobra odpowiedź");
                x = x + 1;
                break;
            case 'B':
                System.out.println("zła odpowiedź");
                break;
            case 'C':
                System.out.println("zła odpowiedź");
                break;
            case 'D':
                System.out.println("zła odpowiedź");
                break;
            default:
                System.out.println("Wprowadzono zły znak");
        }
        System.out.println("Pytanie 3: W języku staropolskim matka żony to teściowa, a matka męża to: \n" +
                "A)teściowa\n" +
                "B)świekra\n" +
                "C)zełwa\n" +
                "D)snecha" +
                "                 ");
        char odpowiedzi3 = skaner.next().charAt(0);
        switch (odpowiedzi3) {
            case 'A':
                System.out.println("zła odpowiedź");
                break;
            case 'B':
                System.out.println("dobra odpowiedź");
                x = x + 1;
                break;
            case 'C':
                System.out.println("zła odpowiedź");
                break;
            case 'D':
                System.out.println("zła odpowiedź");
                break;
            default:
                System.out.println("Wprowadzono zły znak");
        }
        System.out.println("Pytanie 4:Jakiego koloru jest czarna skrzynka w samolocie?\n" +
                "A)czarna\n" +
                "B)czerwona\n" +
                "C)pomarańczowa \n" +
                "D)szara" +
                "                 ");
        char odpowiedzi4 = skaner.next().charAt(0);
        switch (odpowiedzi4) {
            case 'A':
                System.out.println("zła odpowiedź");
                break;
            case 'B':
                System.out.println("zła odpowiedź");
                break;
            case 'C':
                System.out.println("dobra odpowiedź");
                x = x + 1;
                break;
            case 'D':
                System.out.println("zła odpowiedź");
                break;
            default:
                System.out.println("Wprowadzono zły znak");
        }
        System.out.println("Pytanie 5: Ilu synów Zygmunta III Wazy było królami Polski?\n" +
                "A)jeden\n" +
                "B)dwoch\n" +
                "C)trzech\n" +
                "D)żaden" +
                "                 ");
        char odpowiedzi5 = skaner.next().charAt(0);
        switch (odpowiedzi5) {
            case 'A':
                System.out.println("zła odpowiedź");
                break;
            case 'B':
                System.out.println("dobra odpowiedź");
                x = x + 1;
                break;
            case 'C':
                System.out.println("zła odpowiedź");
                break;
            case 'D':
                System.out.println("zła odpowiedź");
                break;
            default:
                System.out.println("Wprowadzono zły znak");
        }
        System.out.println("Pytanie 6:  Gdzie odbędą się tegoroczne letnie igrzyska olimpijskie, jeśli ich nie odwołają albo nie przeniosą z powodu epidemii koronawirusa?\n" +
                "A)w Nowym Jorku\n" +
                "B)w Tokio\n" +
                "C)w Genewie\n" +
                "D)w Melbourne" +
                "                 ");
        char odpowiedzi6 = skaner.next().charAt(0);
        switch (odpowiedzi6) {
            case 'A':
                System.out.println("zła odpowiedź");
                break;
            case 'B':
                System.out.println("dobra odpowiedź");
                x = x + 1;
                break;
            case 'C':
                System.out.println("zła odpowiedź");
                break;
            case 'D':
                System.out.println("zła odpowiedź");
                break;
            default:
                System.out.println("Wprowadzono zły znak");
        }
        System.out.println("Pytanie 7: Keith Richards jest legendarnym gitarzystą:\n" +
                "A)rolling stones\n" +
                "B)pink floyd\n" +
                "C)the who\n" +
                "D)the clash" +
                "                 ");
        char odpowiedzi7 = skaner.next().charAt(0);
        switch (odpowiedzi7) {
            case 'A':
                System.out.println("dobra odpowiedź");
                x = x + 1;
                break;
            case 'B':
                System.out.println("zła odpowiedź");
                break;
            case 'C':
                System.out.println("zła odpowiedź");
                break;
            case 'D':
                System.out.println("zła odpowiedź");
                break;
            default:
                System.out.println("Wprowadzono zły znak");
        }
        System.out.println("Pytanie 8: Słynna rzeźba dyskobola została stworzona przez:\n" +
                "A)fidiasza\n" +
                "B)myrona\n" +
                "C)hageladesa\n" +
                "D)polikleta" +
                "                 ");
        char odpowiedzi8 = skaner.next().charAt(0);
        switch (odpowiedzi8) {
            case 'A':
                System.out.println("zła odpowiedź");
                break;
            case 'B':
                System.out.println("dobra odpowiedź");
                x = x + 1;
                break;
            case 'C':
                System.out.println("zła odpowiedź");
                break;
            case 'D':
                System.out.println("zła odpowiedź");
                break;
            default:
                System.out.println("Wprowadzono zły znak");
        }
        System.out.println("Pytanie 9:  W którym województwie leży miasto Swarzędz, słynne z zakładów stolarskich?\n" +
                "A)Małopolskim\n" +
                "B)Podkarpackim\n" +
                "C)świętokrzyskim\n" +
                "D)Wielkopolskim" +
                "                 ");
        char odpowiedzi9 = skaner.next().charAt(0);
        switch (odpowiedzi9) {
            case 'A':
                System.out.println("zła odpowiedź");
                break;
            case 'B':
                System.out.println("zła odpowiedź");
                break;
            case 'C':
                System.out.println("zła odpowiedź");
                break;
            case 'D':
                System.out.println("dobra odpowiedź");
                x = x + 1;
                break;
            default:
                System.out.println("Wprowadzono zły znak");
        }
        System.out.println("Pytanie 10: Rzeka Tag przepływa przez jedną ze stolic państw Unii Europejskiej. Przez którą?\n" +
                "A)Madryt\n" +
                "B)Bruksele\n" +
                "C)Wiedeń\n" +
                "D)Lizbonę" +
                "                 ");
        char odpowiedzi10 = skaner.next().charAt(0);
        switch (odpowiedzi10) {
            case 'A':
                System.out.println("zła odpowiedź");
                break;
            case 'B':
                System.out.println("zła odpowiedź");
                break;
            case 'C':
                System.out.println("zła odpowiedź");
                break;
            case 'D':
                System.out.println("dobra odpowiedź");
                x = x + 1;
                break;
            default:
                System.out.println("Wprowadzono zły znak");
        }
        System.out.println("Pytanie 11: Morze Martwe to leżące na terenie Izraela:\n" +
                "A)morze\n" +
                "B)kanał\n" +
                "C)jezioro\n" +
                "D)zbiornik retencyjny" +
                "                 ");
        char odpowiedzi11 = skaner.next().charAt(0);
        switch (odpowiedzi11) {
            case 'A':
                System.out.println("zła odpowiedź");
                break;
            case 'B':
                System.out.println("zła odpowiedź");
                break;
            case 'C':
                System.out.println("dobra odpowiedź");
                x = x + 1;
                break;
            case 'D':
                System.out.println("zła odpowiedź");
                break;
            default:
                System.out.println("Wprowadzono zły znak");
        }
        System.out.println("Pytanie 12: Gdzie jest kassadin?\n     " +
                "a)na topie\n" +
                "B)na midzie\n" +
                "C)na bocie\n" +
                "D)w jungli");
        char odpowiedzi12 = skaner.next().charAt(0);
        switch (odpowiedzi12) {
            case 'A':
                System.out.println("dobra odpowiedź");
                x = x + 1;
                break;
            case 'B':
                System.out.println("zła odpowiedź");
                break;
            case 'C':
                System.out.println("zła odpowiedź");
                break;
            case 'D':
                System.out.println("zła odpowiedź");
                break;
            default:
                System.out.println("Wprowadzono zły znak");
        }
        System.out.println("Pytanie 13: Znana z olimpiad ortograficznych gżegżółka jest ludową nazwą:\n" +
                "A)kruka\n" +
                "B)wrony\n" +
                "C)sójki\n" +
                "D)kukułki" +
                "                 ");
        char odpowiedzi13 = skaner.next().charAt(0);
        switch (odpowiedzi13) {
            case 'A':
                System.out.println("zła odpowiedź");
                break;
            case 'B':
                System.out.println("zła odpowiedź");
                break;
            case 'C':
                System.out.println("zła odpowiedź");
                break;
            case 'D':
                System.out.println("dobra odpowiedź");
                x = x + 1;
                break;
            default:
                System.out.println("Wprowadzono zły znak");
        }
        System.out.println("Pytanie 14:      " +
                "                 ");
        char odpowiedzi14 = skaner.next().charAt(0);
        switch (odpowiedzi14) {
            case 'A':
                System.out.println("zła odpowiedź");
                break;
            case 'B':
                System.out.println("zła odpowiedź");
                break;
            case 'C':
                System.out.println("zła odpowiedź");
                break;
            case 'D':
                System.out.println("dobra odpowiedź");
                x = x + 1;
                break;
            default:
                System.out.println("Wprowadzono zły znak");
        }
        System.out.println("Pytanie 15: Co ma chronić przed zimnem mufka?\n" +
                "A)Stopy\n" +
                "B)Dłonie\n" +
                "C)Głowe\n" +
                "D)Uszy     " +
                "                 ");
        char odpowiedzi15 = skaner.next().charAt(0);
        switch (odpowiedzi15) {
            case 'A':
                System.out.println("zła odpowiedź");
                break;
            case 'B':
                System.out.println("dobra odpowiedź");
                x = x + 1;
                break;
            case 'C':
                System.out.println("zła odpowiedź");
                break;
            case 'D':
                System.out.println("zła odpowiedź");
                break;
            default:
                System.out.println("Wprowadzono zły znak");
        }
        System.out.println("Pytanie 16: Emiliano Zapata był przywódcą chłopskiej partyzantki w:\n" +
                "A)brazylii\n" +
                "B)argentynie\n" +
                "C)meksyku\n" +
                "D)na kubie" +
                "                 ");
        char odpowiedzi16 = skaner.next().charAt(0);
        switch (odpowiedzi16) {
            case 'A':
                System.out.println("zła odpowiedź");
                break;
            case 'B':
                System.out.println("zła odpowiedź");
                break;
            case 'C':
                System.out.println("dobra odpowiedź");
                x = x + 1;
                break;
            case 'D':
                System.out.println("zła odpowiedź");
                break;
            default:
                System.out.println("Wprowadzono zły znak");
        }
        System.out.println("Pytanie 17: Niedźwiedziówka to rodzaj:\n" +
                "a)niedźwiedzia\n" +
                "b)delfina\n" +
                "c)pandy \n" +
                "d)motyla" +
                "                 ");
        char odpowiedzi17 = skaner.next().charAt(0);
        switch (odpowiedzi17) {
            case 'A':
                System.out.println("zła odpowiedź");
                break;
            case 'B':
                System.out.println("zła odpowiedź");
                break;
            case 'C':
                System.out.println("zła odpowiedź");
                break;
            case 'D':
                System.out.println("dobra odpowiedź");
                x = x + 1;
                break;
            default:
                System.out.println("Wprowadzono zły znak");
        }
        System.out.println("Pytanie 18: Piryt-Którego pierwiastka jest on minerałem?\n" +
                "A)miedzi\n" +
                "B)złota\n" +
                "C)żelaza\n" +
                "D)manganu" +
                "                 ");
        char odpowiedzi18 = skaner.next().charAt(0);
        switch (odpowiedzi18) {
            case 'A':
                System.out.println("zła odpowiedź");
                break;
            case 'B':
                System.out.println("zła odpowiedź");
                break;
            case 'C':
                System.out.println("dobra odpowiedź");
                x = x + 1;
                break;
            case 'D':
                System.out.println("zła odpowiedź");
                break;
            default:
                System.out.println("Wprowadzono zły znak");
        }
        System.out.println("Pytanie 19: Jaki będzie wynik tego równania: 12-4/2+2*7-11 =\n" +
                "A)35\n" +
                "B)13\n" +
                "C)7\n" +
                "D)0" +
                "                 ");
        char odpowiedzi19 = skaner.next().charAt(0);
        switch (odpowiedzi19) {
            case 'A':
                System.out.println("zła odpowiedź");
                break;
            case 'B':
                System.out.println("dobra odpowiedź");
                x = x + 1;
                break;
            case 'C':
                System.out.println("zła odpowiedź");
                break;
            case 'D':
                System.out.println("zła odpowiedź");
                break;
            default:
                System.out.println("Wprowadzono zły znak");
        }
        System.out.println("Pytanie 20: Słynna piłkarska drużyna Arsenalu ma swoją siedzibę w:\n" +
                "A)manchesterze\n" +
                "B)glasgow\n" +
                "C)londynie\n" +
                "D)liverpoolu" +
                "                 ");
        char odpowiedzi20 = skaner.next().charAt(0);
        switch (odpowiedzi20) {
            case 'A':
                System.out.println("zła odpowiedź");
                break;
            case 'B':
                System.out.println("zła odpowiedź");
                break;
            case 'C':
                System.out.println("dobra odpowiedź");
                x = x + 1;
                break;
            case 'D':
                System.out.println("zła odpowiedź");
                break;
            default:
                System.out.println("Wprowadzono zły znak");
        }
        System.out.println("Pytanie 21: Która substancja NIE jest materiałem wybuchowym?\n" +
                "a)Karbonit\n" +
                "b)Cyjanowodór\n" +
                "c)Dynamit\n" +
                "d)Nitrogliceryna" +
                "                 ");
        char odpowiedzi21 = skaner.next().charAt(0);
        switch (odpowiedzi21) {
            case 'A':
                System.out.println("zła odpowiedź");
                break;
            case 'B':
                System.out.println("dobra odpowiedź");
                x = x + 1;
                break;
            case 'C':
                System.out.println("zła odpowiedź");
                break;
            case 'D':
                System.out.println("zła odpowiedź");
                break;
            default:
                System.out.println("Wprowadzono zły znak");
        }
        System.out.println("Pytanie 22: Z iloma państwami graniczy Polska?\n" +
                "A.7\n" +
                "B.8\n" +
                "C.9\n" +
                "D.6" +
                "                 ");
        char odpowiedzi22 = skaner.next().charAt(0);
        switch (odpowiedzi22) {
            case 'A':
                System.out.println("dobra odpowiedź");
                x = x + 1;
                break;
            case 'B':
                System.out.println("zła odpowiedź");
                break;
            case 'C':
                System.out.println("zła odpowiedź");
                break;
            case 'D':
                System.out.println("zła odpowiedź");
                break;
            default:
                System.out.println("Wprowadzono zły znak");
        }
        System.out.println("Pytanie 23: Rzymski bóg, opiekun sztuki lekarskiej, to: \n" +
                "a)Eskulap\n" +
                "b)Honor\n" +
                "c)Virtus\n" +
                "d)Asklepios" +
                "                 ");
        char odpowiedzi23 = skaner.next().charAt(0);
        switch (odpowiedzi23) {
            case 'A':
                System.out.println("dobra odpowiedź");
                x = x + 1;
                break;
            case 'B':
                System.out.println("zła odpowiedź");
                break;
            case 'C':
                System.out.println("zła odpowiedź");
                break;
            case 'D':
                System.out.println("zła odpowiedź");
                break;
            default:
                System.out.println("Wprowadzono zły znak");
        }
        System.out.println("Pytanie 24: Dokończ tytuł słynnego westernu: \"Dobry, zły i...\"\n" +
                "A.brzydki\n" +
                "B.głupi\n" +
                "C.obojetny\n" +
                "D.gruby" +
                "                 ");
        char odpowiedzi24 = skaner.next().charAt(0);
        switch (odpowiedzi24) {
            case 'A':
                System.out.println("dobra odpowiedź");
                x = x + 1;
                break;
            case 'B':
                System.out.println("zła odpowiedź");
                break;
            case 'C':
                System.out.println("zła odpowiedź");
                break;
            case 'D':
                System.out.println("zła odpowiedź");
                break;
            default:
                System.out.println("Wprowadzono zły znak");
        }
        System.out.println("Pytanie 25: Prosta w geometrii...\n" +
                "A.ma początek, ale nie ma końca\n" +
                "B.ma koniec, ale nie ma początku\n" +
                "C.nie ma początku oraz nie ma końca\n" +
                "D.jest prosta" +
                "                 ");
        char odpowiedzi25 = skaner.next().charAt(0);
        switch (odpowiedzi25) {
            case 'A':
                System.out.println("zła odpowiedź");
                break;
            case 'B':
                System.out.println("zła odpowiedź");
                break;
            case 'C':
                System.out.println("dobra odpowiedź");
                x = x + 1;
                break;
            case 'D':
                System.out.println("zła odpowiedź");
                break;
            default:
                System.out.println("Wprowadzono zły znak");
        }
        System.out.println("Pytanie 26: Data terrorystycznego ataku na WTC to:\n" +
                "A.11 sierpnia 2001 r.\n" +
                "B.11 września 2001 r.\n" +
                "\n" +
                "C.11 października 2001 r.\n" +
                "D.11 listopad 2001 r." +
                "                 ");
        char odpowiedzi26 = skaner.next().charAt(0);
        switch (odpowiedzi26) {
            case 'A':
                System.out.println("zła odpowiedź");
                break;
            case 'B':
                System.out.println("dobra odpowiedź");
                x = x + 1;
                break;
            case 'C':
                System.out.println("zła odpowiedź");
                break;
            case 'D':
                System.out.println("zła odpowiedź");
                break;
            default:
                System.out.println("Wprowadzono zły znak");
        }
        System.out.println("Pytanie 27: Pumba z filmu \"Król Lew\" był:\n" +
                "A.guźcem\n" +
                "B.lwem\n" +
                "C.surykatką\n" +
                "D.gruby" +
                "                 ");
        char odpowiedzi27 = skaner.next().charAt(0);
        switch (odpowiedzi27) {
            case 'A':
                System.out.println("dobra odpowiedź");
                x = x + 1;
                break;
            case 'B':
                System.out.println("zła odpowiedź");
                break;
            case 'C':
                System.out.println("zła odpowiedź");
                break;
            case 'D':
                System.out.println("zła odpowiedź");
                break;
            default:
                System.out.println("Wprowadzono zły znak");
        }
        System.out.println("Pytanie 28: W której wsi rozgrywają się losy bohaterów z serialu \"Ranczo\" ?\n" +
                "a)Stara wieś\n" +
                "b)Nowa wieś\n" +
                "c)Wiolkowyje\n" +
                "d)Lipany" +
                "                 ");
        char odpowiedzi28 = skaner.next().charAt(0);
        switch (odpowiedzi28) {
            case 'A':
                System.out.println("zła odpowiedź");
                break;
            case 'B':
                System.out.println("zła odpowiedź");
                break;
            case 'C':
                System.out.println("dobra odpowiedź");
                x = x + 1;
                break;
            case 'D':
                System.out.println("zła odpowiedź");
                break;
            default:
                System.out.println("Wprowadzono zły znak");
        }
        System.out.println("Pytanie 29: Z kim graliśmy słynny \"mecz na wodzie\" w półfinale Mistrzostw Świata w Piłce Nożnej 1974?\n" +
                "A)z Brazylią\n" +
                "B)z RFN\n" +
                "C)z Holandią\n" +
                "D)z długim polem     " +
                "                 ");
        char odpowiedzi29 = skaner.next().charAt(0);
        switch (odpowiedzi29) {
            case 'A':
                System.out.println("zła odpowiedź");
                break;
            case 'B':
                System.out.println("dobra odpowiedź");
                x = x + 1;
                break;
            case 'C':
                System.out.println("zła odpowiedź");
                break;
            case 'D':
                System.out.println("zła odpowiedź");
                break;
            default:
                System.out.println("Wprowadzono zły znak");
        }
        System.out.println("Pytanie 30: Największy ocean na Ziemi to?\n" +
                "A)Ocean Atlantycki\n" +
                "B)Ocean Spokojny\n" +
                "C)Ocean Indyjski\n" +
                "D)Ocean Wiejski" +
                "                 ");
        char odpowiedzi30 = skaner.next().charAt(0);
        switch (odpowiedzi30) {
            case 'A':
                System.out.println("zła odpowiedź");
                break;
            case 'B':
                System.out.println("dobra odpowiedź");
                x = x + 1;
                break;
            case 'C':
                System.out.println("zła odpowiedź");
                break;
            case 'D':
                System.out.println("zła odpowiedź");
                break;
            default:
                System.out.println("Wprowadzono zły znak");
        }
        System.out.println("Dobre odpowiedzi: "+x+"/30");

    }
}
