package H8;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht3 extends Applet {
double sommetje;
    TextField tekstvak;
    Button Knop;

    public void init(){
        tekstvak = new TextField("", 30);
        Knop = new Button ("Ok");
        KnopListener Kl = new KnopListener();
        Knop.addActionListener ( Kl );
        add (Knop);
        add (tekstvak);
    }

    public void paint (Graphics g) {
        g.drawString("Type in het vakje een bedrag" + " En druk op enter om 21% btw bij te rekenen", 50, 50);
        g.drawString("De price is " + sommetje, 10, 125);
    }

    class KnopListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
double subsommetje = Double.parseDouble(tekstvak.getText());
sommetje = round(subsommetje * 1.21, 2 );
repaint();

        }

    }
    public static double round(double Waarde, int plaatzen){
        if (plaatzen < 0) throw new IllegalArgumentException();
        long Factor = (long) Math.pow(10, plaatzen);
        Waarde = Waarde * Factor;
        long tmp = Math.round(Waarde);
        return (double) tmp/ Factor;


    }
}
