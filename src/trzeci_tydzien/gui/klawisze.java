package trzeci_tydzien.gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class klawisze {
    public static void main(String[] args) {
        JFrame ablak = new JFrame("Okno zmieniające rozmiar");
        ablak.setVisible(true);
        final int[] x = {400};
        final int[] y = {400};
        ablak.setSize(new Dimension(x[0],y[0]));
        ablak.setFocusable(true);
        ablak.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }




}
