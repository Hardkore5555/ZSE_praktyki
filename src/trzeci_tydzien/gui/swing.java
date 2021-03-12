package trzeci_tydzien.gui;

import javax.swing.JFrame;

public class swing extends JFrame{
    public swing(){
        super("Witaj świecie");//setTitle("Witaj świecie");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds((1920/2)-200,(1080/2),400,200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new swing();
    }
}
