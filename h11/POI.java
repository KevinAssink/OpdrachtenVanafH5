package h11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class POI extends Applet {
    Button Knop1;
    TextField tekst1;
    int s;


    public void init(){
        Knop1 = new Button ("Ok");
        KnopListener Kl = new KnopListener();
        Knop1.addActionListener (Kl);
        tekst1 = new TextField(20);
        add(tekst1);
        add(Knop1);
    }

    public void paint (Graphics g){
        int y = 60;
        for (int a = 0; a <= 10; a++){
            g.drawString( a + "x" + a + " = " + a * s, 75,y);
            y = y + 20;
        }
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String p = tekst1.getText();
            s = Integer.parseInt(p);
            repaint();

        }
    }
}