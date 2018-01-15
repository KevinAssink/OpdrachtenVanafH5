package h11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class POII extends Applet{
    Button Kay;
    int Teller;
    int No;


    public void init(){
        Kay = new Button("ok");
        ListenerKay Kl = new ListenerKay();
        Kay.addActionListener( Kl );
        add(Kay);

    }

    public void paint (Graphics g){
        int y = 50;
        for (int Teller = 0; Teller < 11 ; Teller++) {
            g.drawString( Teller + "x" + Teller + " = " + Teller * No, 70, y);
            y = y + 20;
        }
    }

    class ListenerKay implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            do {
                No++;
            } while (No > 11);
        if (No == 11){
            No = 1;
        }
        repaint();
        }
    }
}
