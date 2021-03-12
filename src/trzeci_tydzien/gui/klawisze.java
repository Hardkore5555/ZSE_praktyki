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

        ablak.addKeyListener(new KeyAdapter() {
            @Override
            public  void keyPressed(KeyEvent e){
                if (e.getKeyCode() == KeyEvent.VK_UP){
                    System.out.println("Jedziemyw  górę");
                    int tempx = x [0];
                    y[0] = y[0]-5;
                    int tempy = y[0];
                    ablak.setSize(new Dimension(tempx,tempy));
                }
            }
        });
        JPanel contentPane = (JPanel) ablak.getContentPane();
        int condition = JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT;
        InputMap inputMap = contentPane.getInputMap();
        ActionMap actionMap = contentPane.getActionMap();

    }




}
