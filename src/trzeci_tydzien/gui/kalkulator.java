package trzeci_tydzien.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class kalkulator extends JFrame {

    private JPanel panelLiczb;
    private JPanel panelFunkcji;
    private JPanel panelWyniku;
    private JLabel wynik;
    private JLabel tekstliczbaA;
    private JLabel tekstliczbaB;
    private JTextArea poleLiczbaA;
    private JTextArea poleLiczbaB;
    private JButton przyciskDodaj;
    private JButton przyciskOdejmij;
    private JButton przyciskmnoz;
    private JButton przyciskdziel;
    private JButton przycisksumapotęg;

    kalkulator() {
        setTitle("Kalkulator prosty");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panelLiczb = new JPanel();
        panelFunkcji = new JPanel();
        panelWyniku = new JPanel();
        wynik = new JLabel("");
        tekstliczbaA = new JLabel("Liczba A");
        tekstliczbaB = new JLabel("Liczba B");
        poleLiczbaA = new JTextArea("");
        poleLiczbaB = new JTextArea("");
        przyciskDodaj = new JButton("Suma");
        przyciskOdejmij = new JButton("Różnica");
        przyciskmnoz = new JButton("Wynik mnożenia");
        przyciskdziel = new JButton("Wynik dzielenia");
        przycisksumapotęg = new JButton("Suma potęg");
        add(panelLiczb);
        panelLiczb.add(tekstliczbaA);
        panelLiczb.add(poleLiczbaA);
        panelLiczb.add(tekstliczbaB);
        panelLiczb.add(poleLiczbaB);
        panelFunkcji.add(przyciskDodaj);
        panelFunkcji.add(przyciskOdejmij);
        panelFunkcji.add(przyciskmnoz);
        panelFunkcji.add(przyciskdziel);
        panelFunkcji.add(przycisksumapotęg);
        add(panelWyniku);
        panelWyniku.add(wynik);
        panelLiczb.setLayout(new GridLayout(4, 1));
        getContentPane().add(BorderLayout.NORTH, panelLiczb);
        getContentPane().add(BorderLayout.CENTER, panelWyniku);
        getContentPane().add(BorderLayout.SOUTH, panelFunkcji);
        setVisible(true);
        przyciskDodaj.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a = Double.parseDouble(poleLiczbaA.getText());
                double b = Double.parseDouble(poleLiczbaB.getText());
                double c= round(a+b,2);
                wynik.setText("Wynik= " +c);
            }
        });
        przyciskOdejmij.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a = Double.parseDouble(poleLiczbaA.getText());
                double b = Double.parseDouble(poleLiczbaB.getText());
                double c= round(a-b,2);
                wynik.setText("Wynik= " +c);
            }
        });
        przyciskmnoz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a = Double.parseDouble(poleLiczbaA.getText());
                double b = Double.parseDouble(poleLiczbaB.getText());
                double c= round(a*b,2);
                wynik.setText("Wynik= " +c);
            }
        });
        przyciskdziel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a = Double.parseDouble(poleLiczbaA.getText());
                double b = Double.parseDouble(poleLiczbaB.getText());
                double c= round(a/b,2);
                wynik.setText("Wynik= " +c);
            }
        });
        przycisksumapotęg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a = Double.parseDouble(poleLiczbaA.getText());
                double b = Double.parseDouble(poleLiczbaB.getText());
                double c= round((a*a)+(b*b),2);
                wynik.setText("Wynik= " +c);
            }
        });
    }

    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();
        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp/factor;
    }

    public static void main(String[] args) {
        kalkulator calc = new kalkulator();
    }


}














