package trzeci_tydzien.gui;

import javax.swing.*;
import java.awt.*;
public class swing extends JFrame{
    private JPanel panel;
    private JLabel tekst;
    private JTextArea tekstfield;

    public swing(){
        super("Witaj świecie");//setTitle("Witaj świecie");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds((1920/2)-200,(1080/2),400,200);
        panel = new JPanel();
        panel.setLayout(null);
        add(panel);
        tekst = new JLabel("Zwykły tekst");
        tekst.setBounds(10,10,200,25);
        tekst.setFont(new Font("Verdana",(Font.BOLD|Font.ITALIC),18));
        tekst.setForeground(Color.blue);
        panel.add(tekst);
        tekstfield = new JTextArea();
        tekstfield.setBounds(10,45,150,60);
        panel.add(tekstfield);


        setVisible(true);
    }

    public static void main(String[] args) {
        new swing();
    }
}
